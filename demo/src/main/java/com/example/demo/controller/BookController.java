package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Book;
import com.example.demo.service.BookService;

@RestController
@RequestMapping("/api/v1/book")
public class BookController {

	@Autowired
	BookService bookService;
	
	@GetMapping("/get/{id}")
	public Book getBook(@PathVariable Long id){
		return bookService.getById(id);
	}
	
	@PostMapping("/save")
	public Book save(@RequestBody Book book){
		return bookService.save(book);
	}
}
