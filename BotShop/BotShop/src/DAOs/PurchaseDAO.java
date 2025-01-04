package DAOs;

import ConnectDatabase.MyConnect;
import Model.Purchase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class PurchaseDAO {
    
    Connection conn = MyConnect.getConnection();
    PreparedStatement ps;
    Statement st;
    ResultSet rs;
    
    public PurchaseDAO() {
    }
    
    // Get Puchase table max row
    public int getMaxRox() {
        int row = 0;
        try {
            st = conn.createStatement();
            rs = st.executeQuery("SELECT MAX(ID) FROM Purchase");
            while(rs.next()) {
                row = rs.getInt(1);
            }
            } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return row + 1;
    }
    
    // Get "User" value
    public String[] getUserValue(String email) {
        String[] value = new String[5];
        String sql = "SELECT UID, UName, UPhone, UAddress, UCountry FROM [User] WHERE UEmail = ?";
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, email);
            rs = ps.executeQuery();
            if(rs.next()) {
                value[0] = rs.getString(1);
                value[1] = rs.getString(2);
                value[2] = rs.getString(3);
                value[3] = rs.getString(4);
                value[4] = rs.getString(5);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PurchaseDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return value;
    }
    
    // Insert data into "Purchase" table
    public boolean insert(int id, int userID, int productID, int quantity, double price,
                        String pdate, String rdate, int shipperID, String status) {
        String sql = "INSERT INTO Purchase(ID, UserID, ProductID, Quantity, Price, p_date"
                + ", ReceivedDate, ShipperID, Status) "
                + "VALUES(?,?,?,?,?,?,?,?,?)";
        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1,id);
            ps.setInt(2, userID);
            ps.setInt(3, productID);
            ps.setInt(4, quantity);
            ps.setDouble(5, price);
            ps.setString(6, pdate);
            ps.setString(7, rdate);
            ps.setInt(8, shipperID);
            ps.setString(9, status);
            if(ps.executeUpdate() > 0) {
                return true;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(PurchaseDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    // get Product quantity
    public int getQuantity(int pid) {
        int qty = 0;
        try {
            
            st = conn.createStatement();
            rs = st.executeQuery("SELECT PQuantity FROM Product WHERE PID = "+pid+"");
            if(rs.next()) {
                qty = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PurchaseDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return qty;
    }
    
    // update quantity of Product
    public void quantityUpdate(int pid, int qty) {
        String sql = "UPDATE Product SET PQuantity = ? WHERE PID = ?";
        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1, qty);
            ps.setInt(2, pid);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PurchaseDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // get All Information about Purchase User
    public ArrayList<Purchase> getAllPurchaseOfUser(int UID) {
        ArrayList<Purchase> result = new ArrayList<>();
        String sql = "SELECT * FROM Purchase WHERE UserID = ? ORDER BY ID";
        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1, UID);
            rs = ps.executeQuery();
            while(rs.next()) {
                int purchaseID = rs.getInt("ID");
                int productID = rs.getInt("ProductID");
                int quantity = rs.getInt("Quantity");
                double price = rs.getDouble("Price");
                String purchaseDate = rs.getString("p_date");
                String receivedDate = rs.getString("ReceivedDate");
                int shipperID = rs.getInt("ShipperID");
                String status = rs.getString("Status");
                Purchase p = new Purchase(purchaseID, UID, productID, quantity, price, purchaseDate, receivedDate, shipperID, status);
                result.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PurchaseDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
    
    public boolean refund(int id) {
        String sql = "DELETE FROM Purchase WHERE Id = ?";
        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            if (ps.executeUpdate() > 0) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(PurchaseDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public ArrayList<Purchase> getPurchasesStatusIsPending() {
        ArrayList<Purchase> result = new ArrayList<>();
        String sql = "SELECT * FROM Purchase WHERE Status = 'Pending' ORDER BY ID DESC";
        try {
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()) {
                int purchaseID = rs.getInt("ID");
                int UserID = rs.getInt("UserID");
                int productID = rs.getInt("ProductID");
                int quantity = rs.getInt("Quantity");
                double price = rs.getDouble("Price");
                String purchaseDate = rs.getString("p_date");
                String receivedDate = rs.getString("ReceivedDate");
                int shipperID = rs.getInt("ShipperID");
                String status = rs.getString("Status");
                Purchase p = new Purchase(purchaseID, UserID, productID, quantity, price, purchaseDate, receivedDate, shipperID, status);
                result.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PurchaseDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
    
    public boolean setSuppStatus(int id, int shipperID ,String status) {
        String sql = "Update Purchase SET Status = ?, ShipperID = ? WHERE ID = ?";
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, status);
            ps.setInt(2, shipperID);
            ps.setInt(3, id);
            if(ps.executeUpdate()> 0) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(PurchaseDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public ArrayList<Purchase> getOnTheWayProductsOfShipper(int ShipperID) {
        ArrayList<Purchase> result = new ArrayList<>();
        String sql = "SELECT * FROM Purchase WHERE ShipperID = ? AND Status = 'On the way' ORDER BY ID DESC";
        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1, ShipperID);
            rs = ps.executeQuery();
            while(rs.next()) {
                int purchaseID = rs.getInt("ID");
                int UserID = rs.getInt("UserID");
                int productID = rs.getInt("ProductID");
                int quantity = rs.getInt("Quantity");
                double price = rs.getDouble("Price");
                String purchaseDate = rs.getString("p_date");
                String receivedDate = rs.getString("ReceivedDate");
                int shipperID = rs.getInt("ShipperID");
                String status = rs.getString("Status");
                Purchase p = new Purchase(purchaseID, UserID, productID, quantity, price, purchaseDate, receivedDate, shipperID, status);
                result.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PurchaseDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
    
    public ArrayList<Purchase> getDeliveredProduct() {
        ArrayList<Purchase> result = new ArrayList<>();
        String sql = "SELECT * FROM Purchase WHERE Status = 'Received' ORDER BY ID DESC";
        try {
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()) {
                int purchaseID = rs.getInt("ID");
                int UserID = rs.getInt("UserID");
                int productID = rs.getInt("ProductID");
                int quantity = rs.getInt("Quantity");
                double price = rs.getDouble("Price");
                String purchaseDate = rs.getString("p_date");
                String receivedDate = rs.getString("ReceivedDate");
                int shipperID = rs.getInt("ShipperID");
                String status = rs.getString("Status");
                Purchase p = new Purchase(purchaseID, UserID, productID, quantity, price, purchaseDate, receivedDate, shipperID, status);
                result.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PurchaseDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
    
    public ArrayList<Purchase> getShipperDeliveredProduct(int shipperID) {
        ArrayList<Purchase> result = new ArrayList<>();
        String sql = "SELECT * FROM Purchase WHERE ShipperID = ? AND Status = 'Received' ORDER BY ID DESC";
        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1, shipperID);
            rs = ps.executeQuery();
            while(rs.next()) {
                int purchaseID = rs.getInt("ID");
                int UserID = rs.getInt("UserID");
                int productID = rs.getInt("ProductID");
                int quantity = rs.getInt("Quantity");
                double price = rs.getDouble("Price");
                String purchaseDate = rs.getString("p_date");
                String receivedDate = rs.getString("ReceivedDate");
                String status = rs.getString("Status");
                Purchase p = new Purchase(purchaseID, UserID, productID, quantity, price, purchaseDate, receivedDate, shipperID, status);
                result.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PurchaseDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
    
    public boolean setDateStatus(int id, String rdate ,String status) {
        String sql = "Update Purchase SET ReceivedDate = ? , Status = ? WHERE ID = ?";
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, rdate);
            ps.setString(2, status);
            ps.setInt(3, id);
            if(ps.executeUpdate()> 0) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(PurchaseDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public void transaction(JTable table, String search) {
        String sql = "SELECT * FROM Purchase WHERE concat(ID, ProductID, UserID, ShipperID) LIKE ? AND Status = 'Received' ORDER BY ID DESC";
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, "%" + search + "%");
            rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            Object[] row;
            while(rs.next()) {
                row = new Object[8];
                row[0] = rs.getInt(1);
                row[1] = rs.getInt(2);
                row[2] = rs.getInt(5);
                row[3] = rs.getInt(7);
                row[4] = rs.getDouble(8);
                row[5] = rs.getDouble(9);;
                row[6] = rs.getString(12);
                row[7] = rs.getString(13);
                model.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PurchaseDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
