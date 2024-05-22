package com.Sanket;

public class CalculateTax {
	private int BILLNO = 101;
	private final float GSTTAX = 5.0f; 
	private static float TAX = 0f;
	private static float FINALBILL = 0f;
	private static float FIRSTBILL = 0f;
	private static float ROUNDOFF = 0f;
	public float calculateTax() {
		TAX = (GSTTAX / 100) * FINALBILL;
		return TAX;
	}
	public float getFirstBill(){
		return FIRSTBILL;
	}
	
	public static float getTAX() {
		return TAX;
	}
	public static float taxedBill() {
		FIRSTBILL = FIRSTBILL + TAX;
		FINALBILL = FIRSTBILL;
		return FINALBILL;
	}
	public static float getBILL() {
		return FINALBILL;
	}
	public static float getROUNDOFF() {
		ROUNDOFF = FINALBILL - (int) FINALBILL;
		FINALBILL = FINALBILL - ROUNDOFF;
		return ROUNDOFF;
	}
	public static void setBILL(float price, int quantity) {
		FIRSTBILL = FIRSTBILL + (price * quantity);
		FINALBILL = FIRSTBILL;
	}
	

}
