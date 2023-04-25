package com.Demo1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_ {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your no");

		int no1 = sc.nextInt();
		int no2 = sc.nextInt();

		try {
			int division = no1/no1;
			System.out.println(division);

		} catch (InputMismatchException e) {

			System.out.println("Enter valid mark");

		}catch(ArithmeticException e){
			
			
			
		}finally {
			
			System.out.println("Finally block");
			
		}

		System.out.println("Main Method");

	}

}
