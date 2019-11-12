package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.StudentDetails;
import com.example.demo.services.StudentService;

@RestController
public class StudentController {
	@Autowired
	private StudentService service;
	
	@PostMapping(path="/student",produces = "application/json",consumes = "application/json")
	public StudentDetails addStudent(@RequestBody StudentDetails student) {
		return this.service.add(student);
	}
	@GetMapping(path="/students",produces = "application/json")
	public List<StudentDetails> findAll(){
		return this.service.findAll();
	}
	@GetMapping(path="/student/{rollNumber}",produces = "application/json")
	public StudentDetails findById(@PathVariable("rollNumber")long rollNumber) {
		Optional<StudentDetails> response=this.service.findById(rollNumber);
		
		StudentDetails found=null;
		if(response.isPresent()) {
			found=response.get();
		}
		return found;
	}

	
}
