package com.ibproject.innternetbanking.dao;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.springframework.stereotype.Repository;
import com.ibproject.innternetbanking.model.UserLoginDetails;

@Repository
public class LoginLogoutDao {
	
	private Map<String, UserLoginDetails> loggedInUsers = new ConcurrentHashMap<>();

	public void doLogin(UserLoginDetails loginDetails) {
		loggedInUsers.put(loginDetails.getUserName(), loginDetails);
		
	}

	public UserLoginDetails doLogout(String userName) {
		UserLoginDetails userLoginDetails = loggedInUsers.remove(userName);
		return userLoginDetails;
		
	}

}
