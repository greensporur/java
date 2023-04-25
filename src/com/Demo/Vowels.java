package com.Demo;

public class Vowels {
	
	public static void main(String[] args) {
		
		char [] c = {'a','b','e','k' ,'i' ,'@','1'};
		
		/*
		 * get each value from array
		 * 
		 * comparing char value
		 * 
		 * vowels count
		 */
		
		int vowels = 0;
		
		int consonant = 0;
		
		for (int i = 0; i < c.length; i++) {
			
			
		if(c[i] == 'a' || c[i] == 'e' || c[i]=='i' || c[i] == 'o' || c[i] == 'u' ) {
			
			
			vowels++;
			
		}else {
			
			consonant++;
			
			
			
		}
			
			
			
		}
		
		System.out.println("Vowel count is "+vowels);
		
		System.out.println("Consonant count is "+consonant);		
		
	}

}
