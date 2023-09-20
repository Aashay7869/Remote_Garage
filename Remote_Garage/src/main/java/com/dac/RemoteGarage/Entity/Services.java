package com.dac.RemoteGarage.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;

import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Services")
public class Services {
	
	
	
	@Id
	@GeneratedValue
	public long sId;
	

	public String sName;
	

	public String mId;


	public Services() {
		super();
	}


	public Services(long sId, String sName, String mId) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.mId = mId;
	}


	public Services(String sName, String mId) {
		super();
		this.sName = sName;
		this.mId = mId;
	}


	public long getsId() {
		return sId;
	}


	public void setsId(long sId) {
		this.sId = sId;
	}


	public String getsName() {
		return sName;
	}


	public void setsName(String sName) {
		this.sName = sName;
	}


	public String getmId() {
		return mId;
	}


	public void setmId(String mId) {
		this.mId = mId;
	}


	@Override
	public String toString() {
		return "Services [sId=" + sId + ", sName=" + sName + ", mId=" + mId + "]";
	}

	
	
}