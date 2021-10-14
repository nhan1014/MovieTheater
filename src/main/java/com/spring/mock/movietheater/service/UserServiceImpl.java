package com.spring.mock.movietheater.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.mock.movietheater.model.Users;
import com.spring.mock.movietheater.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepository userRepository;

	@Override
	public Iterable<Users> findAll() {
		Iterable<Users> listUser = userRepository.findAll();
		return listUser;
	}

	@Override
	public Optional<Users> findByUserLoginName(String userLoginName) {
		Users userModel = userRepository.findUserByUserLoginName(userLoginName);
		Optional<Users> user = Optional.ofNullable(userModel);
		return user;
	}

	@Override
	public int save(Users userModel) {
		userRepository.save(userModel);
		return 1;
	}

}
