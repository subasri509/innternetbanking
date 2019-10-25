package com.ibproject.innternetbanking.model;

public class Transaction {
	
	private Integer id;
	private String date;
	private String payeeAcNo;
	private String payeeName;
	private String toIFSC;
	private Integer amount;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getPayeeAcNo() {
		return payeeAcNo;
	}
	public void setPayeeAcNo(String payeeAcNo) {
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
