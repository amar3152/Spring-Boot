package com.employee.webapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String name;
	
	private String email;
	
	private int saraly;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getSaraly() {
		return saraly;
	}

	public void setSaraly(int saraly) {
		this.saraly = saraly;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", saraly=" + saraly + "]";
	}

	public Employee(int id, String name, String email, int saraly) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.saraly = saraly;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
