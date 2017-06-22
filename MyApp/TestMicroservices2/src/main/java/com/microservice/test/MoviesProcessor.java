package com.microservice.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;

@MessageEndpoint
public class MoviesProcessor {

	/*private final MovieRepository movieRepo;
	
	@Autowired	
	public MoviesProcessor(MovieRepository movieRepo) {
		super();
		this.movieRepo = movieRepo;
	}

	@ServiceActivator(inputChannel = "input")
	public void acceptNewMovies(String mv) {
		this.movieRepo.save(new Movies());
	}*/
}
