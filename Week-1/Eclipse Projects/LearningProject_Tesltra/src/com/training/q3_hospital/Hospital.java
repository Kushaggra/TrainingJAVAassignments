package com.training.q3_hospital;

public class Hospital {
	private static int categoryNum;
	// 1 - Undernourished
	// 2 - Healthy
	// 3 - Overnourished

	static void babies (Baby ...b) {
		for(Baby bbz: b)
			Hospital.report(bbz);
	}
	
	public static void report(Baby b) {
		if(b.getHeight()<30 &&b.getWeight()<2)
			categoryNum=1;
		else if(b.getHeight()<30 &&(b.getWeight()>2 && b.getWeight()<=4))
			categoryNum=2;
		else if(b.getHeight()<30 &&b.getWeight()>2)
			categoryNum=3;
		else if((b.getHeight()>30 && b.getHeight()<60) && (b.getWeight()>=2 && b.getWeight()<5))
			categoryNum=2;
		else if(b.getHeight()>30 &&(b.getWeight()<6) )
			categoryNum=2;
		else if(b.getHeight()>30 &&b.getWeight()>2)
			categoryNum=3;
		
		switch(categoryNum) {
		case 1:
			System.out.println("The Baby is Undernourished");
			break;
		case 2:
			System.out.println("The Baby is Healthy");
			break;
		case 3:
			System.out.println("The Baby is Overnourished");
			break;
		default:
			System.out.println("Invalid comparison");
		}
		
	}

	
	
}
