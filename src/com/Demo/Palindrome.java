package com.Demo;

public class Palindrome {

	public static void main(String[] args) {

		// madam madam
		// 121 121

		int i = 121;
	
		int temp = i;

		int output = 0;

		int modulus = 0;

		while (i > 0) {

			modulus = i % 10; // 2

			output = output * 10 + modulus;

			i = i / 10;

		}
		if (temp == output) {

			System.out.println("Its a palindrome");

		} else {

			System.out.println("Not a palindrome");

		}

	}

}
