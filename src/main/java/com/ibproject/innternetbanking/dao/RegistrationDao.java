package com.ibproject.innternetbanking.dao;

import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Repository;

import com.ibproject.innternetbanking.model.UserLoginDetails;
import com.ibproject.innternetbanking.model.UserRegistration;

@Repository
public class RegistrationDao {
	
	private Map<String, UserRegistration> regDeatils = new ConcurrentHashMap<>();
	
	public UserLoginDetails addUserRegistration(UserRegistration userReg){
		userReg.setRegDate(new Date());
		regDeatils.put(userReg.getUserName(), userReg);
		UserLoginDetails userLoginDetails = new UserLoginDetails();
		userLoginDetails.setUserName(userReg.getUserName());
		userLoginDetails.setPwd(userReg.getPwd());
		userLoginDetails.setIsUserLoggedIn(Boolean.FALSE);
		return userLoginDetails;
	}
	
	public UserRegistration getRegistration(String userName){
		return regDeatils.get(userName);
	}

}
