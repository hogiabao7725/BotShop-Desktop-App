package Controller;

import DAOs.CategoryDAO;
import DAOs.ProductDAO;
import Model.Product;
import java.util.ArrayList;

public class ProductController {
    private ProductDAO productDAO;
    private CategoryDAO categoryDAO;
    
    public ProductController() {
        this.productDAO = new ProductDAO();
        this.categoryDAO = new CategoryDAO();
    }
    
    // Get information for the "Product" table of "Purchase" jfame in View_User
    public ArrayList<Product> searchInformationForProductTable(String text) {
        ArrayList<Product> result = new ArrayList<>();
        ArrayList<Product> allProduct = productDAO.getAllProducts();
        for(var product : allProduct) {
            if(product.getPName().contains(text) || categoryDAO.getCategoryName(product.getCID()).contains(text)) {
                result.add(product);
            }
        }
        return result;
    }
}
