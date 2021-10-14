package com.spring.mock.movietheater.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.mock.movietheater.model.Actors;
import com.spring.mock.movietheater.service.ActorService;

@RestController
public class ActorController {

	@Autowired
	ActorService actorService;
	
	@GetMapping("/actors")
	public Iterable<Actors> all() {
	    return actorService.findAll();
	}
	
}
