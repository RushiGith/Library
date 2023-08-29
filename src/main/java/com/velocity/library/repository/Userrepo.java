package com.velocity.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.velocity.library.entity.User;
import com.velocity.library.service.Userservice;

@Service
public interface Userrepo extends JpaRepository<User, Long> {

}
