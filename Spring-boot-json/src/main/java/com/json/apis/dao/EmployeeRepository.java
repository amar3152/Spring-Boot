package com.json.apis.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.json.apis.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
