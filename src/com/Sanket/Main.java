package com.Sanket;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
	// global variable declaration
	static CustomerInfo ci = new CustomerInfo();
	static CalculateTax ct = new CalculateTax();
	static ProductDisplay display = new ProductDisplay();
	static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");  
	static LocalDateTime now = LocalDateTime.now();  
	static DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("HH:mm:ss");  
	static LocalDateTime now2 = LocalDateTime.now(); 
	
	public static void main(String[] args) {
		int counter=1;
		Scanner s = new Scanner(System.in);
		ci.setCustomerDetails();
		
		displayOption();
		
		while(counter != 0) {
			//select product and quantity of product from list
			System.out.println("Please Enter Product ID for the Product");
			System.out.println("Select Option for Prodcut Purchase: ");
			counter = s.nextInt();
			switch(counter) {
			case 1: InvokeMaggi mi = new InvokeMaggi();
					break;
			case 2: InvokeFlour fi =new InvokeFlour();
					break;
			case 3: InvokeSalt si = new InvokeSalt();
					break;
			case 4: InvokeRice ri = new InvokeRice();
					break;
			case 5: InvokeLentil li = new InvokeLentil();
					break;
			case 6: InvokeSpice spi = new InvokeSpice();
					break;
			case 7: InvokeMilk mlk = new InvokeMilk();
					break;
			case 8: InvokeOil oi =new InvokeOil();
					break;
			case 9: displayBill();
					counter = 0;
			default: break;
			}
		}
	}
	//Product list
	static void displayOption() {
		System.out.print("\tOption\tProduct\tOption\tProduct\tOption\tProduct\n");
		System.out.println("\t1\tMaggi\t|2\tFlour\t|3\tSalt");
		System.out.println("\t4\tRice\t|5\tLentil\t|6\tSPice");
		System.out.println("\t7\tMilk\t\t\t|8\tCooking Oil");
		System.out.println("Please enter 9 for bill");
	}
	//Product breakdown list header 
	static void itemHeader() {
		displayLine();
		System.out.println("Products Breakdown");
		System.out.println("\tName\t\t\tQty\tPrice\tTotal");
	}

	// DISPLAY BILL METHOD - To display Bill
	static void displayBill() {
		displayHeader();
		displayLine();
		System.out.println("Date: "+dtf.format(now)+"\t\t  Time: "+dtf2.format(now2));  
		ci.getCustomerDetails();
		itemHeader();
		displayLine();
		display.displayProducts();
		displayLine();
		ct.calculateTax();
		System.out.println("Amount: \t\t\t\t\t" + ct.getFirstBill());
		System.out.println("Tax Amount:  \t\t\t\t\t" + ct.getTAX());
		System.out.println("Total Bill Amount: \t\t\t\t" + ct.taxedBill());
		System.out.println("Round off Amount: \t\t\t\t-" + ct.getROUNDOFF());
		System.out.println("Final Bill Amount: \t\t\t\t" + ct.getBILL());
		//System.out.println();
		displayLine();
		displayLine();
	}
	// Line display in bill for Interface only
	static void displayLine() {
		for(int i = 0 ; i <= 30 ; i++) {
			System.out.print("=+");
		}
		System.out.println();
	}
	//display header
	static void displayHeader() {
		displayLine();
		System.out.println("\t\t\tS MART");
	}

}
