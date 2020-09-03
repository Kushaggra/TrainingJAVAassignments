package com.telstra.pack1;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int num1 = 14, num2= 15, num3 =35;
		
//		int lar = (n1>n2)?n1:n2;
//		lar = (lar>n3)?lar:n3;
//		System.out.println(lar);
//	System.out.println(num1>num2)
//---------------------------------------------------------------------------------
//
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter three number");
//		num1 = sc.nextInt();
//		num2 = sc.nextInt();
//		num3 = sc.nextInt();
//	System.out.println(num1>num2 ?(num1>num3?num1:num3):(num2>num3?num2:num3));
//
	
//----------------------------------------------------------------------------------
	
		int revnum,ans=0,flag=0;
		char again='n';
		Scanner sc = new Scanner(System.in);
	//Menu driven
		do {
				revnum = sc.nextInt();
			
			//Handling Negatives
				if(revnum<0) {
					revnum= Math.abs(revnum);
					flag=1;
				}
			
			//Reversing the Number
					do {
						int temp = revnum%10;
						revnum/=10;
						ans*=10;
						ans+=temp;	
					}while(revnum!=0);
		
				if(flag==0)
				System.out.println(ans);
				else
				System.out.println(-ans);
				
				System.out.println("Continue?(y/n)");
				again= sc.next().charAt(0);
				again= Character.toLowerCase(again);
				
			//Resetting the parameters
				revnum=ans=flag=0;
				
		}while(again!='n');
//----------------------------------------------------------------------------------	
		
		
	
	}

}
