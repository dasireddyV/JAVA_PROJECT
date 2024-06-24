package com.svkp.EmployeeCRUD.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.svkp.EmployeeCRUD.model.Employee;
import com.svkp.EmployeeCRUD.service.EmployeeService;

@RestController
@CrossOrigin(allowedHeaders = "*", origins = "*")
public class EmployeeController {

	@Autowired
	private EmployeeService empService;

	@PostMapping("/registerEmployee")
	public Employee registerEmployee(@RequestBody Employee employee) {
		return empService.registerEmployee(employee);
	}
	
	@GetMapping("/getEmployee")
	public List<Employee> getEmployee(){
		return empService.getEmployee();		
	}
	
	@DeleteMapping("/deleteEmployee")
	public void deleteEmployee(@RequestParam Integer id) {
		empService.deleteEmployee(id);
	}
	
	@PutMapping("/updateEmployee")
	public Employee updateEmployee(@RequestBody Employee employee) {
		return  empService.updateEmployee(employee);
	}
}