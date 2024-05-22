package com.Sanket;

import java.util.Scanner;

public class CustomerInfo {
	private String customerName;
	private long customerNumber;
	
	public void setCustomerDetails() {
		Scanner s = new Scanner(System.in);
		// ENTER CUSTOMER DETAILS
		System.out.println("Enter Customer Name: ");
		customerName = s.nextLine();
		System.out.println("Enter Customer Contact No:");
		customerNumber = s.nextLong();
	}
	public void getCustomerDetails() {
		System.out.println("Customer Name: \t\t\t\t" + customerName);
		System.out.println("Customer Contact Number: \t\t" + customerNumber);
	}
}
