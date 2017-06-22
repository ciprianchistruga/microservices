package com.microservice.comic.gateway;

import java.util.Date;

public class ComicCompany {

	private Comics comic;
	private Company company;
	public ComicCompany() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ComicCompany(Comics comic, Company company) {
		super();
		this.comic = comic;
		this.company = company;
	}
	public Comics getComic() {
		return comic;
	}
	public void setComic(Comics comic) {
		this.comic = comic;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	
	
	
}
