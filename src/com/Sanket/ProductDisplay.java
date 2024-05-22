package com.Sanket;

class ProductDisplay {
	public void displayProducts() {
		Maggi m = new Maggi();
		Flour f = new Flour();
		Salt s = new Salt();
		Rice r = new Rice();
		Lentil l = new Lentil();
		Oil o = new Oil();
		Spice spi = new Spice();
		Milk mlk = new Milk();
		m.getMaggiInfo();
		f.getFlourInfo();
		s.getSaltInfo();
		r.getRiceInfo();
		l.getLentilInfo();
		o.getOilInfo();
		spi.getSpiceInfo();
		mlk.getMilkInfo();
	}
	
}
class Maggi{
	protected static String pName="Maggi";
	protected static int pQty;
	protected static float pPrice = 10.00f;
	protected static boolean flag;

	public static void setFlag(boolean flag) {
		Maggi.flag = flag;
	}

	
	public void setMaggiInfo(int qty) {
		pQty = qty;
	}
	public void getMaggiInfo() {
		if(flag == true) {
			System.out.println("\t"+pName+"\t\t\t"+pQty+"\t"+pPrice+"\t"+(pQty*pPrice));
		}
	}
	
}
class Flour{
	protected static String pName="Flour";
	protected static int pQty;
	protected static boolean flag;
	protected static float pPrice = 25.50f;
	public static void setFlag(boolean flag) {
		Flour.flag = flag;
	}
	
	public void setFlourInfo(int qty) {
		pQty = qty;
	}
	public void getFlourInfo() {
		if(flag == true) {
			System.out.println("\t"+pName+"\t\t\t"+pQty+"\t"+pPrice+"\t"+(pQty*pPrice));
		}
	}
}
class Salt{
	protected static String pName = "Salt";
	protected static int pQty;
	protected static boolean flag;
	protected static float pPrice = 30.00f;
	
	public static void setFlag(boolean flag) {
		Salt.flag = flag;
	}
	
	public void setSaltInfo(int qty) {
		pQty = qty;
	}
	public void getSaltInfo() {
		if(flag == true) {
			System.out.println("\t"+pName+"\t\t\t"+pQty+"\t"+pPrice+"\t"+(pQty*pPrice));
		}
	}
}
class Rice{
	protected static String pName = "Rice";
	protected static int pQty;
	protected static boolean flag;
	protected static float pPrice = 60.40f;
	
	public static void setFlag(boolean flag) {
		Rice.flag = flag;
	}
	
	public void setRiceInfo(int qty) {
		pQty = qty;
	}
	public void getRiceInfo() {
		if(flag == true) {
			System.out.println("\t"+pName+"\t\t\t"+pQty+"\t"+pPrice+"\t"+(pQty*pPrice));
		}
	}
}
class Lentil{
	protected static String pName = "Lentil";
	protected static int pQty;
	protected static boolean flag;
	protected static float pPrice = 60.40f;
	
	public static void setFlag(boolean flag) {
		Lentil.flag = flag;
	}
	
	public void setLentilInfo(int qty) {
		pQty = qty;
	}
	public void getLentilInfo() {
		if(flag == true) {
			System.out.println("\t"+pName+"\t\t\t"+pQty+"\t"+pPrice+"\t"+(pQty*pPrice));
		}
	}
}
class Spice{
	protected static String pName;
	protected static int pQty;
	protected static boolean flag;
	protected static float pPrice = 30.50f;
	
	public void setProductName(int choice) {
		switch(choice) {
			case 1: pName = "Cumine"; break;
			case 2: pName = "Coriender"; break;
			case 3: pName = "Red Chilli"; break;
			case 4: pName = "Trumaric"; break;
			default: break;
		}
	}
	public static void setFlag(boolean flag) {
		Spice.flag = flag;
	}
	
	public void setSpiceInfo(int qty) {
		pQty = qty;
	}
	public void getSpiceInfo() {
		if(flag == true) {
			if(pName == "Red Chilli") {
				System.out.println("\t"+pName+"\t\t"+pQty+"\t"+pPrice+"\t"+(pQty*pPrice));
			}
			else {
				System.out.println("\t"+pName+"\t\t\t"+pQty+"\t"+pPrice+"\t"+(pQty*pPrice));
			}
		}
	}
}
class Oil{
	static String pName;
	protected static int pQty;
	protected static boolean flag;
	protected static float pPrice = 70.50f;
	protected static float oliveOilPrice = 130.00f;
	
	public void setOilPrice(int choice) {
		if(choice == 3) {
			pPrice = oliveOilPrice;
		}
	}
	public float getOilPrice() {
		return pPrice;
	}
	public static void setName(String name) {
		Oil.pName = name;
	}
	public void setProductName(int choice) {

	}
	public static void setFlag(boolean flag) {
		Oil.flag = flag;
	}
	
	public void setOilInfo(int qty) {
		pQty = qty;
	}
	public void getOilInfo() {
		if(flag == true) {
			if(pName == "Olive Oil") {
				System.out.println("\t"+pName+"\t\t"+pQty+"\t"+pPrice+"\t"+(pQty*pPrice));
			}
			else {
				System.out.println("\t"+pName+"\t\t\t"+pQty+"\t"+pPrice+"\t"+(pQty*pPrice));
			}
		}
	}
}
class Milk{
	protected static String pName="Milk";
	protected static int pQty;
	protected static boolean flag;
	protected static float pPrice = 50.00f;
	
	public void setProductName(String name) {
		pName = name;
	}
	public static void setFlag(boolean flag) {
		Milk.flag = flag;
	}
	
	public void setMilkInfo(int qty) {
		pQty = qty;
	}
	public void getMilkInfo() {
		if(flag == true) {
			System.out.println("\t"+pName+"\t\t\t"+pQty+"\t"+pPrice+"\t"+(pQty*pPrice));
		}
	}
}
