package DAOs;

import View_Admin.AdminDashboard;
import ConnectDatabase.MyConnect;
import View_Shipper.ShipperDashboard;
import View_User.UserDashboard;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StatisticDAO {
    
    ShipperDAO shipperDAO = new ShipperDAO();
    UserDAO userDAO = new UserDAO();
    
    Connection conn = MyConnect.getConnection();
    PreparedStatement ps;
    Statement st;
    ResultSet rs;
    
    public StatisticDAO() {
        
    }
    
    public int total(String tab) {
        int total = 0;
        try {
            st = conn.createStatement();
            rs = st.executeQuery("SELECT COUNT(*) AS Total FROM " + tab + "");
            if(rs.next()) {
                total = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(StatisticDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return total;
    }
    
    private double totalSales() {
        double total = 0.0;
        try {
            st = conn.createStatement();
            rs = st.executeQuery("SELECT SUM(Quantity * Price) AS TotalSales FROM Purchase");
            if(rs.next()) {
                total = rs.getDouble(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(StatisticDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return total;
    }
    
    private double todaySales() {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        String today = df.format(date);
        double total = 0.0;
        try {
            st = conn.createStatement();
            rs = st.executeQuery("SELECT SUM(Quantity * Price) AS TotalSales FROM Purchase WHERE p_date = '" + today +"'");
            if(rs.next()) {
                total = rs.getDouble(1);
            }
        } catch (SQLException ex) {
            System.out.println(today);
            Logger.getLogger(StatisticDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return total;
    }
    
    private double totalPurchase(int id) {
        double total = 0.0;
        try {
            st = conn.createStatement();
            rs = st.executeQuery("SELECT SUM(Quantity * Price) AS TotalSales FROM Purchase WHERE UserID = " + id);
            if(rs.next()) {
                total = rs.getDouble(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(StatisticDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return total;
    }
    
    public int totalDeliveries(int shipperID) {
        int total = 0;
        try {
            st = conn.createStatement();
            rs = st.executeQuery("SELECT COUNT(*) AS Total FROM Purchase WHERE Status = 'Received' AND ShipperID = " + shipperID );
            if(rs.next()) {
                total = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(StatisticDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return total;
    }
    
    // admin dashboard
    public void admin() {
        AdminDashboard.jLabel_Num_Total_Cate.setText(String.valueOf(total("Category")));
        AdminDashboard.jLabel_Num_TT_Product.setText(String.valueOf(total("Product")));
        AdminDashboard.jLabel_Num_TT_Users.setText(String.valueOf(total("[User]")));
        AdminDashboard.jLabel_Num_TT_Supp.setText(String.valueOf(total("Shipper")));
        AdminDashboard.jLabel_Num_TT_Sales.setText(String.format("%.2f",totalSales())+ " $");
        AdminDashboard.jLabel_Num_TT_Today_Sales.setText(String.format("%.2f",todaySales())+ " $");
    }
   
      // user dashboard
    public void user(String email) {
        UserDashboard.jLabel_Num_Total_Cate.setText(String.valueOf(total("Category")));
        UserDashboard.jLabel_Num_TT_Product.setText(String.valueOf(total("Product")));
        UserDashboard.jLabel_Num_TT_Purchase.setText(String.format("%.2f",totalPurchase(userDAO.getUserID(email))) + " $");
    }
    
    // shipeer dashboard
    public void shipper(String email) {
        ShipperDashboard.jLabel_Total_Deliveries.setText(String.valueOf(totalDeliveries(shipperDAO.getShipperID(email))));
    }
}
