package DAOs;

import ConnectDatabase.MyConnect;
import Model.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProductDAO {

    Connection conn = MyConnect.getConnection();
    PreparedStatement ps;
    Statement st;
    ResultSet rs;
    
    public ProductDAO() {
    }
    
    // Get Product table max row
    public int getMaxRox() {
        int row = 0;
        try {
            st = conn.createStatement();
            rs = st.executeQuery("SELECT MAX(PID) FROM Product");
            while(rs.next()) {
                row = rs.getInt(1);
            }
            } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return row + 1;
    }
    
    // Get Product Name by Product ID
    public String getProductName(int productID) {
        String result = "";
        try {
            String sql = "SELECT PName FROM Product WHERE PID = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, productID);
            rs = ps.executeQuery();
            if(rs.next()) {
                result = rs.getString(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
    
    public int countCategories() {
        int total = 0;
        try {
            st = conn.createStatement();
            rs = st.executeQuery("SELECT COUNT(*) AS 'Total' FROM Category");
            if(rs.next()) {
                total = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return total;
    }
    
    // Get All Categories
    public String[] getCategories() {
        String[] categories = new String[countCategories()];
        try {
            st = conn.createStatement();
            rs = st.executeQuery("SELECT * FROM Category");
            int i = 0;
            while(rs.next()) {
                categories[i] = rs.getString(2);
                i++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return categories;
    }
    
    // Check product ID is exist
    public boolean isProductIdExists(int id) {
        String sql = "SELECT * FROM Product WHERE PID = ?";
        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if(rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    // Check product and Category exist
    public boolean isProAndCatExists(String pro, int categoryID) {
        String sql = "SELECT * FROM Product WHERE PName = ? AND CID = ?";
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, pro);
            ps.setInt(2, categoryID);
            rs = ps.executeQuery();
            if(rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    // insert data into "Product" table
    public boolean insert(int id, String pname, int CategoryID, int quantity, double price) 
    {
        String sql = "INSERT INTO Product VALUES(?,?,?, ?, ?)";
        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.setString(2, pname);
            ps.setInt(3, CategoryID);
            ps.setInt(4, quantity);
            ps.setDouble(5, price);
            if(ps.executeUpdate() > 0) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    // Update "Product" datas
    public boolean update(int id, String pname, int categoryID, int quantity, double price) 
    {
        String sql = "UPDATE Product SET PName = ?, CID = ?, PQuantity = ?, PPrice = ? WHERE PID = ?";
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, pname);
            ps.setInt(2, categoryID);
            ps.setInt(3, quantity);
            ps.setDouble(4, price);
            ps.setInt(5, id);
            if(ps.executeUpdate() > 0) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    // Delete Product
    public boolean delete(int id) {
        try {
            ps = conn.prepareStatement("DELETE FROM Product WHERE PID = ?");
            ps.setInt(1, id);
            if (ps.executeUpdate() > 0) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public ArrayList<Product> getAllProducts() {
        ArrayList<Product> result = new ArrayList<>();
        String sql = "SELECT * FROM Product ORDER BY PID";
        try {
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()) {
                int PID = rs.getInt("PID");
                String PName = rs.getString("PName");
                int CategoryID = rs.getInt("CID");
                int quantity = rs.getInt("PQuantity");
                double price = rs.getDouble("PPrice");
                Product p = new Product(PID, PName, CategoryID, quantity, price);
                result.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
}
