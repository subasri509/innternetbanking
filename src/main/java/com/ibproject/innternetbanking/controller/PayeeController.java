package com.ibproject.innternetbanking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ibproject.innternetbanking.model.Payee;
import com.ibproject.innternetbanking.service.PayeeService;

@RestController
public class PayeeController {
	
	@Autowired
	private PayeeService payeeService;
	
	@RequestMapping(path = "/payee", method = RequestMethod.GET)
	public List<Payee> getPayee(){
		return payeeService.getPayeeList();
	}
	
	@RequestMapping(path = "/payee/{id}", method = RequestMethod.GET)
	public Payee getPayee(@PathVariable Integer id){
		return payeeService.getPayee(id);
	}
	
	@RequestMapping(path = "/payee", method = RequestMethod.POST)
	public Payee addPayee(@RequestBody Payee payee){
		return payeeService.addPayee(payee);
	}
	
	@RequestMapping(path = "/payee/{id}", method = RequestMethod.PUT)
	public Payee updatePayee(@RequestBody Payee payee){
		return payeeService.updatePayee(payee);
	}
	
	@RequestMapping(path = "/payee/{id}", method = RequestMethod.DELETE)
	public Payee deletePayee(@PathVariable Integer id){
		return payeeService.deletePayee(id);
	}

}
