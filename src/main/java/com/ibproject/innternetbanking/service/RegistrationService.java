package com.ibproject.innternetbanking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibproject.innternetbanking.dao.RegistrationDao;
import com.ibproject.innternetbanking.model.UserLoginDetails;
import com.ibproject.innternetbanking.model.UserRegistration;

@Service
public class RegistrationService {
	
	@Autowired
	private RegistrationDao regDao;
	
	public UserLoginDetails addUserRegistration(UserRegistration userReg){
		return regDao.addUserRegistration(userReg);
	}

}
