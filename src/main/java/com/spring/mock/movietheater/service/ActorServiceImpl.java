package com.spring.mock.movietheater.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.mock.movietheater.model.Actors;
import com.spring.mock.movietheater.repository.ActorRepository;

@Service
public class ActorServiceImpl implements ActorService{
	
	@Autowired
	ActorRepository actorRepository;

	@Override
	public Iterable<Actors> findAll() {
		// TODO Auto-generated method stub
		return actorRepository.findAll();
	}

	@Override
	public Optional<Actors> findByActorName(String actorName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int save(Actors actor) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
