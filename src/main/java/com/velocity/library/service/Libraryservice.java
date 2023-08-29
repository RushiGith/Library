package com.velocity.library.service;

import java.util.List;

import com.velocity.library.entity.Book;
import com.velocity.library.entity.Librarycard;

public interface Libraryservice {

	List<Librarycard> getlibrary();
	void create(Librarycard card);
	void delete(Long id);
	
}
