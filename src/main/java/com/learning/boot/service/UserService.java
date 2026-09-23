package com.learning.boot.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.learning.boot.model.User;

@Service
public class UserService {
	
	private static HashMap<Integer, User> allUser = new HashMap<>();
	
	static {
		allUser.put(1, new User(1, "Nitish", "male", "bxr"));
		allUser.put(2, new User(2, "Khushi", "female", "bxr"));
		allUser.put(3, new User(3, "Muskan", "female", "bxr"));
		allUser.put(4, new User(4, "Twinkle", "female", "bxr"));
	}
	
	public User saveUser(User user) {
		System.out.println("UserService.saveUser()");
		allUser.put(user.getId(), user);
		return user;
	}
	
	public Map<Integer, User> getAllUser(){
		System.out.println("UserService.getAllUser()");
		return allUser;
	}
	
}
