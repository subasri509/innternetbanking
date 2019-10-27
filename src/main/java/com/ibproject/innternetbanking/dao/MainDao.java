package com.ibproject.innternetbanking.dao;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ibproject.innternetbanking.model.DashBoard;
import com.ibproject.innternetbanking.model.DetailedStatemnt;
import com.ibproject.innternetbanking.model.FundTransfer;
import com.ibproject.innternetbanking.model.Transaction;
import com.ibproject.innternetbanking.model.UserRegistration;

@Repository
public class MainDao {
	
	@Autowired
	private RegistrationDao registartionDao;
	
	private Map<Integer, Transaction> txnDetails = new ConcurrentHashMap<>();
	private volatile Integer id = 0;

	public DashBoard getDashBoard(String username) {
		DashBoard dashBoard = new DashBoard();
		dashBoard.setBalance(registartionDao.getRegistration(username).getBalance());
		dashBoard.setLastVisitedDate(registartionDao.getRegistration(username).getLastLoogedinDate());
		dashBoard.setName(registartionDao.getRegistration(username).getFullName());
		return dashBoard;
	}

	public DetailedStatemnt getDetailedStatement(String username) {
		
		DetailedStatemnt detailedStatemnt = new DetailedStatemnt();
		List<Transaction> txnList = txnDetails.values().stream()
				.filter(txn -> txn.getPayerName().equals(username))
				.collect(Collectors.toList());
		detailedStatemnt.setTransactions(txnList);
		return detailedStatemnt;
	}

	public Transaction transferFunds(String userName, FundTransfer fundTransfer) {
		Transaction txn = new Transaction();
		txn.setDate(new Date());
		txn.setPayeeName(fundTransfer.getPayee().getName());
		txn.setPayeeAcNo(fundTransfer.getPayee().getAccountNo());
		txn.setPayerName(userName);
		
		UserRegistration userReg = registartionDao.getRegistration(userName);
		userReg.setBalance(userReg.getBalance() - fundTransfer.getAmount());
		txn.setPayerAccountNo(userReg.getAccountNo());
		txn.setAmount(fundTransfer.getAmount());
		id = id + 1;
		txnDetails.put(id, txn);
		return txn;
	}

	public Map<Integer, Transaction> getTxnDetails() {
		return txnDetails;
	}
	
	

}
