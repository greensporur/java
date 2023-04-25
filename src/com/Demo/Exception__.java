package com.Demo;

import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception__ {
	
	public static void main(String[] args) throws InterruptedException ,FileNotFoundException, Exception , Throwable {
		
		
	//	Thread.sleep(5000);
		
		System.out.println("Enter your no");
		
		Scanner sc = new Scanner(System.in);
		
		try {
		
		int no1 = sc.nextInt();
		int no2 = sc.nextInt();
		int sum = no1/no2;
		System.out.println( sum);
		
		}catch(ArithmeticException e) {
			
			System.out.println("Any number cannot be divided by zero");
			
			
		}finally {
			
			System.out.println("finally");
			
		}
		
		
		
		System.out.println("Main Method");
		
		
		
	}
	

}
