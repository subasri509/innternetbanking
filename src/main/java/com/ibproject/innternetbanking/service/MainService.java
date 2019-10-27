package com.ibproject.innternetbanking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibproject.innternetbanking.dao.MainDao;
import com.ibproject.innternetbanking.model.DashBoard;
import com.ibproject.innternetbanking.model.DetailedStatemnt;
import com.ibproject.innternetbanking.model.FundTransfer;
import com.ibproject.innternetbanking.model.Transaction;

@Service
public class MainService {
	
	@Autowired
	private MainDao mainDao;

	public DashBoard getDashBoard(String username) {
		return mainDao.getDashBoard(username);
	}

	public DetailedStatemnt getDetailedStatement(String username) {
		return mainDao.getDetailedStatement(username);
	}

	public Transaction transferFunds(String userName, FundTransfer fundTransfer) {
		Transaction txn = mainDao.transferFunds(userName, fundTransfer);
		return txn;
		
	}

}
