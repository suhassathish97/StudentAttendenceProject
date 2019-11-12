package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.TeacherEntity;
import com.example.demo.services.TeacherService;

@RestController
public class TeacherController {
	@Autowired
	private TeacherService service;
	
	@PostMapping(path="/teacher",produces = "application/json",consumes = "application/json")
	public TeacherEntity addStudent(@RequestBody TeacherEntity teacher) {
		return this.service.add(teacher);
	}
	@GetMapping(path="/teachers",produces = "application/json")
	public List<TeacherEntity> findAll(){
		return this.service.findAll();
	}
	@GetMapping(path="/teacher/{teacherId}",produces = "application/json")
	public TeacherEntity findById(@PathVariable("teacherId")long teacherId) {
		Optional<TeacherEntity> response=this.service.findById(teacherId);
		
		TeacherEntity found=null;
		if(response.isPresent()) {
			found=response.get();
		}
		return found;
	}

}
