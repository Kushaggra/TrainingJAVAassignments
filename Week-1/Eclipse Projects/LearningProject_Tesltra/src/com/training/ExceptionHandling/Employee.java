package com.training.ExceptionHandling;

import com.training.ExceptionHandling.epack.InsufficientLeavesException;

public class Employee {

	private int eID;
	private int balLeaves;
	
	public Employee(int eID, int balLeaves) {
		super();
		this.eID = eID;
		this.balLeaves = balLeaves;
	}
	
	public String applyLeave(int leave) throws InsufficientLeavesException {
		if(balLeaves<leave) {
			InsufficientLeavesException e = new InsufficientLeavesException("Insufficient Leaves");
			throw e;
		}
		else {
			balLeaves -= leave;
			return ("Leave Sanctioned");
		}
		
	}

	@Override
	public String toString() {
		return "Employee [eID=" + eID + ", balLeaves=" + balLeaves + "]";
	}
}
