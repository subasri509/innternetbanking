package com.ibproject.innternetbanking.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibproject.innternetbanking.dao.LoginLogoutDao;
import com.ibproject.innternetbanking.dao.RegistrationDao;
import com.ibproject.innternetbanking.model.UserLogin;
import com.ibproject.innternetbanking.model.UserLoginDetails;
import com.ibproject.innternetbanking.model.UserRegistration;

@Service
public class LoginLogoutService {
	
	@Autowired
	private LoginLogoutDao llDao;
	
	@Autowired
	private RegistrationDao regDao;
	
	public UserLoginDetails doLogin(UserLogin userLogin){
		UserLoginDetails loginDetails = UserLoginDetails.map(userLogin);
		
		UserRegistration userReg = regDao.getRegistration(userLogin.getUserName());
		if(userReg.getUserName().equals(userLogin.getUserName()) &&
				userReg.getPwd().equals(userLogin.getPwd())){
			loginDetails.setIsUserLoggedIn(Boolean.TRUE);
			loginDetails.setLoginDate(new Date());
			loginDetails.setMessage("Login Successful!..");
			llDao.doLogin(loginDetails);
			return loginDetails;
		}
		loginDetails.setIsUserLoggedIn(Boolean.FALSE);
		loginDetails.setMessage("Login Failed...");
		return loginDetails;
		
	}
	
	public UserLoginDetails doLogout(String userName){
		UserLoginDetails userLoginDetails = llDao.doLogout(userName);
		UserRegistration userReg = regDao.getRegistration(userName);
		userReg.setLastLoogedinDate(userLoginDetails.getLoginDate());
		userLoginDetails.setIsUserLoggedIn(Boolean.FALSE);
		userLoginDetails.setPwd(null);
		return userLoginDetails;
	}

}
