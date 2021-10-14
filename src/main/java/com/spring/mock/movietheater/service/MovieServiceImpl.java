package com.spring.mock.movietheater.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.mock.movietheater.model.Movies;
import com.spring.mock.movietheater.repository.MovieRepository;

@Service
public class MovieServiceImpl implements MovieService{
	
	@Autowired
	MovieRepository movieRepository;

	@Override
	public Iterable<Movies> findAll() {
		// TODO Auto-generated method stub
		return movieRepository.findAll();
	}

	@Override
	public Optional<Movies> findByActorName(String movieName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int save(Movies movie) {
		// TODO Auto-generated method stub
		return 0;
	}

}
