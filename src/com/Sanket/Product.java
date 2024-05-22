package com.Sanket;

import java.util.Scanner;

public class Product {

}

class InvokeMaggi extends Maggi{
	Scanner s = new Scanner(System.in);
	int qty;
	float price;
	public InvokeMaggi() {
		System.out.println("Maggi Quantity: ");
		qty = s.nextInt();
		setMaggiInfo(qty);
		setFlag(true);
		price = super.pPrice;
		CalculateTax.setBILL(price, qty);
	}
}
class InvokeFlour extends Flour{
	Scanner s = new Scanner(System.in);
	int qty;
	float price;
	public InvokeFlour() {
		System.out.println("Flour Quantity in KG: ");
		qty = s.nextInt();
		setFlourInfo(qty);
		setFlag(true);
		price = super.pPrice;
		CalculateTax.setBILL(price, qty);
	}
}
class InvokeSalt extends Salt{
	Scanner s = new Scanner(System.in);
	int qty;
	float price;
	public InvokeSalt() {
		System.out.println("Salt Quantity in KG: ");
		qty = s.nextInt();
		setSaltInfo(qty);
		setFlag(true);
		price = super.pPrice;
		CalculateTax.setBILL(price, qty);
		flag = true;
	}
}
class InvokeRice extends Rice{
	Scanner s = new Scanner(System.in);
	int qty;
	float price;
	public InvokeRice() {
		System.out.println("Rice Quantity in KG: ");
		qty = s.nextInt();
		setRiceInfo(qty);
		setFlag(true);
		price = super.pPrice;
		CalculateTax.setBILL(price, qty);
		flag = true;
	}
}
class InvokeLentil extends Lentil{
	Scanner s = new Scanner(System.in);
	int qty;
	float price;
	public InvokeLentil() {
		System.out.println("Lentil Quantity in KG: ");
		qty = s.nextInt();
		setLentilInfo(qty);
		setFlag(true);
		price = super.pPrice;
		CalculateTax.setBILL(price, qty);
		flag = true;
	}
}
class InvokeSpice extends Spice{
	Scanner s = new Scanner(System.in);
	int choice;
	int qty;
	float price;
	public InvokeSpice() {
		System.out.println("Which Spice You Want:");
		System.out.println("\t1.Cumine\t2.Coriener\t3.Red Chilli\t4.Turmaric");
		choice = s.nextInt();
		setProductName(choice);
		//System.out.println("Product: " + pName);
		System.out.println(pName+" Quantity in KG: ");
		qty = s.nextInt();
		setSpiceInfo(qty);
		setFlag(true);
		price = super.pPrice;
		CalculateTax.setBILL(price, qty);
		flag = true;
	}
}
class InvokeOil extends Oil{
	Scanner s = new Scanner(System.in);
	int choice;
	int qty;
	float price;
	String name;
	public InvokeOil() {
		System.out.println("Which Oil You Want:");
		System.out.println("\t1.Sun Flower\t2.Musterd\t3.Olive Oil\t4.Cooking Oil");
		choice = s.nextInt();
		//setOilInfo(choice);
		setOilPrice(choice);
		switch(choice) {
			case 1: name = "Sun Flower"; 
					setName(name);
					break;
			case 2: name = "Musterd"; 
					setName(name);
					break;
			case 3: name = "Olive Oil"; 
					setName(name);
					break;
			case 4: name = "Cooking Oil";
					setName(name);
					break;
			default: break;
		}
		System.out.println("Oil Quantity in Liters: ");
		qty = s.nextInt();
		setOilInfo(qty);
		setFlag(true);
		if(choice == 3) {
			price = super.oliveOilPrice;
		}
		else {
			price = super.pPrice;
		}
		CalculateTax.setBILL(price, qty);
		flag = true;
	}
}
class InvokeMilk extends Milk{
	Scanner s = new Scanner(System.in);
	int qty;
	float price;
	public InvokeMilk() {
		System.out.println("Milk Quantity in Liters: ");
		qty = s.nextInt();
		setMilkInfo(qty);
		setFlag(true);
		price = super.pPrice;
		CalculateTax.setBILL(price, qty);
		flag = true;
	}
}