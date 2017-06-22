package com.microservice.microservice2Client;

public class Movies {

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
