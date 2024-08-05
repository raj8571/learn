package com.test.exception1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="product")
public class Product {
	@Id
	private String id;
	private String name;
	private String product_details;
	private double price;
	public Product() {
		super();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProduct_details() {
		return product_details;
	}
	public void setProduct_details(String product_details) {
		this.product_details = product_details;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	

}
