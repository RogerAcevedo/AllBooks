package com.rogera.allbooks.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rogera.allbooks.models.Book;
import com.rogera.allbooks.services.BookService;

@RestController
public class ApiController {

//		IMPORT OUR SERVICE / DEPENDENCY INJECTION
	@Autowired
	BookService bookServ;
	
//	CREATE USER
	@PostMapping("/api/books/new")
	public String create(
		@RequestParam("title") String title,
		@RequestParam("description") String description,
		@RequestParam("language") String language,
		@RequestParam("pages") String pages
	) {
		Book newBook = new Book(title, description, language, pages);
		return bookServ.create(newBook).toString();
	}
		

	
	
	
	
}
