package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService service;
	
//	@Autowired
//	public UserController(UserService service) {
//		//super();
//		this.service = service;
//	}

	@PostMapping("/register")
	public User register(@RequestBody User user) {
		
		return service.register(user);
				
	}
	
	@GetMapping("/Welcom")
	public String welcome() {
		return "Welcome this endpoint is not secur";
	}
}
