package com.velocity.library.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.library.entity.User;
import com.velocity.library.exception.Errorcode;
import com.velocity.library.exception.Errorresponse;
import com.velocity.library.exception.Resourcenotfoundexception;
import com.velocity.library.repository.Userrepo;
@Service
public class Userimpl implements Userservice{
    @Autowired
	private Userrepo userrepo;
	
	
	@Override
	public List<User> getuser() {
	
		return (List<User>) userrepo.findAll();
	}

	@Override
	public void create(User user) {
		userrepo.save(user);
		
	}

	@Override
	public void delete(Long id) {
		userrepo.deleteById(id);
		
	}

	@Override
	public Optional<User> getUserData(Long id) {
		Optional<User> findById = userrepo.findById(id);
	if(findById.isPresent()) {
		User  exestingdata=findById.get();

	    }else {
	    	throw new Resourcenotfoundexception(Errorcode.DATA_NOT_FOUND.getcode(),Errorcode.DATA_NOT_FOUND.getmessage());
	   }
		return userrepo.findById(id);
		
		
			
		
}
}