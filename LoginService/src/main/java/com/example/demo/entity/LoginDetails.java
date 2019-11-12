package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="suhas_login")
@Data
public class LoginDetails {
	
	@Id
	public long userId;
	public String password;
	public String typeOfUser;
}
