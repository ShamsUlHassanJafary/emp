package com.example.Emp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Emp.model.Employee;
import com.example.Emp.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService empService;
	
	@GetMapping("/oneemp/{id}")
	public Employee getSpecificEmployee(@PathVariable Integer id) {
		
	return 	empService.getoneEmployee(id);
	
	}
	

	@PostMapping("/saveemp")
	public Employee saveSpecificEmployee(@RequestBody Employee emp) {
		
	return 	empService.saveEmployee(emp);
	
	}
	
	@GetMapping("/allemployee")
	public List<Employee> getAll(){
		
	 return	empService.getAllEmployee();
	}
	

	@GetMapping("/delete/{id}")
	public String deleteOneEmp(@PathVariable int id) {
		
		return empService.delEmployee(id);
	}
}
