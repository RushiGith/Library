package com.velocity.library.service;

import java.util.List;

import com.velocity.library.entity.Book;

public interface Bookservice {
List<Book> getallbook();
void create (Book book);
void delete(Long id);
	
}



