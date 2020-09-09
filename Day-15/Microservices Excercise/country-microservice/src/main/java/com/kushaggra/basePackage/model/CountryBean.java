package com.kushaggra.basePackage.model;

import javax.persistence.*;

@Entity
@Table(name="country")
public class CountryBean {
	@Id
	@Column(name="country_code")
	private String countryCode;
	
	@Column(name="country_name")
	private String countryName;
	
	@Column(name="capital")
	private String capital;
	
	
	public CountryBean() {
		}
	public CountryBean(String countryCode, String countryName, String capital) {
		super();
		this.countryCode = countryCode;
		this.countryName = countryName;
		this.capital = capital;
	}
	@Override
	public String toString() {
		return "CountryBean [countryCode=" + countryCode + ", countryName=" + countryName + ", capital=" + capital
				+ "]";
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
}


//{
//    "countryCode": "PK",
//    "countryName": "786123",
//    "capital":"Islamabad"
//}
