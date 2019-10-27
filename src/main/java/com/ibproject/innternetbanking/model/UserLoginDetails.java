package com.ibproject.innternetbanking.model;

import java.util.Date;

public class UserLoginDetails {
	
	private String userName;
	private String pwd;
	private Boolean isUserLoggedIn;
	private Date loginDate;
	private Date lastLoginDate;
	private String message;
	
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
	public Boolean getIsUserLoggedIn() {
		return isUserLoggedIn;
	}
	public void setIsUserLoggedIn(Boolean isUserLoggedIn) {
		this.isUserLoggedIn = isUserLoggedIn;
	}
	public Date getLoginDate() {
		return loginDate;
	}
	public void setLoginDate(Date loginDate) {
		this.loginDate = loginDate;
	}
	public Date getLastLoginDate() {
		return lastLoginDate;
	}
	public void setLastLoginDate(Date lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	public static UserLoginDetails map(UserLogin userLogin){
		UserLoginDetails loginDetails = new UserLoginDetails();
		loginDetails.setUserName(userLogin.getUserName());
		loginDetails.setPwd(userLogin.getPwd());
		return loginDetails;
	}

}
