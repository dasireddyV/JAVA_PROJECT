package com.svkp.EmployeeCRUD.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.svkp.EmployeeCRUD.model.Employee;
import com.svkp.EmployeeCRUD.repository.EmployeeRepository;



@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public Employee registerEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}
	
	public List<Employee> getEmployee(){
		return (List<Employee>) employeeRepository.findAll();		 
	}
	
	public void deleteEmployee(Integer id) {
		employeeRepository.deleteById(id);
	}
	
	public Employee updateEmployee(Employee employee) {
		Integer empNumber = employee.getEmpNumber();
		Employee std = employeeRepository.findById(empNumber).get();
		std.setEmpname(employee.getEmpname());
		std.setEmpaddress(employee.getEmpaddress());
		std.setPhoneNo(employee.getPhoneNo());
		return employeeRepository.save(std);
	}
	
}