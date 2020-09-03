package com.training.q2_bank;

public class Main {

	public static void main(String[] args) {
		User u3 = new User("Drishti", 10000);
		User u2 = new User("Prakhar",30000000);
		Bank.usersinbank(new User("Kushaggra",20000000),u2,u3);
		System.out.println("Account for"+ u3.getUname());
		u3.deposit(1200);
		System.out.println(u3.getAc());
		u3.withdraw(2000);
		System.out.println(u3.getAc());
		System.out.println(" ");
		
		System.out.println("Account for"+ u2.getUname());
		u2.deposit(1200);
		System.out.println(u2.getAc());
		u2.withdraw(2000);
		System.out.println(u2.getAc());
		System.out.println(" ");
		

	}

}
