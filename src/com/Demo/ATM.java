package com.Demo;

public class ATM {

	public static void main(String[] args) {

		int balance = 5000;

		int withdraw = 7000;

		try {
			if (withdraw > balance)
				throw new InsufficientBalance();

			else {

				System.out.println("amount withdrawn");
			}

		} catch (InsufficientBalance e) {

			System.out.println(e.getMessage());

		}

	}

}
