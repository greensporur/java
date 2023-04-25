package com.Demo;

public class Dog extends Animal {
	
	@Override
	public void nature() {
		System.out.println("Omnivorous");
		super.nature();
	}

}
