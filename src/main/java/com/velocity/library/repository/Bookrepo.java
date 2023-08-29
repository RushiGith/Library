package com.velocity.library.repository;

import org.springframework.data.repository.CrudRepository;

import com.velocity.library.entity.Book;

public interface Bookrepo extends CrudRepository<Book, Long> {
	

}
