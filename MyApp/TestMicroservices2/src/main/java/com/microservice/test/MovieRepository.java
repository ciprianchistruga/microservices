package com.microservice.test;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "/movies")
public interface MovieRepository extends JpaRepository<Movies, Integer>{

}
