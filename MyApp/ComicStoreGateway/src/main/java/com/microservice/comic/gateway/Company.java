package com.microservice.comic.gateway;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class Company {

	private Integer companyid;
	private String companyname;
	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Company(Integer companyid, String companyname) {
		super();
		this.companyid = companyid;
		this.companyname = companyname;
	}
	public Integer getCompanyid() {
		return companyid;
	}
	public void setCompanyid(Integer companyid) {
		this.companyid = companyid;
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
}
