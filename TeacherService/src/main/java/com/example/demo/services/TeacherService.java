package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.TeacherEntity;

import com.example.demo.repositories.TeacherRepository;

public class TeacherService {
	@Autowired
	private TeacherRepository repo;
	
	public TeacherEntity add(TeacherEntity teacher) {
		return this.repo.save(teacher);
	}
	public List<TeacherEntity> findAll() {
		return this.repo.findAll();
	}
	public Optional<TeacherEntity> findById(long id) {
		return this.repo.findById(id);
	}
}
