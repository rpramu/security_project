package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repositry.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;
	
//	@Autowired
//	public UserService(UserRepository repo) {
//		//super();
//		this.repo = repo;
//	}
//	
	private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);

	public User register(User user) {
		user.setPassword(encoder.encode(user.getPassword()));
		return repo.save(user);
		
	}

	

}
