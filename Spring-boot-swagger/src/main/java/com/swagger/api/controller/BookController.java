package com.swagger.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.swagger.api.model.Book;
import com.swagger.api.service.BookService;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("/book")
@Api(value = "Book Service", description = "My Book Stores")
public class BookController {

	@Autowired
	private BookService service;
	
	@PostMapping("/save")
	public String saveBook(@RequestBody Book book) {
		return service.SaveBook(book);
	}
	
	@GetMapping("/search/{id}")
	public Book getBook(@PathVariable int id) {
		return service.getBook(id);
		
	}

	@DeleteMapping("/delete/{id}")
	public List<Book> deleteBook(@PathVariable int id) {
		return service.removeBook(id);
		
	}

}
