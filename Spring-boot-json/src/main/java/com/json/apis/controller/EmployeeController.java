package com.json.apis.controller;

import java.util.List;

import org.jsondoc.core.annotation.Api;
import org.jsondoc.core.annotation.ApiMethod;
import org.jsondoc.core.pojo.ApiStage;
import org.jsondoc.core.pojo.ApiVisibility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.json.apis.model.Employee;
import com.json.apis.services.EmployeeServices;

@RestController
@Api(name = "Employee Management System", description = "Employee info", group = "Management", visibility = ApiVisibility.PUBLIC, stage = ApiStage.BETA)
public class EmployeeController {

	@Autowired
	private EmployeeServices services;
	
	@RequestMapping(value = "/saveEmployee", method = RequestMethod.POST)
	@ApiMethod(description = "add new employee")
	public String save(@RequestBody Employee employee) {
		return services.saveEmploye(employee);
	}
	
	@RequestMapping(value = "/getEmployee/{id}", method = RequestMethod.GET)
	@ApiMethod(description = "find employee by id", path = { "id" })
	public Employee getEmployee(@PathVariable int id) {
		return services.getEmployeebyId(id);
	}
	
	@RequestMapping(value = "/deleteEmployee/{id}", method = RequestMethod.DELETE)
	@ApiMethod(description = "remove employee by id", path = { "id" })
	public List<Employee> deleteByID(@PathVariable int id){
		return services.deleteEmployeebyID(id);
	}
}
