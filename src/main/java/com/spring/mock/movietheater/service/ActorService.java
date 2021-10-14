package com.spring.mock.movietheater.service;

import java.util.Optional;

import com.spring.mock.movietheater.model.Actors;

public interface ActorService {

	Iterable<Actors> findAll();
	Optional<Actors> findByActorName(String actorName);
	int save(Actors actor);
}
