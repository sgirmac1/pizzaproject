package com.RevatureSpring.Repository;

import com.RevatureSpring.Model.Product;
import lombok.ToString;
//import org.springframework.stereotype.Component;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import javax.transaction.Transactional;

//import java.util.ArrayList;
import java.util.List;
@Transactional
public interface ProductRepository extends JpaRepository<Product, Integer> {

    @Query("From Product where product_id = :product_id")
    Product findProductByID(@Param("product_id") int id);

@Query("From Product")
List<Product> findAllProducts();
    @Query("From Product where products_name = :name")
    Product findProductByName(@Param("name") String name);

}


