package com.microservice.company;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "/company")
public interface CompanyRepository extends JpaRepository<Company, Integer>{

}
