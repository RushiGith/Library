package com.velocity.library.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.velocity.library.entity.Librarycard;

@Service
public interface Libraryrepo extends CrudRepository<Librarycard, Long> {
}
