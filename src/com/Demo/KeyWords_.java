package com.Demo;

public class KeyWords_ {
	
	int a = 10;
	
	
	public void demo() {
		
		
		this.demo1();

		a = 20;
	
		System.out.println("Demo"+a);

	}
	
	public  void demo1() {
		
		System.out.println("Demo1"+this.a);
	}

	
	public static void main(String[] args) {
		
		KeyWords_ ks = new KeyWords_();
		ks.demo();
		
	}
}
