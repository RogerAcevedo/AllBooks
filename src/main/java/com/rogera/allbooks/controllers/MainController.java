package com.rogera.allbooks.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.rogera.allbooks.models.Book;
import com.rogera.allbooks.services.BookService;

@Controller
public class MainController {
	
//	IMPORT SERVICE TO INTERACT WITH CONTROLLER OR DEPENDENCY INJECTION
	@Autowired
	BookService bookServ;


//	READ ALL
	
	@GetMapping("/")
	public String index(Model model) {
		
		// USE SERVICE TO MAKE CRUD COMMAND - RETRIEVE ALL 
		List<Book> allBooksFromDB = bookServ.getAllBooks();
		
		
		//PASS INFORMATION TO JSP
		model.addAttribute("allBooks", allBooksFromDB);
		
		//RENDER THE JSP
		return "index.jsp";
	}
	
	
// CREATE A USER
	@PostMapping("/books/new")
	public String create(
		@RequestParam("title") String title,
		@RequestParam("description") String description,
		@RequestParam("language") String language,
		@RequestParam("pages") String pages
	) {
		Book newBook = new Book(title, description, language, pages);
		bookServ.create(newBook);
		return "redirect:/";
	}
	

//VIEW ONE
	@GetMapping("/books/{id}")
	public String showOne(
//			MUST BE "id"
			@PathVariable("id") Long bookId,
			Model model
	) {
		// RETRIEVE ONE USER FROM THE DATABASE
		Book oneBook = bookServ.findBook(bookId);
		
		// PASS INFORMATION TO THE JSP
		model.addAttribute("book", oneBook);
		
		return "oneBook.jsp";
		
	}
	
	
	
	
	
	
//END OF MainController class	
}
