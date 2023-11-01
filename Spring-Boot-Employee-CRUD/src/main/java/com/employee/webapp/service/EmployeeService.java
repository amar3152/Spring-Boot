package com.employee.webapp.service;

import java.util.List;

import com.employee.webapp.model.Employee;

public interface EmployeeService {
	
	List<Employee> getAllEmployee();
	void save(Employee employee);
	Employee getById(int id);
	void deleteByID(int id);

}
