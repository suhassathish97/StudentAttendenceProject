package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.TeacherEntity;

public interface TeacherRepository extends JpaRepository<TeacherEntity, Long> {

}
