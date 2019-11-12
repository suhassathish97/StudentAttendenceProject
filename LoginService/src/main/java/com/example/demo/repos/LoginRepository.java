package com.example.demo.repos;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.LoginDetails;

public interface LoginRepository extends JpaRepository<LoginDetails, Long> {
}
