package com.microservice.player;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@Entity
@XmlRootElement (name = "movies")
@XmlAccessorType(XmlAccessType.NONE)
public class Movies {

	@Id
	@XmlAttribute
	Integer movieId;
	@XmlElement
	String name;

	public Movies(String name) {
		super();
		this.name = name;
	}

	public Movies() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public Integer getMovieId() {
		return movieId;
	}

	public void setMovieId(Integer movieId) {
		this.movieId = movieId;
	}
	
	
	
}
