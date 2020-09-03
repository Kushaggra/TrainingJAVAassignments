package com.ui;
import java.util.*;

import com.beans.Product;
import com.beans.ProductCollection;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int PANEL;
		ProductCollection p1 = new ProductCollection();
		
			
while(PANEL!=3) {
	
		System.out.println("\nSelect the Panel that you want to access:");
		System.out.println("1. Admin Panel");
		System.out.println("2. Customer Panel");
		PANEL = sc.nextInt();
//		label:
		if(PANEL==1) {
			int choice,MenuChoice=2;
			while(MenuChoice==2) {
			
			System.out.println("Select the Operation to be carried out:");
			System.out.println("1. Add Product");
			System.out.println("2. Delete Product");
			System.out.println("3. Show all Products");
			System.out.println("4. Find element by ID");
			System.out.println("5. Exit");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				int pID;
				String pName;
				int pCost;
				int idDelete;
				System.out.println("Enter the ID of the Product:"); pID = sc.nextInt();
				System.out.println("Enter the Name of the Product:"); pName = sc.next();
				System.out.println("Enter the Cost of the Product:");pCost = sc.nextInt();
				Product p = new Product(pID,pName,pCost);
				p1.addProduct(p);
				break;
			case 2:
				System.out.println("Enter the ID of the item to be deleted:");
				idDelete= sc.nextInt();
				p1.deleteProduct(idDelete);
				break;
			case 3:
				p1.showAllproducts();
				break;
			case 4:
				System.out.println("Enter the ID of the item to find");
				idDelete= sc.nextInt();
				p1.findElementByID(idDelete);
				break;
			case 5:
				sc.close();
				System.exit(0);
			}
			
			System.out.println("Select the Menu you want to be directed to:");
			System.out.println("1. Panel Selection Menu");
			System.out.println("2. Admin Menu");
			MenuChoice= sc.nextInt();
			}
			if(MenuChoice==1)
				break label;
			
		}else if(PANEL==2) {
			
		}

	}
	}

}
