package com.address.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.address.employee.model.Employee;
import com.address.employee.service.EmployeeService;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
	@Autowired
	EmployeeService es;
	
	
	@PostMapping("/add")
	public void addEmp(@RequestBody Employee e) 
	{
	     es.addEmployee(e);
	}
	@GetMapping("/get")
	public List<Employee> getEmp()
	{
		return es.getEmployee();
	}

}
