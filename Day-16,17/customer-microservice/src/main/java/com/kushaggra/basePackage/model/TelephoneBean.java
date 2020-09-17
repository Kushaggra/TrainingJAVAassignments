package com.kushaggra.basePackage.model;


public class TelephoneBean {
	
	private long telephoneId; 
	private long telephoneNumber; 
	private long mobileNumber;
	
	
	public TelephoneBean() { } 
	public TelephoneBean(long telephoneId, long telephoneNumber, long mobileNumber) {
		super();
		this.telephoneId = telephoneId;
		this.telephoneNumber = telephoneNumber;
		this.mobileNumber = mobileNumber;
	}
	@Override
	public String toString() {
		return "TelephoneBean [telephoneId=" + telephoneId + ", telephoneNumber=" + telephoneNumber + ", mobileNumber="
				+ mobileNumber + "]";
	}
	public long getTelephoneId() {
		return telephoneId;
	}
	public void setTelephoneId(long telephoneId) {
		this.telephoneId = telephoneId;
	}
	public long getTelephoneNumber() {
		return telephoneNumber;
	}
	public void setTelephoneNumber(long telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

}


//{
//	"telephoneId" : 101,
//	"telephoneNumber" : 43262231
//	"mobileNumber" : 9876543210
//}

