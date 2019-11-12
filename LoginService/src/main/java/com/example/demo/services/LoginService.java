package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.LoginDetails;
import com.example.demo.repos.LoginRepository;

@Service
public class LoginService {
	
	@Autowired
	private LoginRepository repo;
	
	//@Override
	public Optional<LoginDetails> findById(long id){
		return this.repo.findById(id);
	}
	
	public LoginDetails addUser(LoginDetails user) {
		return this.repo.save(user);
	}
	
	public List<LoginDetails> findAllUser(){
		return this.repo.findAll();
	}
}
