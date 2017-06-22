package com.microservice.player;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

@RestResource(/*path="test", rel="test"*/)
public interface MovieDAO extends CrudRepository<Movies, Integer>{

	List<Movies> findAll();
	Movies findByName(String name);
}
