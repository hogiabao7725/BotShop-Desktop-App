package Controller;

import DAOs.ShipperDAO;
import Model.Purchase;
import Model.Shipper;
import java.util.ArrayList;

public class ShipperController {
    private ShipperDAO shipperDAO;
    
    public ShipperController() {
        this.shipperDAO = new ShipperDAO();
    }
    
    public ArrayList<Shipper> Shipper(String searchText) {
        ArrayList<Shipper> result = new ArrayList<>();
        ArrayList<Shipper> all = shipperDAO.getAllShippers();
        for(var shipper : all) {
            if(shipper.getSName().contains(searchText)
               || shipper.getSEmail().contains(searchText)
               || shipper.getSPhone().contains(searchText)) 
            {
                result.add(shipper);
            }
        }
        return result;
    }
}
