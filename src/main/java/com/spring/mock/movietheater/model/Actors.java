package com.spring.mock.movietheater.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Actors {
	
	@Id
	@Column(columnDefinition = "char(7)")
	private String actorId;
	
	@Column(columnDefinition = "varchar(100)", nullable = false)
	private String actorName;
	
	@Column(columnDefinition = "varchar(10)", nullable = false)
	private String actorBirthday;
	
	@OneToMany(mappedBy = "movieId", cascade = CascadeType.ALL)
	private Set<Movies> listOfMovies;
	
}
