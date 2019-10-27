package com.ibproject.innternetbanking.model;

import java.util.Date;

public class DashBoard {
	
	private String Name;
	private Date lastVisitedDate;
	private Integer balance;
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Date getLastVisitedDate() {
		return lastVisitedDate;
	}
	public void setLastVisitedDate(Date lastVisitedDate) {
		this.lastVisitedDate = lastVisitedDate;
	}
	public Integer getBalance() {
		return balance;
	}
	public void setBalance(Integer balance) {
		this.balance = balance;
	}

}
