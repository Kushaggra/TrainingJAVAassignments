package com.kushaggra.basePackage.model;

public class bean {
	@Override
	public String toString() {
		return "bean [id=" + id + ", from=" + from + ", to=" + to + ", unit=" + unit + ", totalUnits=" + totalUnits + "]";
	}
	private long id;
	private String from;
	private String to;
	
	private double unit;
	private double totalUnits;
	
	public bean() {
		
	}
	
	public bean(long id, String from, String to, double unit,
			double totalUnits) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.unit = unit;
		this.totalUnits = totalUnits;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public double getUnit() {
		return unit;
	}
	public void setUnit(double unit) {
		this.unit = unit;
	}
	public double getTotalUnits() {
		return totalUnits;
	}
	public void setTotalUnits(double totalUnits) {
		this.totalUnits = totalUnits;
	}
	
}