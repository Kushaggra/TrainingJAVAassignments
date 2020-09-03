package com.bean;

public class model {
	private int tid;
	private String tname;
	private int tprice;
	
	public model(int tid, String tname, int tprice) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.tprice = tprice;
	}
	
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public int getTprice() {
		return tprice;
	}
	public void setTprice(int tprice) {
		this.tprice = tprice;
	}
	public int getTid() {
		return tid;
	}
	
	@Override
	public String toString() {
		return "model [tid=" + tid + ", tname=" + tname + ", tprice=" + tprice + "]";
	}

}
