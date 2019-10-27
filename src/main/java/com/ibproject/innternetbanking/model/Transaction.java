package com.ibproject.innternetbanking.model;

import java.util.Date;

public class Transaction {
	
	private Integer id;
	private String payerName;
	private Long payerAccountNo;
	private Date date;
	private Long payeeAcNo;
	private String payeeName;
	private String toIFSC;
	private Integer amount;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPayerName() {
		return payerName;
	}
	public void setPayerName(String payerName) {
		this.payerName = payerName;
	}
	public Long getPayerAccountNo() {
		return payerAccountNo;
	}
	public void setPayerAccountNo(Long payerAccountNo) {
		this.payerAccountNo = payerAccountNo;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Long getPayeeAcNo() {
		return payeeAcNo;
	}
	public void setPayeeAcNo(Long payeeAcNo) {
		this.payeeAcNo = payeeAcNo;
	}
	public String getPayeeName() {
		return payeeName;
	}
	public void setPayeeName(String payeeName) {
		this.payeeName = payeeName;
	}
	public String getToIFSC() {
		return toIFSC;
	}
	public void setToIFSC(String toIFSC) {
		this.toIFSC = toIFSC;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}

}
