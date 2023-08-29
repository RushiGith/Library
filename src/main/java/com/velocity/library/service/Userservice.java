package com.velocity.library.service;

import java.util.List;
import java.util.Optional;

import com.velocity.library.entity.User;
public interface Userservice {

	List<User> getuser();
	void create(User user);
	void delete(Long id);
	Optional<User> getUserData(Long id);
	
	
}
