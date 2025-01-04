package DAOs;

import ConnectDatabase.MyConnect;
import Model.Category;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CategoryDAO {
    
    Connection conn = MyConnect.getConnection();
    PreparedStatement ps;
    Statement st;
    ResultSet rs;
    
    public CategoryDAO() {
    }
    
    // Get Category table max row
    public int getMaxRox() {
        int row = 0;
        try {
            st = conn.createStatement();
            rs = st.executeQuery("SELECT MAX(CID) FROM Category");
            while(rs.next()) {
                row = rs.getInt(1);
            }
            } catch (SQLException ex) {
            Logger.getLogger(CategoryDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return row + 1;
    }
    
    // Get ID Category by Name Category
    public int getCategoryID(String categoryName) {
        int result = 0;
        try {
            String sql = "SELECT CID FROM Category WHERE CName = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, categoryName);
            rs = ps.executeQuery();
            if(rs.next()) {
                result = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
    
    // Get Name Category by Name
    public String getCategoryName(int categoryID) {
        String result = "";
        try {
            String sql = "SELECT CName FROM Category WHERE CID = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, categoryID);
            rs = ps.executeQuery();
            if(rs.next()) {
                result = rs.getString(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
    
    // Get Description Category by ID
    public String getDescription(int categoryID) {
        String result = "";
        try {
            String sql = "SELECT CDecrip FROM Category WHERE CID = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, categoryID);
            rs = ps.executeQuery();
            if(rs.next()) {
                result = rs.getString(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
    
    public boolean isCategoryIdExists(int id) {
        String sql = "SELECT * FROM Category WHERE CID = ?";
        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if(rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(CategoryDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    // Check "Category Name" already exists
    public boolean isCategoryNameExist(String name) {
        try {
            ps = conn.prepareStatement("SELECT * FROM Category WHERE CName = ?");
            ps.setString(1, name);
            rs = ps.executeQuery();
            if(rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(CategoryDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    // insert data into "Category" table
    public boolean insert(int id, String cname, String description) 
    {
        String sql = "INSERT INTO Category VALUES(?,?,?)";
        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.setString(2, cname);
            ps.setString(3, description);
            if(ps.executeUpdate() > 0) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(CategoryDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    // Update "Category" datas
    public boolean update(int id, String cname, String description) 
    {
        String sql = "UPDATE Category SET CName = ?, CDecrip = ? WHERE CID = ?";
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, cname);
            ps.setString(2, description);
            ps.setInt(3, id);
            if(ps.executeUpdate() > 0) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(CategoryDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    // Delete Category
    public boolean delete(int id) {
        try {
            ps = conn.prepareStatement("DELETE FROM Category WHERE CID = ?");
            ps.setInt(1, id);
            if (ps.executeUpdate() > 0) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(CategoryDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public ArrayList<Category> getAllCategoriesValue() {
        ArrayList<Category> result = new ArrayList<>();
        String sql = "SELECT * FROM Category ORDER BY CID";
        try {
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()) {
                int CID = rs.getInt(1);
                String CName = rs.getString(2);
                String CDecrip = rs.getString(3);
                Category c = new Category(CID, CName, CDecrip);
                result.add(c);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CategoryDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
    
}
