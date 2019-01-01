package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Book;
import com.example.demo.repository.BookRepository;

@Service
public class BookService {

	@Autowired
	BookRepository bookRepo;
	
	public Book getById(Long id){
		Book book = null;
		try{
			book = bookRepo.findOne(id);
			
			System.out.println(book);
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		
		return book;
	}
	
	public Book save(Book book){
		
		book = bookRepo.save(book);
		
		return book;
	}
	
}
