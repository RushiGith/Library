package com.velocity.library.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.library.entity.Book;
import com.velocity.library.service.Bookservice;


@RestController
@RequestMapping("/book")
public class Bookcontroller {
	private static final Logger LOG=LoggerFactory.getLogger(Bookcontroller.class);
	
	@Autowired
	private Bookservice bookservice;
	
	@GetMapping("/getall")
	
	public ResponseEntity<List<Book>> getallbookname()
	{
		
		return new ResponseEntity<List<Book>>(bookservice.getallbook(),HttpStatus.OK);
		
	}
     @PostMapping("/createbook")
	public ResponseEntity<Void>createbook(@RequestBody Book book) {
    	 LOG.debug("Test the logging concept: "+book);
    	 bookservice.create(book);
		return new ResponseEntity<Void>(HttpStatus.CREATED);  	 
	}
	@DeleteMapping("/delete-book/{id}")
	public ResponseEntity<Void>deletebook(@PathVariable Long id) {
		bookservice.delete(id);
		return new ResponseEntity<Void>(HttpStatus.OK);
		
	}
}

