package PizzaProject.DAO;

import PizzaProject.Model.Customer;
import PizzaProject.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository
@Transactional(readOnly = true)
public interface UserDAO extends JpaRepository<Customer, Long> {

    Optional<Customer> findByEmail(String email);
    public List<User> getAllUsers();

    }


