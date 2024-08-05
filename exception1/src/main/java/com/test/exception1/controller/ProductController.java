package com.test.exception1.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.exception1.model.Product;
import com.test.exception1.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductService ps;
	@GetMapping("/getAll")
	public List<Product> getProduct()
	{
		return ps.getProduct();	
	}
	@GetMapping("/getById/{id}")
	public Optional<Product> getById(@PathVariable String id)
	{
		return ps.getById(id);	
	}
	@GetMapping("/getByName/{name}")
	public Product getByName(@PathVariable String name)
	{
		return ps.getByName(name);
	}
	@GetMapping("/getByPrice/{price}")
	public Product getByPrice(@PathVariable  double price)
	{
		return ps.getByPrice(price);
	}
	@PostMapping("/add")
	public Product addProduct(@RequestBody Product p)
	{
		return ps.addProduct(p);
	}
}
