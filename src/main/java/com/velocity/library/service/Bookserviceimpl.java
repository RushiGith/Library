package com.velocity.library.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.library.entity.Book;
import com.velocity.library.repository.Bookrepo;

@Service
public class Bookserviceimpl implements Bookservice {
	@Autowired
private Bookrepo bookrepo;
	
	@Override
	public List<Book> getallbook() {
		
		return (List<Book>) bookrepo.findAll();
	}

	@Override
	public void create(Book book) {
		
		bookrepo.save(book);
	}

	@Override
	public void delete(Long id) {
		bookrepo.deleteById(id);
		
	}

}
