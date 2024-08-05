package com.test.exception1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.test.exception1.exception.GlobleExceptionHandler;
import com.test.exception1.exception.IdNotFoundException;
import com.test.exception1.model.Product;
import com.test.exception1.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
     private ProductRepository pr;
	 
	public List<Product> getProduct()
	{
		return pr.findAll();	
	}
	public Optional<Product> getById(String id) throws IdNotFoundException
	{
		Optional<Product> p=pr.findById(id);
		if(p.isPresent())
		{
		  return Optional.of(p.get());
		}
		else
		{
			throw new IdNotFoundException("This id not exist yet");	
		}
			
	}
	public Product getByName(String name)
	{
		return pr.findByName(name);
	}
	public Product getByPrice(double price)
	{
		return pr.findByPrice(price);
	}
	public Product addProduct(Product p)
	{
		return pr.save(p);
	}
}
