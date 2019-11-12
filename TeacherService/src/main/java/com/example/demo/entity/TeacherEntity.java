package com.example.demo.entity;

import javax.persistence.Id;

public class TeacherEntity {
	@Id
	private long teacherId;
	private String teacherName;
}
