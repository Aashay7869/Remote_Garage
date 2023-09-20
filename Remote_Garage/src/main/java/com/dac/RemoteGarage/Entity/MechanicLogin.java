package com.dac.RemoteGarage.Entity;

public class MechanicLogin {
private String id;
private String pass;

public MechanicLogin() {
	super();
}

public MechanicLogin(String id, String pass) {
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
	return "MechanicLogin [id=" + id + ", pass=" + pass + "]";
}



}
