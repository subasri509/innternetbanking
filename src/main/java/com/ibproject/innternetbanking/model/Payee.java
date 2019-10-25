package com.ibproject.innternetbanking.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Payee {
	private Integer id;
	
	@NotBlank(message = "Name is required")
	private String name;
	
	@NotBlank(message = "Nick Name is required")
	@Pattern(regexp = "[A-Za-z0-9]+", message = "Nick name must be Alphanumeric only")
	private String nickName;
	
	@NotBlank(message = "Account No is required.")
	@Size(min = 12, max=12, message = "Account No length must be 12.")
	private Long accountNo;
	
	@NotBlank(message = "IFSC Code is required")
	@Pattern(regexp = "[A-Za-z0-9]+", message = "Nick name must be Alphanumeric only")
	private String ifscCode;
	
	private Boolean isActive;
	private String createdTime;
	private String updatedTime;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public Long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(Long accountNo) {
		this.accountNo = accountNo;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	public Boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
	public String getCreatedTime() {
		return createdTime;
	}
	public void setCreatedTime(String createdTime) {
		this.createdTime = createdTime;
	}
	public String getUpdatedTime() {
		return updatedTime;
	}
	public void setUpdatedTime(String updatedTime) {
		this.updatedTime = updatedTime;
	}
	

}
