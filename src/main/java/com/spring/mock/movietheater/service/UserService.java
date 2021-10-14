package com.spring.mock.movietheater.service;

import java.util.Optional;

import com.spring.mock.movietheater.model.Users;

public interface UserService {
	Iterable<Users> findAll();
	Optional<Users> findByUserLoginName(String userLoginName);
	int save(Users userModel);
}
