package com.swagger.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swagger.api.dao.BookRepository;
import com.swagger.api.model.Book;

@Service
public class BookService {
	
	@Autowired
	private BookRepository bookRepository;
	
	public String SaveBook(Book book) {
		bookRepository.save(book);
		return "book Save with id:- "+ book.getBookId();
	}
	
	public Book getBook(int id) {
		return bookRepository.getOne(id);
	}
	
	public List<Book> removeBook(int id){
		bookRepository.deleteById(id);
		return bookRepository.findAll();
	}

}
