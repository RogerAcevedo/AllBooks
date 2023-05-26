package com.rogera.allbooks.services;

// IMPORTS START
import java.util.List;
//import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;

//import java.util.ArrayList;
//import java.util.List;

import org.springframework.stereotype.Service;

import com.rogera.allbooks.models.Book;
import com.rogera.allbooks.repositories.BookRepository;
// IMPORTS END


//what is @service for ?
@Service
public class BookService {
	
//IMPORT
	@Autowired
	BookRepository bookRepo;
	
	
//	CREATE
	public Book create(Book newBook) {
		return bookRepo.save(newBook);
	}

// GET ALL 
	public List<Book> getAllBooks(){
		return bookRepo.findAll();
	}
	
	
// GET ONE
	public Book findBook(Long id) {
		
		return bookRepo.findById(id).orElse(null);
//		Optional<Book> optionalBook = bookRepo.findById(id);
//		if(optionalBook.isPresent()) {
//			return optionalBook.get();
//		} else {
//			return null;
//		}
			
	}
	
	

// UPDATE A USER
	public Book updateBook(@Valid Book updatedBook) {
		return bookRepo.save(updatedBook);
	}
	
// DELETE A USER
	public void deleteBook(Long id) {
		bookRepo.deleteById(id);
	}

}
