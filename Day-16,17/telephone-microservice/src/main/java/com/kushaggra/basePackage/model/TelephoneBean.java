package com.kushaggra.basePackage.model;

import javax.persistence.*;

@Entity
@Table(name="telephonedir")
public class TelephoneBean {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="telephone_Id")
	private long telephoneId; 
	
	
	@Column(name="telephone_Number")
	private long telephoneNumber; 
	
	@Column(name="mobile_Number")
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

