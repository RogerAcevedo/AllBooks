//WE USE AN INTERFACE BECAUSE WE USE UNIMPLEMENTED AND ABSTRACT METHODS

package com.rogera.allbooks.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rogera.allbooks.models.Book;

// pass in the model "Book.java"
@Repository
public interface BookRepository extends CrudRepository<Book , Long> {

	//	GET ALL METHOD
//	cast in into a List type so it is iteratable
	List<Book> findAll();
	
//CUSTOM QUERIES

	List<Book> findByTitle(String search);


}
