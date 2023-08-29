package com.velocity.library.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.library.entity.Librarycard;
import com.velocity.library.repository.Libraryrepo;
@Service
public class Librarycardimpl implements Libraryservice{
	@Autowired
  private Libraryrepo libraryrepo;
  
	
	@Override
	public List<Librarycard> getlibrary() {
	
		return (List<Librarycard>) libraryrepo.findAll();
	}

	@Override
	public void create(Librarycard card) {
		libraryrepo.save(card);
	}

	@Override
	public void delete(Long id) {
		libraryrepo.deleteById(id);
		
	}

}
