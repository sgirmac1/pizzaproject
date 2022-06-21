package com.RevatureSpring;
import com.RevatureSpring.Service.ProductService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

//@ComponentScan
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
       /* ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
        ProductService  productService = context.getBean(ProductService.class);
        System.out.println(productService.getAllProducts());
        */
        SpringApplication.run(Application.class);
    }
}
