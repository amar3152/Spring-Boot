package com.mongodb.models;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "students")
public class Students {
	
	private int id;
	private String name;
	private String collage;
	private String city;
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
	public String getCollage() {
		return collage;
	}
	public void setCollage(String collage) {
		this.collage = collage;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Students(int id, String name, String collage, String city) {
		super();
		this.id = id;
		this.name = name;
		this.collage = collage;
		this.city = city;
	}
	
	
	

}
