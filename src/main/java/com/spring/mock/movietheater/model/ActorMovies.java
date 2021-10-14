package com.spring.mock.movietheater.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ActorMovies {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;

	@ManyToOne
	@JoinColumn(name = "movie_ids")
	private Movies movieId;
	
	@ManyToOne
	@JoinColumn(name = "actor_ids")
	private Actors actorId;
}
