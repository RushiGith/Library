package com.velocity.library.controller;

import java.util.List;

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

import com.velocity.library.entity.Librarycard;
import com.velocity.library.service.Libraryservice;

@RestController
@RequestMapping("/library")
public class Librarycardcontroller {
	@Autowired
	Libraryservice libraryservice;
	
	@GetMapping("/getlibrary")
	public ResponseEntity<List<Librarycard>> getlibrarydetail(){
	return new ResponseEntity<List<Librarycard>>(libraryservice.getlibrary(),HttpStatus.OK);
		
		
	}
	@PostMapping("/create")
	public ResponseEntity<Void>createcard(@RequestBody Librarycard card) {
		libraryservice.create(card);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
		
	}
        @DeleteMapping("/delete-library/{id}")	
	  public ResponseEntity<Void>deletecard(@PathVariable Long id) {
        	libraryservice.delete(id);
		  return new ResponseEntity<Void>(HttpStatus.OK);
	  }

}
