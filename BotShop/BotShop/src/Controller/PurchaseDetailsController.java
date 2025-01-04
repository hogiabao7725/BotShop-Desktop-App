package Controller;

import DAOs.ProductDAO;
import DAOs.PurchaseDAO;
import DAOs.UserDAO;
import Model.Purchase;
import View_User.UserDashboard;
import java.util.ArrayList;

public class PurchaseDetailsController {
    private ProductDAO productDAO = new ProductDAO();
    private PurchaseDAO purchaseDAO;
    private UserDAO userDAO;
    private int userID;
    
    public PurchaseDetailsController() {
        this.purchaseDAO = new PurchaseDAO();
        this.userDAO = new UserDAO();
        userID = userDAO.getUserID(UserDashboard.userEmail.getText());
    }
    
    public ArrayList<Purchase> getAllPurchase() {
        ArrayList<Purchase> result = new ArrayList<>();
        result = purchaseDAO.getAllPurchaseOfUser(userID);
        return result;
    }
    
    // Purchase Details In User Dashboard
    public ArrayList<Purchase> searchPurchaseInUser(String text) {
        ArrayList<Purchase> result = new ArrayList<>();
        ArrayList<Purchase> allPurchase = purchaseDAO.getAllPurchaseOfUser(userID);
        for(var x : allPurchase) {
            if(productDAO.getProductName(x.getPID()).contains(text)) {
                result.add(x);
            }
        }
        return result;
    }
    
    
}
