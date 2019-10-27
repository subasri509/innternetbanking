package com.ibproject.innternetbanking.model;

import java.util.Date;

import org.springframework.lang.NonNull;

public class UserRegistration {
	
	@NonNull
	private String userName;
	@NonNull
	private String pwd;
	@NonNull
	private String confirmPwd;
	@NonNull
	private String fullName;
	@NonNull
	private String email;
	
	private Date regDate;
	
	private Date lastLoogedinDate;
	@NonNull
	private Long accountNo;
	@NonNull
	private Integer balance;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getConfirmPwd() {
		return confirmPwd;
	}
	public void setConfirmPwd(String confirmPwd) {
		this.confirmPwd = confirmPwd;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public Date getLastLoogedinDate() {
		return lastLoogedinDate;
	}
	public void setLastLoogedinDate(Date lastLoogedinDate) {
		this.lastLoogedinDate = lastLoogedinDate;
	}
	public Long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(Long accountNo) {
		this.accountNo = accountNo;
	}
	public Integer getBalance() {
		return balance;
	}
	public void setBalance(Integer balance) {
		this.balance = balance;
	}
	

}
