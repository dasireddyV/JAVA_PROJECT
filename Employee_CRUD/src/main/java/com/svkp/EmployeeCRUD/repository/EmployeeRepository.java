package com.svkp.EmployeeCRUD.repository;

import org.springframework.data.repository.CrudRepository;

import com.svkp.EmployeeCRUD.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
