package com.employee.webapp.serviceIMPL;

import java.util.List;
import java.util.Optional;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.webapp.model.Employee;
import com.employee.webapp.repository.EmployeeRepository;
import com.employee.webapp.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository repository;
	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public void save(Employee employee) {
		// TODO Auto-generated method stub
		repository.save(employee);
		
	}

	@Override
	public Employee getById(int id) {
		// TODO Auto-generated method stub
		Optional< Employee> optional = repository.findById(id);
		Employee employee = null;
		if(optional.isPresent()) {
			employee = optional.get();
		}
		else {
			throw new RuntimeErrorException(null, "Employee not found :- "+ id);
		}
		return employee;
	}

	@Override
	public void deleteByID(int id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
		
	}

}
