package com.spring.mock.movietheater.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.mock.movietheater.model.Users;
import com.spring.mock.movietheater.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping("/users")
	public Iterable<Users> all() {
	    return userService.findAll();
	}
}
