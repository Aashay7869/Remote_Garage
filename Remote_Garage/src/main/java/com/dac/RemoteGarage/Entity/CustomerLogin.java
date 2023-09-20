package com.dac.RemoteGarage.Entity;


public class CustomerLogin {
private String id;
private String pass;



public CustomerLogin() {
	super();
}
public CustomerLogin(String id, String pass) {
	super();
	this.id = id;
	this.pass = pass;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getPass() {
	return pass;
}
public void setPass(String pass) {
	this.pass = pass;
}
@Override
public String toString() {
	return "CustomerLogin [id=" + id + ", pass=" + pass + "]";
}



}
