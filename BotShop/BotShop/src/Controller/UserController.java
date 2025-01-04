package Controller;

import DAOs.UserDAO;
import Model.User;
import java.util.ArrayList;

public class UserController {
    private UserDAO userDAO;
    
    public UserController() {
        this.userDAO = new UserDAO();
    }
    
    public ArrayList<User> getAllUsers(String search) {
        ArrayList<User> result = new ArrayList<>();
        ArrayList<User> allUser = userDAO.getAllUsersValue();
        for(var user : allUser) {
            if(user.getUName().contains(search)
               || user.getUEmail().contains(search)
               || user.getUPhone().contains(search)) 
            {
                result.add(user);
            }
        }
        return result;
    }
}
