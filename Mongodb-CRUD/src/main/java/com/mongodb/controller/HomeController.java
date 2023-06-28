package com.mongodb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mongodb.models.Students;
import com.mongodb.repository.StudentsRepository;

@Controller
public class HomeController {
	
	
	@Autowired
	private StudentsRepository repository;
	
	
	@GetMapping("/get")
	public ResponseEntity<?> getStudent(){
		
		return ResponseEntity.ok(this.repository.findAll());
	}
	
	@PostMapping("/")
	public ResponseEntity<?> addStudent (@RequestBody Students students){
		
		Students save = this.repository.save(students);
		return ResponseEntity.ok(save);	
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getIDStudents(@PathVariable Integer id){
		return ResponseEntity.ok(this.repository.findById(id));
	}
	
	@DeleteMapping("/{id}")
	public String deletestudents(@PathVariable Integer id){
		 repository.deleteById(id);
		 return "deleted";
	}
	
	


}
