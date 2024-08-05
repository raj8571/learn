package com.address.employee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.address.employee.model.Employee;
import com.address.employee.repository.EmployeeRepository;

@Service
public class EmployeeService {
@Autowired
private EmployeeRepository er;

public void addEmployee(Employee e)
{
	er.save(e);
}
public List<Employee> getEmployee()
{
	return er.findAll();
}


}
