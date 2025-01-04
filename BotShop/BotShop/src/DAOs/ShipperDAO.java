package DAOs;

import ConnectDatabase.MyConnect;
import Model.Shipper;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ShipperDAO {

    Connection conn = MyConnect.getConnection();
    PreparedStatement ps;
    Statement st;
    ResultSet rs;

    public ShipperDAO() {
    }

    // Get "Shipper" table max row
    public int getMaxRox() {
        int row = 0;
        try {
            st = conn.createStatement();
            rs = st.executeQuery("SELECT MAX(SID) FROM Shipper");
            while (rs.next()) {
                row = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ShipperDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return row + 1;
    }

    // Check "Name" already exists
    public boolean isShipperNameExist(String name) {
        try {
            ps = conn.prepareStatement("SELECT * FROM Shipper WHERE SName = ?");
            ps.setString(1, name);
            rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ShipperDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    // Check "Email" already exists
    public boolean isEmailExist(String email) {
        try {
            ps = conn.prepareStatement("SELECT * FROM Shipper WHERE SEmail = ?");
            ps.setString(1, email);
            rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ShipperDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    // Check "Phone Number" already exists
    public boolean isPhoneNumberExist(String phone) {
        try {
            ps = conn.prepareStatement("SELECT * FROM Shipper WHERE SPhone = ?");
            ps.setString(1, phone);
            rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ShipperDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    // insert data into "Shipper" table
    public boolean insert(int id, String shipperName, String email, String pass, String phone,
            String address, String country) {
        String sql = "INSERT INTO Shipper VALUES(?,?,?,?,?,?,?)";
        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.setString(2, shipperName);
            ps.setString(3, email);
            ps.setString(4, pass);
            ps.setString(5, phone);
            ps.setString(6, address);
            ps.setString(7, country);
            if (ps.executeUpdate() > 0) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ShipperDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    // get Shipper username by email
    public String getShipperName(String email) {
        String sql = "SELECT SName FROM Shipper WHERE SEmail = ?";
        String shipperName = "";
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, email);
            rs = ps.executeQuery();
            while (rs.next()) {
                shipperName = rs.getString("SName");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ShipperDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return shipperName;
    }
    
    // get Shipper username by name
    public String getShipperName(int shipperID) {
        String sql = "SELECT SName FROM Shipper WHERE SID = ?";
        String shipperName = "";
        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1, shipperID);
            rs = ps.executeQuery();
            while (rs.next()) {
                shipperName = rs.getString("SName");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ShipperDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return shipperName;
    }

    public ArrayList<Shipper> getAllShippers() {
        ArrayList<Shipper> result = new ArrayList<>();
        String sql = "SELECT * FROM Shipper ORDER BY SID";
        try {
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                int SID = rs.getInt(1);
                String SName = rs.getString(2);
                String SEmail = rs.getString(3);
                String SPassword = rs.getString(4);
                String SPhone = rs.getString(5);
                String SAddress = rs.getString(6);
                String SCountry = rs.getString(7);
                Shipper s = new Shipper(SID, SName, SEmail, SPassword, SPhone, SAddress, SCountry);
                result.add(s);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ShipperDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

    // Update "Shipper" datas
    public boolean update(int id, String shipperName, String email, String pass, String phone,
            String address, String country) {
        String sql = "UPDATE Shipper SET SName = ?, SEmail = ?, SPassword = ?, SPhone = ?, SAddress = ?, SCountry = ? WHERE SID = ?";
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, shipperName);
            ps.setString(2, email);
            ps.setString(3, pass);
            ps.setString(4, phone);
            ps.setString(5, address);
            ps.setString(6, country);
            ps.setInt(7, id);
            if (ps.executeUpdate() > 0) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ShipperDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean updateWithoutPassword(int id, String shipperName, String email, String phone, String address, String country) {
        String sql = "UPDATE Shipper SET SName = ?, SEmail = ?, SPhone = ?, SAddress = ?, SCountry = ? WHERE SID = ?";
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, shipperName);
            ps.setString(2, email);
            ps.setString(3, phone);
            ps.setString(4, address);
            ps.setString(5, country);
            ps.setInt(6, id);
            if (ps.executeUpdate() > 0) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ShipperDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    // Delete Shipper
    public boolean delete(int id) {
            try {
                ps = conn.prepareStatement("DELETE FROM Shipper WHERE SID = ?");
                ps.setInt(1, id);
                if (ps.executeUpdate() > 0) {
                    return true;
                }
            } catch (SQLException ex) {
                Logger.getLogger(ShipperDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        return false;
    }

    // Get "Shipper ID" by Email
    public int getShipperID(String email) {
        int id = 0;
        try {
            ps = conn.prepareStatement("SELECT SID FROM Shipper WHERE SEmail = ?");
            ps.setString(1, email);
            rs = ps.executeQuery();
            if (rs.next()) {
                id = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ShipperDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }
    
    // Get "Shipper ID" by Name
    public int getShipperIDByName(String name) {
        int id = 0;
        try {
            ps = conn.prepareStatement("SELECT SID FROM Shipper WHERE SName = ?");
            ps.setString(1, name);
            rs = ps.executeQuery();
            if (rs.next()) {
                id = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ShipperDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }

    // Get "Shipper" data
    public String[] getShipperValue(int shipperID) {
        String[] value = new String[7];
        try {
            ps = conn.prepareStatement("SELECT * FROM Shipper WHERE SID = ?");
            ps.setInt(1, shipperID);
            rs = ps.executeQuery();
            if (rs.next()) {
                value[0] = rs.getString(1);
                value[1] = rs.getString(2);
                value[2] = rs.getString(3);
                value[3] = rs.getString(4);
                value[4] = rs.getString(5);
                value[5] = rs.getString(6);
                value[6] = rs.getString(7);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ShipperDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return value;
    }

    public int countShippers() {
        int count = 0;
        String sql = "SELECT COUNT(*) AS Total FROM Shipper";
        try {
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {
                count = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ShipperDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
    }

    public String[] getNameShippers() {
        String[] shippers = new String[countShippers()];
        try {
            st = conn.createStatement();
            rs = st.executeQuery("SELECT * FROM Shipper");
            int i = 0;
            while (rs.next()) {
                shippers[i] = rs.getString("SName");
                i++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ShipperDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return shippers;
    }
}
