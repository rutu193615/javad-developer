package com.module;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
@Entity
public class Person {
	@Id
	private int pid;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public AdharCard getAd() {
		return ad;
	}
	public void setAd(AdharCard ad) {
		this.ad = ad;
	}
	private String pname;
	@OneToOne(cascade = CascadeType.ALL)
	private AdharCard ad;
	
	

}
