package com.ibproject.innternetbanking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibproject.innternetbanking.dao.PayeeDao;
import com.ibproject.innternetbanking.model.Payee;

@Service
public class PayeeService {
	
	@Autowired
	private PayeeDao payeeDao;
	
	public List<Payee> getPayeeList(){
		return payeeDao.getPayeeList();
	}
	
	public Payee getPayee(Integer id){
		return payeeDao.getPayee(id);
	}
	
	public Payee addPayee(Payee payee){
		return payeeDao.addPayee(payee);
	}
	
	public Payee updatePayee(Payee payee){
		return payeeDao.updatePayee(payee);
	}
	
	public Payee deletePayee(Integer id){
		return payeeDao.deletePayee(id);
	}

	public Payee verifyOTP(Integer payeeId, Integer otp) {
		return payeeDao.verifyOTP(payeeId, otp);
	}

}
