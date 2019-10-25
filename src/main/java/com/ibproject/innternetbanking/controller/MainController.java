package com.ibproject.innternetbanking.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ibproject.innternetbanking.model.DashBoard;
import com.ibproject.innternetbanking.model.DetailedStatemnt;
import com.ibproject.innternetbanking.model.FundTransfer;
import com.ibproject.innternetbanking.service.MainService;

@RestController
public class MainController {
	
	private MainService mainService;
	
	@RequestMapping(path = "/dashboard/{username}", method = RequestMethod.GET)
	public ResponseEntity<DashBoard> getDashBoard(@PathVariable String username){
		DashBoard db = mainService.getDashBoard(username);
		return ResponseEntity.ok(db);
	}
	
	@RequestMapping(path = "/transfer/{username}", method = RequestMethod.POST)
	public ResponseEntity<String> transferFunds(@RequestBody FundTransfer fundTransfer, @PathVariable String username){
		//Yet to do logic
		return ResponseEntity.ok("transfered amount to "+ fundTransfer.getPayee().getName());
		
	}
	
	@RequestMapping(path = "/detailedstmt/{username}", method = RequestMethod.GET)
	public ResponseEntity<DetailedStatemnt> getDetailedStatement(@PathVariable String username){
		
		DetailedStatemnt ds =  mainService.getDetailedStatement(username);
		return ResponseEntity.ok(ds);
		
	}

}
