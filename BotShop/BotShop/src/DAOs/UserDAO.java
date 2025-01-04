package DAOs;

import ConnectDatabase.MyConnect;
import Model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserDAO {

    Connection conn = MyConnect.getConnection();
    PreparedStatement ps;
    Statement st;
    ResultSet rs;

    public UserDAO() {
    }

    // Get user table max row
    public int getMaxRox() {
        int row = 0;
        try {
            st = conn.createStatement();
            rs = st.executeQuery("SELECT MAX(UID) FROM [User]");
            while (rs.next()) {
                row = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return row + 1;
    }
    
    // get User name by User ID
    public String getUserName(int UID) {
        String sql = "SELECT UName FROM [User] WHERE UID = ?";
        String Name = "";
        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1, UID);
            rs = ps.executeQuery();
            if (rs.next()) {
                Name = rs.getString("UName");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ShipperDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Name;
    }
    
    // get Phone by UserID
    public String getPhoneNumber(int UID) {
        String sql = "SELECT UPhone FROM [User] WHERE UID = ?";
        String phone = "";
        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1, UID);
            rs = ps.executeQuery();
            if (rs.next()) {
                phone = rs.getString("UPhone");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ShipperDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return phone;
    }
    
    // get Address by UserID
    public String getAddress(int UID) {
        String sql = "SELECT UAddress, UCountry FROM [User] WHERE UID = ?";
        String address = "";
        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1, UID);
            rs = ps.executeQuery();
            while (rs.next()) {
                address = rs.getString("UAddress") + ", " + rs.getString("UCountry");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ShipperDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return address;
    }

    // Check "Email" already exists
    public boolean isEmailExist(String email) {
        try {
            ps = conn.prepareStatement("SELECT * FROM [User] WHERE UEmail = ?");
            ps.setString(1, email);
            rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    // Check "Phone Number" already exists
    public boolean isPhoneNumberExist(String phone) {
        try {
            ps = conn.prepareStatement("SELECT * FROM [User] WHERE UPhone = ?");
            ps.setString(1, phone);
            rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    // insert data into "User" table
    public boolean insert(int id, String userName, String email, String pass, String phone,
            String secuQues, String answer, String address, String country) {
        boolean result = false;
        String sql = "INSERT INTO [User] VALUES(?,?,?,?,?,?,?,?,?)";
        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.setString(2, userName);
            ps.setString(3, email);
            ps.setString(4, pass);
            ps.setString(5, phone);
            ps.setString(6, secuQues);
            ps.setString(7, answer);
            ps.setString(8, address);
            ps.setString(9, country);
            if (ps.executeUpdate() > 0) {
                result = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

    // Get "User" data
    public String[] getInformationUser(int userID) {
        String[] value = new String[9];
        try {
            ps = conn.prepareStatement("SELECT * FROM [User] WHERE UID = ?");
            ps.setInt(1, userID);
            rs = ps.executeQuery();
            if (rs.next()) {
                value[0] = rs.getString(1);
                value[1] = rs.getString(2);
                value[2] = rs.getString(3);
                value[3] = rs.getString(4);
                value[4] = rs.getString(5);
                value[5] = rs.getString(6);
                value[6] = rs.getString(7);
                value[7] = rs.getString(8);
                value[8] = rs.getString(9);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return value;
    }

    public ArrayList<User> getAllUsersValue() {
        ArrayList<User> result = new ArrayList<>();
        String sql = "SELECT * FROM [User] ORDER BY UID";
        try {
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                int UID = rs.getInt(1);
                String UName = rs.getString(2);
                String UEmail = rs.getString(3);
                String UPassword = rs.getString(4);
                String UPhone = rs.getString(5);
                String USecuQues = rs.getString(6);
                String UAnswer = rs.getString(7);
                String UAddress = rs.getString(8);
                String UCountry = rs.getString(9);
                User user = new User(UID, UName, UEmail, UPassword, UPhone, USecuQues, UAnswer, UAddress, UCountry);
                result.add(user);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

    // Get "User ID"
    public int getUserID(String email) {
        int id = 0;
        try {
            ps = conn.prepareStatement("SELECT UID FROM [User] WHERE UEmail = ?");
            ps.setString(1, email);
            rs = ps.executeQuery();
            if (rs.next()) {
                id = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }

    // get User name
    public String getUserName(String email) {
        String sql = "SELECT UName FROM [User] WHERE UEmail = ?";
        String userName = "";
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, email);
            rs = ps.executeQuery();
            while (rs.next()) {
                userName = rs.getString(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ShipperDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return userName;
    }

    // Update "User" datas
    public boolean update(int id, String userName, String email, String pass, String phone,
            String secuQues, String ans, String address, String country) {
        String sql = "UPDATE [User] SET UName = ?, UEmail = ?, UPassword = ?, UPhone = ?, USecuQues = ?"
                + ", UAnswer = ?, UAddress = ?, UCountry = ? WHERE UID = ?";
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, userName);
            ps.setString(2, email);
            ps.setString(3, pass);
            ps.setString(4, phone);
            ps.setString(5, secuQues);
            ps.setString(6, ans);
            ps.setString(7, address);
            ps.setString(8, country);
            ps.setInt(9, id);
            if (ps.executeUpdate() > 0) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean updateUserWithoutPassword(int id, String userName, String email, String phone,
            String secuQues, String ans, String address, String country) {
        String sql = "UPDATE [User] SET UName = ?, UEmail = ?, UPhone = ?, USecuQues = ?, UAnswer = ?, UAddress = ?, UCountry = ? WHERE UID = ?";
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, userName);
            ps.setString(2, email);
            ps.setString(3, phone);
            ps.setString(4, secuQues);
            ps.setString(5, ans);
            ps.setString(6, address);
            ps.setString(7, country);
            ps.setInt(8, id);
            if (ps.executeUpdate() > 0) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    // Delete user
    public boolean delete(int id) {
        try {
            ps = conn.prepareStatement("DELETE FROM [User] WHERE UID = ?");
            ps.setInt(1, id);
            if (ps.executeUpdate() > 0) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
