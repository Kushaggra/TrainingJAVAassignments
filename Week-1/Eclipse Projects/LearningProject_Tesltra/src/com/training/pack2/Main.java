package com.training.pack2;

public class Main {
	
	
	public static boolean searchitem(double[] darr, double ele) {
		boolean flag=false;
		for(double i:darr) {
			if(i==ele) {
				flag=true;
				break;
			}
		}
		
		darr[1]=100;
		return flag;
	}

	
	public static void main(String[] args) {
	
//		
//		int[] iarr = {1,2,-3,4,5,6,7}; // total memory allocated = 20 bytes
//		int[] iarr1 = new int[10];
// 	//find min and max of an array
//			int min,max; 
//			iarr1=iarr;
//			min=max=iarr1[0];
//			for(int i=1;i<iarr1.length;++i) {
//				if(iarr[i]>max)
//					max = iarr1[i];
//				if(iarr[i]<min)
//					min = iarr1[i];
//			}
//			System.out.println("Max = "+max+ " Min = "+ min);
//			
//	
//	//Enhanced FOR Loop
//			//iterates by copying the elements into a 
//			//temporary variable 'j' which then traverses
//			//till the end of the array
//			
//			for(int j:iarr) {
//				System.out.print(j+ " ");
//			}
//----------------------------------------------------------------
			double[] darr = {1,2,-3,4,5,6,7};
		//before passing the array in a function which searches for an element
		//and also changes darr[1] =100;	
			for(double j:darr) {
				System.out.print(j+ " ");
			}
			
			System.out.println("");
			boolean check = searchitem(darr, 70);
			
			
		//now since it was an array whose name was passed, it got passed "BY REFERENCE"	
			for(double j:darr) {
				System.out.print(j+ " ");
			}
			System.out.println("");
			System.out.println((check)?"Element Found":"Element Not Found");
			
}
	}