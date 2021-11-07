package com.spring.mock.movietheater.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class Movies {

	@Id
	@Column(columnDefinition = "char(7)")
	private String movieId;
	
	@Column(columnDefinition = "varchar(100)", nullable = false)
	private String movieName;
	
	@Column(columnDefinition = "varchar(100)", nullable = false)
	private String moviesDirector;
	
	@Column(columnDefinition = "varchar(20)", nullable = false)
	private String movieDuration;
	
	@Column(columnDefinition = "varchar(4)", nullable = false)
	private String releaseYear;
	
	@OneToMany(mappedBy = "actorId", cascade = CascadeType.ALL)
	private List<Actors> listOfActors = new ArrayList<>();
	
	@Column(columnDefinition = "varchar(200)", nullable = true)
	private String moviePoster;
	
}
