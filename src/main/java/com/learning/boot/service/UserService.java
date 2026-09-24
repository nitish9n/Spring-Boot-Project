package com.learning.boot.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.boot.dao.UserRepo;
import com.learning.boot.model.User;

@Service
public class UserService {
	@Autowired
	private UserRepo userRepo;
	
	public UserService(UserRepo userRepo) {
		super();
		this.userRepo = userRepo;
	}

	public User saveUser(User user) {  
		System.out.println("UserService.saveUser()");
		userRepo.save(user);
		return user;
	}
	
	public List<User> getAllUser(){
		System.out.println("UserService.getAllUser()");
		return userRepo.findAll();
	}
	

//	public Map<Integer, User> deleteUser(Integer i) {
//		System.out.println("UserService.deleteUser()");
//		allUser.remove(i);
//		return allUser;
//	}
	
}
