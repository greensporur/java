package com.java8am;

public class Child extends Parent{
	
	public void cycle() {
		
		System.out.println("Cycle");

	}
	
	public void notebooks() {
		
		
		
		System.out.println("Notebooks");
	}
	
	public static void main(String[] args) {
		
		Child c = new Child();
		
		c.land(); //Parent class Object 
		c.house();
		
		c.cycle();
		c.notebooks(); //Child class Object
		
		
	}
	
	

}
