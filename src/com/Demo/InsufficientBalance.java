package com.Demo;

public class InsufficientBalance extends Exception {

	public InsufficientBalance() {

		System.out.println("Amount is insufficient");

	}

	public InsufficientBalance(int balance) {

		super();

		System.out.println("Amount available is " + balance);

	}

}
