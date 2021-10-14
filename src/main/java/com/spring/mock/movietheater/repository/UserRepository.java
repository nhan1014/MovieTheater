package com.spring.mock.movietheater.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.mock.movietheater.model.Users;

@Repository
public interface UserRepository extends CrudRepository<Users, String>{
	Users findUserByUserLoginName(String userLoginName);
}
