package com.RevatureSpring.Service;
import com.RevatureSpring.Model.Product;
import com.RevatureSpring.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class ProductService //implements ProductServiceInterface
{
    ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

public List<Product> getAllProducts() {
return productRepository.findAllProducts();
}

    public Product getProductByName(String name) {
    return productRepository.findProductByName(name);
}
    public Product getProductByID(int ID){
        return productRepository.findProductByID(ID);
    }
    public void addProduct(Product product) {
        productRepository.save(product);

}

    public void deleteProductByName(String product){
  //      productRepository.delete(product);
}

}
