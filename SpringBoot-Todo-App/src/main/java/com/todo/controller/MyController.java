package com.todo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todo.entity.Todo;
import com.todo.repo.TodoRepo;

@RestController
@RequestMapping("/todo")
public class MyController {

	@Autowired
	private TodoRepo todoRepo;
	
	@GetMapping
	public List<Todo> findAll(){
		return todoRepo.findAll();
		}
	
	@PostMapping
	public Todo saveTodo(@RequestBody Todo todo) {
		return todoRepo.save(todo);
	}
	
	@PutMapping
	public Todo updateTodo(@RequestBody Todo todo) {
		return todoRepo.save(todo);  
	}
	
	@DeleteMapping("/{id}")
	public void todoDelete(@PathVariable Long id) {
		 todoRepo.deleteById(id);
	}
}
