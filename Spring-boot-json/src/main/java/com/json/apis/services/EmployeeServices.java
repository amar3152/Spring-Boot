package com.json.apis.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.json.apis.dao.EmployeeRepository;
import com.json.apis.model.Employee;

@Service
public class EmployeeServices {

	@Autowired
	private EmployeeRepository repository;
	
	public String saveEmploye(Employee employee) {
			repository.save(employee);
			return "new employee adeed"+employee.getId();
	}

	public Employee getEmployeebyId(int id) {
		return repository.getById(id);
	}

	public List<Employee> deleteEmployeebyID(int id){
		repository.deleteById(id);
		return repository.findAll();
	}
}
