package com.microservice.test;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Movies {

	@Id
	private Integer movieId;
	private String name;
	
	public Integer getMovieId() {
		return movieId;
	}
	public void setMovieId(Integer movieId) {
		this.movieId = movieId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Movies() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Movies(String name) {
		super();
		this.name = name;
	}
	
	
}
