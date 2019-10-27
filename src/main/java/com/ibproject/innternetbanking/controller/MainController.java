package com.ibproject.innternetbanking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ibproject.innternetbanking.model.DashBoard;
import com.ibproject.innternetbanking.model.DetailedStatemnt;
import com.ibproject.innternetbanking.model.FundTransfer;
import com.ibproject.innternetbanking.model.UserLogin;
import com.ibproject.innternetbanking.model.UserLoginDetails;
import com.ibproject.innternetbanking.model.UserRegistration;
import com.ibproject.innternetbanking.service.LoginLogoutService;
import com.ibproject.innternetbanking.service.MainService;
import com.ibproject.innternetbanking.service.RegistrationService;

@RestController
public class MainController {
	
	@Autowired
	private MainService mainService;
	
	@Autowired
	private RegistrationService regService;
	
	@Autowired
	private LoginLogoutService llService;
	
	@RequestMapping(path = "/register", method = RequestMethod.POST)
	public ResponseEntity<UserLoginDetails> doRegister(@RequestBody UserRegistration userReg){
		UserLoginDetails userLoginDetails = regService.addUserRegistration(userReg);
		return ResponseEntity.ok(userLoginDetails);
	}
	
	@RequestMapping(path = "/login", method = RequestMethod.POST)
	public ResponseEntity<UserLoginDetails> doLogin(@RequestBody UserLogin userLogin){
		UserLoginDetails userLoginDetails = llService.doLogin(userLogin);
		return ResponseEntity.ok(userLoginDetails);
	}
	
	@RequestMapping(path = "/logout/{userName}", method = RequestMethod.POST)
	public ResponseEntity<UserLoginDetails> doLogout(@PathVariable String userName){
		UserLoginDetails userLoginDetails = llService.doLogout(userName);
		return ResponseEntity.ok(userLoginDetails);
	}
	
	@RequestMapping(path = "/dashboard/{userName}", method = RequestMethod.GET)
	public ResponseEntity<DashBoard> getDashBoard(@PathVariable String userName){
		DashBoard db = mainService.getDashBoard(userName);
		return ResponseEntity.ok(db);
	}
	
	@RequestMapping(path = "/transfer/{userName}", method = RequestMethod.POST)
	public ResponseEntity<String> transferFunds(@RequestBody FundTransfer fundTransfer, @PathVariable String userName){
		mainService.transferFunds(userName, fundTransfer);
		return ResponseEntity.ok("transfered amount to "+ fundTransfer.getPayee().getName());
		
	}
	
	@RequestMapping(path = "/detailedstmt/{userName}", method = RequestMethod.GET)
	public ResponseEntity<DetailedStatemnt> getDetailedStatement(@PathVariable String userName){
		DetailedStatemnt ds =  mainService.getDetailedStatement(userName);
		return ResponseEntity.ok(ds);
		
	}

}
