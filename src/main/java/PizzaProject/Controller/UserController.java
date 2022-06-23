package PizzaProject.Controller;

import PizzaProject.Model.User;
import PizzaProject.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;
    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("users/all")
    public List<User> getAllUsers(){

        return null;  //userService.getAllUsers();
    }
    @GetMapping("user/{name}")
    public User getUserByName(String name){
        return null; //userService.getUserByName(name);
    }
    @GetMapping("user/{ID}")
    public User getUserByID(int ID){
        return null;
}
}
