package com.rogera.allbooks.models;
//DOMAIN MODEL!!!
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;


//@Entity & @Table connect us to the database
@Entity
@Table(name = "books")
public class Book {
// MEMBER VARIABLES
	
	
	@Id
//	@GeneratedValue - allows us to auto increment
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String title;
	private String description;
	private String language;
	private String pages;
	
	@Column(updatable=false)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date createdAt;
	
	@DateTimeFormat(pattern="yyy-MM-dd")
	private Date updatedAt;
	
//	CONSTRUCTORS
	
	//EMPTY CONTRUCTOR
	public Book() {
		
	}
	//FULL CONSTRUCTOR
public Book(String title, String description, String language, String pages) {
	super();
	this.title = title;
	this.description = description;
	this.language = language;
	this.pages = pages;
}


//GETTERS / SETTERS / OTHER METHODS

//OTHER METHODS FOR OUR createdAt & updatedAt - gets the names and dates that we need
@PrePersist
protected void onCreate() {
		this.createdAt = new Date();
}

@PreUpdate
protected void onUpdate() {
	this.updatedAt = new Date();
}


public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public String getLanguage() {
	return language;
}

public void setLanguage(String language) {
	this.language = language;
}

public String getPages() {
	return pages;
}

public void setPages(String pages) {
	this.pages = pages;
}

public Date getCreatedAt() {
	return createdAt;
}

public void setCreatedAt(Date createdAt) {
	this.createdAt = createdAt;
}

public Date getUpdatedAt() {
	return updatedAt;
}

public void setUpdatedAt(Date updatedAt) {
	this.updatedAt = updatedAt;
}
	
	
// CLOSING 	
}
