package com.microservice.comic.gateway;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class Comics {

	private Integer comicid;
	private String comicname;
	private Date comicreleaseyear;
	private String comicdetails;
	private Integer companyid;
	public Comics() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Comics(Integer comicid, String comicname, Date comicreleaseyear, String comicdetails, Integer companyid) {
		super();
		this.comicid = comicid;
		this.comicname = comicname;
		this.comicreleaseyear = comicreleaseyear;
		this.comicdetails = comicdetails;
		this.companyid = companyid;
	}
	public Integer getComicid() {
		return comicid;
	}
	public void setComicid(Integer comicid) {
		this.comicid = comicid;
	}
	public String getComicname() {
		return comicname;
	}
	public void setComicname(String comicname) {
		this.comicname = comicname;
	}
	public Date getComicreleaseyear() {
		return comicreleaseyear;
	}
	public void setComicreleaseyear(Date comicreleaseyear) {
		this.comicreleaseyear = comicreleaseyear;
	}
	public String getComicdetails() {
		return comicdetails;
	}
	public void setComicdetails(String comicdetails) {
		this.comicdetails = comicdetails;
	}
	public Integer getCompanyid() {
		return companyid;
	}
	public void setCompanyid(Integer companyid) {
		this.companyid = companyid;
	}
}
