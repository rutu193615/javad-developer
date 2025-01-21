package com.module;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class AdharCard {
	@Id
	private int aid;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	private String  aname;

}
