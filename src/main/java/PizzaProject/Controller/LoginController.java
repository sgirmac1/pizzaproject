package PizzaProject.Controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String login(){
        return "You are login successfully";
    }

    @GetMapping("/logout")
    public String logout(){
        return "You are logout successfully";
    }


}
