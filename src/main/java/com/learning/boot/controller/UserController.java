package com.learning.boot.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.learning.boot.model.User;
import com.learning.boot.service.UserService;

@RestController // ==  @Controller @ResponseBody
public class UserController {
	@Autowired
	private UserService userService;  // dependency
	
	@GetMapping("/")
	public String helloUser() {
		System.out.println("UserController.hello()");
		return "Hello, it's me REST api of Spring Boot";
	}
	
	@PostMapping
	public User saveUser(@RequestBody User forsave) {   // forsave- it save body come along with request
		System.out.println("UserController.saveUser()");
		
		return userService.saveUser(forsave);
	}
	
	@GetMapping("/getAllUser")
	public Map<Integer, User> getAllUser(){
		System.out.println("UserController.getAllUser()");
		return userService.getAllUser();
	}
	
	@DeleteMapping("/deleteUser/{id}")
	public Map<Integer, User> deleteUser(@PathVariable Integer id) {
		System.out.println("UserController.deleteUser()");
	   return userService.deleteUser(id);
	}
}
