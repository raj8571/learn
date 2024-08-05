package com.test.exception1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.exception1.model.Product;
@Repository
public interface ProductRepository extends JpaRepository<Product, String>{

	Product findByName(String name);

	Product findByPrice(double price);

}
