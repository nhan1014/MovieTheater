package com.spring.mock.movietheater.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.mock.movietheater.model.Movies;

@Repository
public interface MovieRepository extends CrudRepository<Movies, String>{
	//TO-DO
}
