package com.learning.boot.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learning.boot.model.User;

public interface UserRepo extends JpaRepository<User, Integer> {

	
	
}
