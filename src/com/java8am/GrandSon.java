package com.java8am;

public class GrandSon extends Child{

	public void toys() {
		System.out.println("Toys");
		
	}

	public static void main(String[] args) {
		
		GrandSon gd = new GrandSon();
		
		gd.house(); //Parent Class Method
		gd.land();
		
		gd.cycle(); //Child Class Method
		gd.notebooks();
		
		gd.toys(); //Grandson Class Method
		
	}
}
