package com.training.q2_bank;

public class User {
	private String Uname;
	private Account ac;
	
//	Constructor
	public User(String uname, int cash) {
		super();
		Uname = uname;
		this.ac = new Account(cash);
	}
	
//	Cash Modifications
	public void withdraw(int cash) {
		this.ac.withdraw(cash);
	}
	
	public void deposit(int cash) {
		this.ac.deposit(cash);
	}

//	Getter
	public String getUname() {
		return Uname;
	}

	public Account getAc() {
		return ac;
	}

//	toString
	@Override
	public String toString() {
		return "User [Uname=" + Uname + ", ac=" + ac + "]";
	}
	
}
