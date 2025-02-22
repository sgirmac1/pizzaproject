package PizzaProject.Service;

import PizzaProject.Model.Customer;
import PizzaProject.Model.UserRole;
import PizzaProject.Registration.EmailValidator;
import PizzaProject.Registration.RegistrationRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RegistrationService {

    private final UserService userService;
    private final EmailValidator emailValidator;
    public String register(RegistrationRequest request) {
        boolean isValidEmail = emailValidator.test(request.getEmail());
        if (!isValidEmail) {
            throw new IllegalArgumentException("email not valid");
        }
        return userService.signUpUser(
                new Customer(
                        request.getFirstName(),
                        request.getLastName(),
                        request.getEmail(),
                        request.getPassword(),
                        UserRole.CUSTOMER, UserRole.MERCHANT


                )

        );



    }
}
//best running version
