package DAOs;

import ConnectDatabase.MyConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CurrentLoginsDAO {
    
    Connection conn = MyConnect.getConnection();
    PreparedStatement ps;
    ResultSet rs;
    
    public boolean isExist(String role, String email) {
        String sql = "SELECT * FROM CurrentLogins WHERE Role = ? AND Email = ?";
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, role);
            ps.setString(2, email);
            rs = ps.executeQuery();
            if(rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(CurrentLoginsDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public boolean insert(String role, String email) {
        String sql = "INSERT INTO CurrentLogins VALUES (?,?)";
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, role);
            ps.setString(2, email);
            if(ps.executeUpdate() > 0) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(CurrentLoginsDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public boolean delete(String role, String email) {
        String sql = "DELETE FROM CurrentLogins WHERE Role = ? AND Email = ?";
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, role);
            ps.setString(2, email);
            if(ps.executeUpdate() > 0) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(CurrentLoginsDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
