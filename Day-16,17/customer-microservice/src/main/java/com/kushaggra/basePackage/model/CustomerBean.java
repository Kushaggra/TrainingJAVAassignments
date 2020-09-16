package com.kushaggra.basePackage.model;

import javax.persistence.*;

@Entity
@Table(name="customerdir")
public class CustomerBean {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="customer_Id")
	private int customerId;
	
	@Column(name="customer_Firstname")
	private String customerFname; 
	
	@Column(name="customer_Lastname")
	private String customerLname;  
	
	@Column(name="customer_DOB")
	private String customerDob;
	
	@Column(name="cutomer_Telephone")
	private long customerTelephone;  
	
	@Column(name="cutomer_email")
	private String customerEmail;
	
	public CustomerBean() { }

	public CustomerBean(int customerId, String customerFname, String customerLname, String customerDob,
			long customerTelephone, String customerEmail) {
		super();
		this.customerId = customerId;
		this.customerFname = customerFname;
		this.customerLname = customerLname;
		this.customerDob = customerDob;
		this.customerTelephone = customerTelephone;
		this.customerEmail = customerEmail;
	}

	@Override
	public String toString() {
		return "CustomerBean [customerId=" + customerId + ", customerFname=" + customerFname + ", customerLname="
				+ customerLname + ", customerDob=" + customerDob + ", customerTelephone=" + customerTelephone
				+ ", customerEmail=" + customerEmail + "]";
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerFname() {
		return customerFname;
	}

	public void setCustomerFname(String customerFname) {
		this.customerFname = customerFname;
	}

	public String getCustomerLname() {
		return customerLname;
	}

	public void setCustomerLname(String customerLname) {
		this.customerLname = customerLname;
	}

	public String getCustomerDob() {
		return customerDob;
	}

	public void setCustomerDob(String customerDob) {
		this.customerDob = customerDob;
	}

	public long getCustomerTelephone() {
		return customerTelephone;
	}

	public void setCustomerTelephone(long customerTelephone) {
		this.customerTelephone = customerTelephone;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	
	
}


//
//{
//	"customerId" : 
//	"customerFname" : "Kushaggra"
//	"customerLname" : "Sharma"
//	"customerDob" : "12-01-1998"
//	"customerTelephone" :  22313366
//	"customerEmail" : "kushaggra@gmail.com"
//}