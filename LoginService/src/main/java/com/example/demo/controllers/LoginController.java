package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.LoginDetails;
import com.example.demo.services.LoginService;

import lombok.var;
import lombok.extern.slf4j.Slf4j;


@RestController
public class LoginController {
	@Autowired
	private LoginService service;
	
	@GetMapping(path="/login/{userId}", produces = "application/json")
	public LoginDetails findById(@PathVariable("userId") long userId) {
			Optional<LoginDetails> response = this.service.findById(userId);
			
			LoginDetails success = null;
			if(response.isPresent()) {
				success = response.get();
			}
			return success;
	}
	
	@PostMapping(produces = "text/text", consumes = "application/json")
	public String authenticateUser(@RequestBody LoginDetails user){
		LoginDetails logger = findById(user.getUserId());
		if((user!=null)&&(user.getPassword().equals(logger.getPassword()))&&(user.getTypeOfUser().equalsIgnoreCase(logger.getTypeOfUser()))) {
			return "Successfully Logged In";
		}else {
			return "Invalid credentials";
		}
	}
	
	@PostMapping(path="/signup", produces = "application/json", consumes = "application/json")
	public LoginDetails addUser(@RequestBody LoginDetails user) {
		return this.service.addUser(user);
	}
	
	
}
