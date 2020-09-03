package com.training.q2_bank;

import java.util.Random;

public class Account {
	private final int ac_num;
	private int cash;

	static final int number;
	
	static {
		number = 123456;
	}
	
	private int AccountNumberGenerate() {
		Random rand = new Random();
		int temp = rand.nextInt(900000)+100000;
		return temp;
	}
	
//	Constructor
	public Account(int cash) {
		super();
		this.ac_num = AccountNumberGenerate();
		this.cash = cash;
	}

//	Getter
	public int getCash() {
		return cash;
	}

	public int getAc_num() {
		return ac_num;
	}

//	Cash Modification Functions
	public void withdraw(int cash) {
		this.cash-=cash;
	}
	
	public void deposit(int cash) {
		this.cash+=cash;
	}

	@Override
	public String toString() {
		return "Account [ac_num=" + ac_num + ", cash=" + cash + "]";
	}

}
