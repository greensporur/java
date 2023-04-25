package com.Demo;

public class Armstrong {
	
	public static void main(String[] args) {
		
		int i = 153; // 1 + 125 + 27 = 153
		
		int temp = i;
		/*
		 * get each digit   
		 * cube digit
		 * output = cube value concat
		 * divide i value with 10
		 * 
		 * 
		 * 
		 */
		
		int modulus = 0;
		
		int output = 0;
		
		while (i>0) {
			
			modulus = i%10; //3
			
			
			output = output + modulus*modulus*modulus;
			
			i=i/10; //0
			
			
		}
		if(output == temp) {
			
			
			System.out.println("Its a armstrong number");
			
		}else {
			
			
			System.out.println("Its not a armstrong number");
		}
		
		
		
	}

}
