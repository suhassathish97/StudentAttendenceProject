package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.StudentDetails;
import com.example.demo.repositories.StudentRepository;

@Service
public class StudentService {
	@Autowired
	private StudentRepository repo;
	
	public StudentDetails add(StudentDetails student) {
		return this.repo.save(student);
	}
	public List<StudentDetails> findAll() {
		return this.repo.findAll();
	}
	public Optional<StudentDetails> findById(long id) {
		return this.repo.findById(id);
	}

}
