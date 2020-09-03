package com.training.pack1;
import java.util.Scanner;

public class Main {

	static long fact(int num) {
		long ans=1;
		for(int i=1;i<=num;++i) {
			ans*=i;
		}
		return ans;
	}
	
	static boolean PrimeCheck(int num) {
		
		if(num%2==0) {
			return false;
		}
		else
		for(int i = 3; i<Math.sqrt(num);++i) {
			if(num%i==0)
				return false;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		int num1 = 14, num2= 15, num3 =35;
		Scanner sc = new Scanner(System.in);
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
//	
//		int revnum,ans=0,flag=0;
//		char again='n';
//		Scanner sc = new Scanner(System.in);
//	//Menu driven
//		do {
//				revnum = sc.nextInt();
//			
//			//Handling Negatives
//				if(revnum<0) {
//					revnum= Math.abs(revnum);
//					flag=1;
//				}
//			
//			//Reversing the Number
//					do {
//						int temp = revnum%10;
//						revnum/=10;
//						ans*=10;
//						ans+=temp;	
//					}while(revnum!=0);
//		
//				if(flag==0)
//				System.out.println(ans);
//				else
//				System.out.println(-ans);
//				
//				System.out.println("Continue?(y/n)");
//				again= sc.next().charAt(0);
//				again= Character.toLowerCase(again);
//				
//			//Resetting the parameters
//				revnum=ans=flag=0;
//				
//		}while(again!='n');
//		
//----------------------------------------------------------------------------------	
//	
//	//Armstrong Number
//		
//		int num,ans,sum=0;
//		String snum;
//		snum = sc.next();
//		num=Integer.parseInt(snum);
//		int len=snum.length();
//			do {
//				int temp = num%10;
//				sum+=Math.pow(temp,len);
//				num/=10;	
//			}while(num!=0);
//	
//			num=Integer.parseInt(snum);
//			if(sum==num) {
//				System.out.println("Armstrong Number");}
//			else
//				System.out.println("Not an Armstrong number");
//	}

//----------------------------------------------------------------------------------
//
////Type conversions
//	
//	//Implicit and Explicit
//	// A literal is considered as a double value by default in JAVA
//	
//		// float f1 = 13.33; gives error
//		// float f1 =13.33f; gives no error
//	float f1 = 13.33f;
//	double d1 = f1; //no error because float = 4 bytes but double has 8 bytes
////	float f2 = d1f; erroneous conversion because "d1f" is considered as a variable name
//	float f2 = (float)d1; 
		
//----------------------------------------------------------------------------------	
	
//Factorial of a Number
//		int num=1;
//		System.out.println("Enter a number for Factorial!");
//		num = sc.nextInt();
//		if(num==0) {
//			System.out.println("1");
//		}else {
//			System.out.println(fact(num));
//		}
	
//----------------------------------------------------------------------------------	

//		PRIME NUMBER CHECK
		int num = sc.nextInt();
		boolean bool = PrimeCheck(num);
		if(bool)
			System.out.println("PRIME");
		else
			System.out.println("NOT PRIME");
		
	}
	}
