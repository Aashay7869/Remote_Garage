package com.dac.RemoteGarage.Entity;



import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;


@Entity
@Embeddable
public class VehicleProblem {
@Id
@GeneratedValue
private int vId;
private String vModel;
private String vNumber;
private String vProblem;
private String vLocation;
private String vProblemImage;
private String cId;




public VehicleProblem() {
	super();
}




public VehicleProblem(int vId, String vModel, String vNumber, String vProblem, String vLocation, String vProblemImage,
		String cId) {
	super();
	this.vId = vId;
	this.vModel = vModel;
	this.vNumber = vNumber;
	this.vProblem = vProblem;
	this.vLocation = vLocation;
	this.vProblemImage = vProblemImage;
	this.cId = cId;
}




public VehicleProblem(String vModel, String vNumber, String vProblem, String vLocation, String vProblemImage,
		String cId) {
	super();
	this.vModel = vModel;
	this.vNumber = vNumber;
	this.vProblem = vProblem;
	this.vLocation = vLocation;
	this.vProblemImage = vProblemImage;
	this.cId = cId;
}




public int getvId() {
	return vId;
}




public void setvId(int vId) {
	this.vId = vId;
}




public String getvModel() {
	return vModel;
}




public void setvModel(String vModel) {
	this.vModel = vModel;
}




public String getvNumber() {
	return vNumber;
}




public void setvNumber(String vNumber) {
	this.vNumber = vNumber;
}




public String getvProblem() {
	return vProblem;
}




public void setvProblem(String vProblem) {
	this.vProblem = vProblem;
}




public String getvLocation() {
	return vLocation;
}




public void setvLocation(String vLocation) {
	this.vLocation = vLocation;
}




public String getvProblemImage() {
	return vProblemImage;
}




public void setvProblemImage(String vProblemImage) {
	this.vProblemImage = vProblemImage;
}




public String getcId() {
	return cId;
}




public void setcId(String cId) {
	this.cId = cId;
}










}



