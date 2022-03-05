package com.example.Emp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Emp.model.Employee;
import com.example.Emp.repo.EmployeeRepo;

@Service
public class EmployeeService  {

	@Autowired
	private EmployeeRepo empRepo;
	

	public Employee getoneEmployee(int a) {
		
	Employee emp =	empRepo.getById(a);
	return emp;
	}
	
	public List<Employee> getAllEmployee(){
		return empRepo.findAll();
	}
	
	public Employee saveEmployee(Employee emp) {
		
		 return empRepo.save(emp);
	}
	
	public String delEmployee(int id) {
		empRepo.deleteById(id);
		
		return "Employee is deleted";
	}
	
}
