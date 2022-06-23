package PizzaProject.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class User {
    private int ID;
    private String name;
}

     enum UserRole {
        CUSTOMER,
        MERCHANT
    }
