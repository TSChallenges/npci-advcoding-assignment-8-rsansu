package com.mystore.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mystore.app.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

    // Add custom query methods if needed


}
