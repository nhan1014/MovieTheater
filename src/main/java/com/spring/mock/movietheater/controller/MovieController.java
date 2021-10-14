package com.spring.mock.movietheater.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.mock.movietheater.model.Movies;
import com.spring.mock.movietheater.service.MovieService;

@RestController
public class MovieController {
	
	@Autowired
	MovieService movieService;
	
	@GetMapping("/movies")
	public Iterable<Movies> all() {
	    return movieService.findAll();
	}
}
