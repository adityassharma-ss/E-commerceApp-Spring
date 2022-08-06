package com.ecom.major.service;

import com.ecom.major.model.Product;
import com.ecom.major.repository.ProductReposiory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class ProductService {
    @Autowired
    ProductReposiory productReposiory;

    public List<Product> getAllProduct() {
        return productReposiory.findAll();
    }
    public void addProduct(Product product){
        productReposiory.save(product);
    }
    public void removeById(long id){
        productReposiory.deleteById(id);
    }
    public Optional<Product> getProductById(long id){
        return productReposiory.findById(id);
    }
    public List<Product> getAllProductByCategoryId(int id){
        return productReposiory.findAllByCategory_Id(id);
    }

    public void removeProductById(long id) {
    }
}
