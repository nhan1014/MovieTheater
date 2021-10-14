package com.spring.mock.movietheater.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.mock.movietheater.model.Actors;

@Repository
public interface ActorRepository extends CrudRepository<Actors, String>{

}
