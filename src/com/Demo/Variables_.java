package com.Demo;

public class Variables_ {

	int a; // Variable Declared

	int b = 10; // Class Variable
	
	static byte bt = 35; //static variable

	public void demo() {

		int j = 20; // Local Variable

		System.out.println(j);

	}

	public  void demo1() {

		byte b = 25 ; //Local Variable
		
		System.out.println("Variable value "+b);
		
		System.out.println("Class Variable "+a);
		
		
		System.out.println(bt);

	}
	
	public static void main(String[] args) {
		
		Variables_ vs = new Variables_();
		
		vs.demo();
		vs.demo1();
		
		System.out.println("Class Variable called inside static method using object "+vs.b);
		
		System.out.println("Static variable "+bt);
		
	}

}
