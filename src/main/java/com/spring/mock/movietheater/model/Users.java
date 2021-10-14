package com.spring.mock.movietheater.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Users {
	
	@Id
	@Column(columnDefinition = "char(7)")
	private String userId;
	
	@Column(columnDefinition = "varchar(50)", nullable = false, unique = true)
	private String userLoginName;
	
	@Column(columnDefinition = "varchar(50)", nullable = false)
	private String userFullName;
	
	@Column(columnDefinition = "varchar(50)", nullable = false)
	private String userPassword;
	
	@Column(columnDefinition = "varchar(50)", nullable = true, unique = true)
	private String userEmail;
	
	@Column(columnDefinition = "varchar(50)", nullable = true)
	private String userBirthday;
	
	@Column(columnDefinition = "char(10)", nullable = true, unique = true)
	private String userPhoneNumber;
	
	@Column(columnDefinition = "TIMESTAMP")
	private String createdDate;
	
	@Column(columnDefinition = "TIMESTAMP")
	private String lastLogin;
}
