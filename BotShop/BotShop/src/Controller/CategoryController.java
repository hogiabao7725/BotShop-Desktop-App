package Controller;

import DAOs.CategoryDAO;
import Model.Category;
import java.util.ArrayList;

public class CategoryController {
    private CategoryDAO categoryDAO;
    
    public CategoryController() {
        this.categoryDAO = new CategoryDAO();
    }
    
    public ArrayList<Category> getAllCategories(String searchText) {
        ArrayList<Category> result = new ArrayList<>();
        ArrayList<Category> allCategories = categoryDAO.getAllCategoriesValue();
        for(var category : allCategories) {
            if(category.getCName().contains(searchText)) {
                result.add(category);
            }
        }
        return result;
    }
}
