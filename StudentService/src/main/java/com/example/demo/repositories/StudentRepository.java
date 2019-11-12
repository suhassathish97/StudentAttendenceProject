package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.StudentDetails;

@Repository
public interface StudentRepository extends JpaRepository<StudentDetails, Long> {

}
