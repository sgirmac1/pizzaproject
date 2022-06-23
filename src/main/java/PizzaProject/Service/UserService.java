package PizzaProject.Service;

import PizzaProject.Model.Customer;
import PizzaProject.DAO.UserDAO;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Component
public class UserService implements UserDetailsService {

    private final static String USER_NOT_FOUND_MSG =
            "user with email %s not found";
    private final UserDAO userRepository;
    //private final BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public UserDetails loadUserByUsername(String email)
            throws UsernameNotFoundException {
        return userRepository.findByEmail(email)
                .orElseThrow(() ->
                        new UsernameNotFoundException(
                                String.format(USER_NOT_FOUND_MSG, email)));
    }

    public String signUpUser(Customer customer) {
        boolean userExists = userRepository.findByEmail(customer.getEmail()).isPresent();
        if (userExists) {
            throw new IllegalStateException("email already taken");
        }

        //String encodedPassword = bCryptPasswordEncoder.encode(customer.getPassword());

        //customer.setPassword(encodedPassword);

        userRepository.save(customer);

        return "This customer has been updated";
    }

}
