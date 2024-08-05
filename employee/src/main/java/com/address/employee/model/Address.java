package com.address.employee.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="address")
public class Address {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private int id;
	private String location;
	private String city;
	private String post;
	
	public Address()
	{
		
	}
	
	public Address(int id, String location, String city, String post) {
		super();
		this.id = id;
		this.location = location;
		this.city = city;
		this.post = post;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	

}
