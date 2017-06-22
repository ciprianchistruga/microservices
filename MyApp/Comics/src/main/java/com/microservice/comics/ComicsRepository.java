package com.microservice.comics;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "/comics")
public interface ComicsRepository extends JpaRepository<Comics, Integer>{
	public List<Comics> findByComicname(String comicname);
}
