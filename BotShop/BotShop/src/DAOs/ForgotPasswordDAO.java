package DAOs;

import ConnectDatabase.MyConnect;
import View_User.ForgotPassword;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ForgotPasswordDAO {
    
    Connection conn = MyConnect.getConnection();
    PreparedStatement ps;
    ResultSet rs;
    
    public ForgotPasswordDAO() {
        
    }
    
    public boolean isEmailExist(String email) {
        try {
            ps = conn.prepareStatement("SELECT * FROM [User] WHERE UEmail = ?");
            ps.setString(1, email);
            rs = ps.executeQuery();
            if(rs.next()) {
                ForgotPassword.jTextField_FP_Ser_Ques.setText(rs.getString("USecuQues"));
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ForgotPasswordDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public boolean isCorrectAnswer(String email, String newAnswer) {
        try {
            ps = conn.prepareStatement("SELECT UAnswer FROM [User] WHERE UEmail = ?");
            ps.setString(1, email);
            rs = ps.executeQuery();
            if(rs.next()) {
                String oldAnswer = rs.getString("UAnswer");
                if(newAnswer.equals(oldAnswer)) {
                    return true;
                } else {
                    return false;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ForgotPasswordDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    // Set new password
    public boolean setNewPassword(String email, String newPass) {
        boolean result = false;
        String sql = "UPDATE [User] SET UPassword = ? WHERE UEmail = ?";
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, newPass);
            ps.setString(2, email);
            if(ps.executeUpdate() > 0) {
                result = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ForgotPasswordDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
} 
