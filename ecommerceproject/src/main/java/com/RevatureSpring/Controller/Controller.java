package com.RevatureSpring.Controller;
import com.RevatureSpring.Model.Product;
import com.RevatureSpring.Repository.ProductRepository;
import com.RevatureSpring.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {
    ProductService productService;

    @Autowired
    public Controller(ProductService productService) {
        this.productService = productService;
    }


//Get all Products
    @GetMapping("products/all")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }
//Get Products by name
    @GetMapping("products/{name}")
    public Product getProductByName(@PathVariable String name) {
        return productService.getProductByName(name);

    }

    @PostMapping("products/add")
    public void addProduct(@RequestBody Product product) {
        productService.addProduct(product);
    }

    @DeleteMapping("{name}")
    public void deleteProductByName(@PathVariable String name){
        productService.deleteProductByName(name);
    }
    //Need to complete
    @GetMapping("/products/{ID}")
    public Product getProductByID(@PathVariable int ID){
        return null;
    }
}
