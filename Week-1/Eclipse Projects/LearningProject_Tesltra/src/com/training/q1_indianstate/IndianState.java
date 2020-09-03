package com.training.q1_indianstate;

import java.util.Random;

public class IndianState {
	private String sName;
	private Location l1,l2,l3;
	
	private static int count = 0;
	
	static {
		count = 0;
	}
	
	public int getCount() {
		Random rand = new Random();
		int temp = rand.nextInt(300000)+134122;
		count=temp;
		return count;
	}
	
	public IndianState(String sName) {
		this.sName = sName;
		l1 = new Location(sName+1,sName+"-Address",getCount());
		l2 = new Location(sName+2,sName+"-Address",getCount());
		l3 = new Location(sName+3,sName+"-Address",getCount());
	}

//	toString
	@Override
	public String toString() {
		return "IndianState [sName=" + sName + "\nl1=" + l1 + "\nl2=" + l2 + "\nl3=" + l3 + "]";
	}

//	Getter
	public String getsName() {
		return sName;
	}
}
