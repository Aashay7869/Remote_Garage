package com.dac.RemoteGarage.Entity;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private	int cust_Id;
	private	String cust_Name;
	private	String cust_Email;
	private	String cust_Pass;
	private String cust_contactNo;
	private String cust_gender;
	private String cust_feedback;
	private String cust_vehNo;
	private	String cust_veh_model;
	private	String cust_vehProb;
	private	String cust_location;
	public int getCust_Id() {
		return cust_Id;
	}
	
	

	



	public Customer() {
		super();
	}







	public void setCust_location(String cust_location) {
		this.cust_location = cust_location;
	}



	public String getCust_Name() {
		return cust_Name;
	}
	public void setCust_Name(String cust_Name) {
		this.cust_Name = cust_Name;
	}
	public String getCust_Email() {
		return cust_Email;
	}
	public void setCust_Email(String cust_Email) {
		this.cust_Email = cust_Email;
	}
	public String getCust_Pass() {
		return cust_Pass;
	}
	public void setCust_Pass(String cust_Pass) {
		this.cust_Pass = cust_Pass;
	}
	public String getCust_contactNo() {
		return cust_contactNo;
	}
	public void setCust_contactNo(String cust_contactNo) {
		this.cust_contactNo = cust_contactNo;
	}
	public String getCust_gender() {
		return cust_gender;
	}
	public void setCust_gender(String cust_gender) {
		this.cust_gender = cust_gender;
	}
	public String getCust_feedback() {
		return cust_feedback;
	}
	public void setCust_feedback(String cust_feedback) {
		this.cust_feedback = cust_feedback;
	}
	public String getCust_vehNo() {
		return cust_vehNo;
	}
	public void setCust_vehNo(String cust_vehNo) {
		this.cust_vehNo = cust_vehNo;
	}
	public String getCust_veh_model() {
		return cust_veh_model;
	}
	public void setCust_veh_model(String cust_veh_model) {
		this.cust_veh_model = cust_veh_model;
	}
	public String getCust_vehProb() {
		return cust_vehProb;
	}
	public void setCust_vehProb(String cust_vehProb) {
		this.cust_vehProb = cust_vehProb;
	}
	
	public String getCust_location() {
		return cust_location;
	}
	
	public Customer(String cust_Email, String cust_Pass) {
		
		this.cust_Email = cust_Email;
		this.cust_Pass = cust_Pass;
	}



	public Customer(String cust_Name, String cust_Email, String cust_Pass, String cust_contactNo, String cust_gender,
			String cust_vehNo) {
		
		this.cust_Name = cust_Name;
		this.cust_Email = cust_Email;
		this.cust_Pass = cust_Pass;
		this.cust_contactNo = cust_contactNo;
		this.cust_gender = cust_gender;
		this.cust_vehNo = cust_vehNo;
	}
}
	
	