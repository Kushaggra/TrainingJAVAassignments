package com.kushaggra.basePackage.model;

import javax.persistence.*;

@Entity
@Table(name="capitals")
public class CapitalBean {
	@Id
	@Column(name="country_code")
	private String countryCode;
	
	@Column(name="zipcode")
	private String zipcode;
	
	@Column(name="name")
	private String name;
	
	@Column(name="language")
	private String language;
	
	@Column(name="population")
	private Long population;
	
	@Column(name="port")
	private int port;
	
	public CapitalBean() {
	}
	public CapitalBean(String zipcode, String name, String language, Long population, String countryCode, int port) {
		super();
		this.zipcode = zipcode;
		this.name = name;
		this.language = language;
		this.population = population;
		this.countryCode = countryCode;
		this.port = port;
	}
	@Override
	public String toString() {
		return "Capital [zipcode=" + zipcode + ", name=" + name + ", language=" + language + ", population="
				+ population + ", countryCode=" + countryCode + ", port=" + port + "]";
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public Long getPopulation() {
		return population;
	}
	public void setPopulation(Long population) {
		this.population = population;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	
}


//{
//    "countryCode": "IN",
//    "zipcode": "110053",
//    "name":"New Delhi",
//    "language": "Hindi",
//    "population":190000,
//    "port": 45678
//}
