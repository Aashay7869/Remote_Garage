package com.dac.RemoteGarage.Entity;



import jakarta.persistence.Entity;

import jakarta.persistence.Id;

@Entity
public class Customer {
	@Id
	private	String cId;
	private	String cName;
	private	String cEmail;
	private	String cPass;
	private String cContactNo;
	private String cGender;
	private String cFeedback;

	
	
	
	
	public Customer() {
		super();
	}
	public Customer(String cId, String cName, String cEmail, String cPass, String cContactNo, String cGender,
			String cFeedback, String cVehNo, String cVehModel, String cVehProb, String cLocation) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.cEmail = cEmail;
		this.cPass = cPass;
		this.cContactNo = cContactNo;
		this.cGender = cGender;
		this.cFeedback = cFeedback;

	}
	public String getcId() {
		return cId;
	}
	public void setcId(String cId) {
		this.cId = cId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getcEmail() {
		return cEmail;
	}
	public void setcEmail(String cEmail) {
		this.cEmail = cEmail;
	}
	public String getcPass() {
		return cPass;
	}
	public void setcPass(String cPass) {
		this.cPass = cPass;
	}
	public String getcContactNo() {
		return cContactNo;
	}
	public void setcContactNo(String cContactNo) {
		this.cContactNo = cContactNo;
	}
	public String getcGender() {
		return cGender;
	}
	public void setcGender(String cGender) {
		this.cGender = cGender;
	}
	public String getcFeedback() {
		return cFeedback;
	}
	public void setcFeedback(String cFeedback) {
		this.cFeedback = cFeedback;
	}
	
	@Override
	public String toString() {
		return "Customer [cId=" + cId + ", cName=" + cName + ", cEmail=" + cEmail + ", cPass=" + cPass + ", cContactNo="
				+ cContactNo + ", cGender=" + cGender + ", cFeedback=" + cFeedback + ", cVehNo=" + "]";
	}
	
	
	



	
}
	
	