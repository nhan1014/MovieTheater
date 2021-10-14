package com.spring.mock.movietheater.service;

import java.util.Optional;

import com.spring.mock.movietheater.model.Movies;

public interface MovieService {
	
	Iterable<Movies> findAll();
	Optional<Movies> findByActorName(String movieName);
	int save(Movies movie);
}
