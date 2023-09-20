package com.dac.RemoteGarage.Entity;


import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Serviceprovider")
public class Mechanic {

	@Id
	
	public String mId;
	

	public String mName;
	
	

	public String mEmail;
	

	public String mPassword;
	

	public String mMobile;
	

	public String mShopType;
	
	
	public String mLocation;
	public String mPincode;
	public Mechanic() {
		super();
	}
	public Mechanic(String mId, String mName, String mEmail, String mPassword, String mMobile, String mShopType,
			String mLocation, String mPincode) {
		super();
		this.mId = mId;
		this.mName = mName;
		this.mEmail = mEmail;
		this.mPassword = mPassword;
		this.mMobile = mMobile;
		this.mShopType = mShopType;
		this.mLocation = mLocation;
		this.mPincode = mPincode;
	}
	public Mechanic(String mName, String mEmail, String mPassword, String mMobile, String mShopType, String mLocation,
			String mPincode) {
		super();
		this.mName = mName;
		this.mEmail = mEmail;
		this.mPassword = mPassword;
		this.mMobile = mMobile;
		this.mShopType = mShopType;
		this.mLocation = mLocation;
		this.mPincode = mPincode;
	}
	public String getmId() {
		return mId;
	}
	public void setmId(String mId) {
		this.mId = mId;
	}
	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	public String getmEmail() {
		return mEmail;
	}
	public void setmEmail(String mEmail) {
		this.mEmail = mEmail;
	}
	public String getmPassword() {
		return mPassword;
	}
	public void setmPassword(String mPassword) {
		this.mPassword = mPassword;
	}
	public String getmMobile() {
		return mMobile;
	}
	public void setmMobile(String mMobile) {
		this.mMobile = mMobile;
	}
	public String getmShopType() {
		return mShopType;
	}
	public void setmShopType(String mShopType) {
		this.mShopType = mShopType;
	}
	public String getmLocation() {
		return mLocation;
	}
	public void setmLocation(String mLocation) {
		this.mLocation = mLocation;
	}
	public String getmPincode() {
		return mPincode;
	}
	public void setmPincode(String mPincode) {
		this.mPincode = mPincode;
	}
	@Override
	public String toString() {
		return "Mechanic [mId=" + mId + ", mName=" + mName + ", mEmail=" + mEmail + ", mPassword=" + mPassword
				+ ", mMobile=" + mMobile + ", mShopType=" + mShopType + ", mLocation=" + mLocation + ", mPincode="
				+ mPincode + "]";
	}
	
	
}