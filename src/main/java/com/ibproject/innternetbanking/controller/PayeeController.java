package com.ibproject.innternetbanking.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
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
	public ResponseEntity<Payee> addPayee(@Valid @RequestBody Payee payee){
		Payee p = payeeService.addPayee(payee);
		return ResponseEntity.ok(p);
	}
	
	@RequestMapping(path = "/payee/{id}", method = RequestMethod.PUT)
	public Payee updatePayee(@RequestBody Payee payee){
		return payeeService.updatePayee(payee);
	}
	
	@RequestMapping(path = "/payee/{id}", method = RequestMethod.DELETE)
	public Payee deletePayee(@PathVariable Integer id){
		return payeeService.deletePayee(id);
	}
	
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public Map<String, String> handleValidationExceptions(
			MethodArgumentNotValidException  ex) {
	    Map<String, String> errors = new HashMap<>();
	    ex.getBindingResult().getAllErrors().forEach((error) -> {
	        String fieldName = ((FieldError) error).getField();
	        String errorMessage = error.getDefaultMessage();
	        errors.put(fieldName, errorMessage);
	    });
	    return errors;
	}

}
