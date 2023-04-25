package com.Demo1;

public class Reverse_ {
	
	public static void main(String[] args) {
		
		String s = "Hello Java Selenium"; //avaJ olleH   / olleH avaJ
		
		/* 
		 * 
		 * 
		 * 
		 */
		
		String[] split = s.split(" ");
		
		System.out.println(split[0]);
		
		String output = "";
		
		for(int i = 0 ; i < split.length;i++) {
			
			String val = split[i]; //Java
			
			
			for (int j = val.length()-1; j >= 0 ; j--) {
				
				
				char charAt = val.charAt(j);
				
				output = output + charAt;
				
			}
			
			output = output + " ";
			
			
		}
		
		System.out.println(output);
		
	}

}
