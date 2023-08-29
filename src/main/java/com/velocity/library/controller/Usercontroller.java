package com.velocity.library.controller;

import java.util.List;
import java.util.Optional;

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

import com.velocity.library.entity.User;
import com.velocity.library.service.Userservice;

@RestController
@RequestMapping("/user")
public class Usercontroller {
 @Autowired
 
 private Userservice userservice;
 
 @GetMapping("/getall")
 public ResponseEntity<List<User>> getusser(){
	return new ResponseEntity<List<User>>(userservice.getuser(),HttpStatus.OK);
	 
 }
 @PostMapping("/createuser")
 public ResponseEntity<Void>createuser(@RequestBody User user) {
	 userservice.create(user);
	 return new ResponseEntity<Void>(HttpStatus.CREATED);
 }
 @DeleteMapping("/delete-user/{id}")
 public ResponseEntity<Void>deleteuser(@PathVariable Long id) {
	 userservice.delete(id);
	 return new ResponseEntity<Void>(HttpStatus.OK);
 }
 @GetMapping("/get/{id}")
 public Optional<User> getdata(@PathVariable Long id) {
	 
	return userservice.getUserData(id); 
	 
 }
 
}
