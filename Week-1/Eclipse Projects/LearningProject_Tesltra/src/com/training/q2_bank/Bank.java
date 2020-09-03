package com.training.q2_bank;

public class Bank {
	public static void usersinbank( User ...users) {
		System.out.println("Bank Info:");
		for(User u: users) {
		System.out.println("\t"+u);	
		}
	}
}
