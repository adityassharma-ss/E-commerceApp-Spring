package com.ecom.major.repository;

import com.ecom.major.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductReposiory extends JpaRepository<Product, Long> {
    List<Product> findAllByCategory_Id(int id);
}
