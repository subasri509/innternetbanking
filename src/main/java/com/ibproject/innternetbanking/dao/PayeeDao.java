package com.ibproject.innternetbanking.dao;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.ibproject.innternetbanking.model.Payee;
import com.ibproject.innternetbanking.util.IBUtils;

@Repository
public class PayeeDao {
	
	private Map<Integer, Payee> listOfPayees = new ConcurrentHashMap<>();
	private volatile Integer id = 0;
	
	public List<Payee> getPayeeList(){
		List<Payee> payeeList = listOfPayees.keySet().stream()
				.map(key -> listOfPayees.get(key))
				.collect(Collectors.toList());
		return payeeList;
	}
	
	public Payee getPayee(Integer id){
		return listOfPayees.get(id);
	}
	
	public Payee addPayee(Payee payee){
		id = id +1;
		payee.setId(id);
		payee.setIsOTPVerified(Boolean.FALSE);
		payee.setOtp(IBUtils.generateOTP());
		listOfPayees.put(id, payee);
		return payee;
	}
	
	public Payee updatePayee(Payee payee){
		listOfPayees.put(payee.getId(), payee);
		return listOfPayees.get(payee.getId());
	}
	
	public Payee deletePayee(Integer id){
		Payee payee = listOfPayees.remove(id);
		return payee;
	}

	public Payee verifyOTP(Integer payeeId, Integer otp) {
		
		Payee p = listOfPayees.get(payeeId);
		if(p.getOtp().equals(otp)){
			p.setIsOTPVerified(Boolean.TRUE);
			p.setOtp(null);
		}
		return null;
	}

}
