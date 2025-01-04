package Controller;

import DAOs.ProductDAO;
import DAOs.PurchaseDAO;
import DAOs.ShipperDAO;
import DAOs.UserDAO;
import Model.Purchase;
import View_Shipper.ShipperDashboard;
import java.util.ArrayList;

public class PurchaseController {
    private ShipperDAO shipperDAO;
    private PurchaseDAO purchaseDAO;
    private ProductDAO productDAO;
    private UserDAO userDAO;
    
    public PurchaseController() {
        this.shipperDAO = new ShipperDAO();
        this.purchaseDAO = new PurchaseDAO();
        this.productDAO = new ProductDAO();
        this.userDAO = new UserDAO();
    }
    
    public ArrayList<Purchase> getPurchaseOnTheWay(String searchText) {
        ArrayList<Purchase> result = new ArrayList<>();
        int shipperID = shipperDAO.getShipperID(ShipperDashboard.shipperEmail.getText());
        ArrayList<Purchase> infor = purchaseDAO.getOnTheWayProductsOfShipper(shipperID);
        for(var x : infor) {
            if (productDAO.getProductName(x.getPID()).contains(searchText) 
                || shipperDAO.getShipperName(x.getShipperID()).contains(searchText) 
                || userDAO.getUserName(x.getUserID()).contains(searchText)) 
            {
                result.add(x);
            }
        }
        return result;
    }
    
    public ArrayList<Purchase> getPurchaseDeliveredOfShipper(String searchText) {
        ArrayList<Purchase> result = new ArrayList<>();
        int shipperID = shipperDAO.getShipperID(ShipperDashboard.shipperEmail.getText());
        ArrayList<Purchase> infor = purchaseDAO.getShipperDeliveredProduct(shipperID);
        for(var x : infor) {
            if (productDAO.getProductName(x.getPID()).contains(searchText) 
                || shipperDAO.getShipperName(x.getShipperID()).contains(searchText) 
                || userDAO.getUserName(x.getUserID()).contains(searchText)) 
            {
                result.add(x);
            }
        }
        return result;
    }
    
    public ArrayList<Purchase> getPurchaseDelivered(String searchText) {
        ArrayList<Purchase> result = new ArrayList<>();
        ArrayList<Purchase> infor = purchaseDAO.getDeliveredProduct();
        for(var x : infor) {
            if (productDAO.getProductName(x.getPID()).contains(searchText) 
                || shipperDAO.getShipperName(x.getShipperID()).contains(searchText) 
                || userDAO.getUserName(x.getUserID()).contains(searchText)) 
            {
                result.add(x);
            }
        }
        return result;
    }
    
    public ArrayList<Purchase> getPurchasePending(String searchText) {
        ArrayList<Purchase> result = new ArrayList<>();
        ArrayList<Purchase> infor = purchaseDAO.getPurchasesStatusIsPending();
        for (var purchase : infor) {
            if(productDAO.getProductName(purchase.getPID()).contains(searchText)  
                || userDAO.getUserName(purchase.getUserID()).contains(searchText)) 
            {
                result.add(purchase);
            }
        }
        return result;
    }
}
