package com.Demo1;


public class Demo{
	
	public static void main(String[] args) {
		
	String s = "Java in Selenium";
	
	boolean empty = s.isEmpty();
		
		System.out.println(empty);
		
		String[] split = s.split(" ");
		
		System.out.println(split[1]);
		
		String s1 = "Java";
		String s2 = "Java";
		
		System.out.println(s1.equals(s2));
		
		
		
		
		
		System.out.println(s1==s2);
		
		String sb = new String("Java");
		String sb1 = new String("Java");
		
		System.out.println(sb.equals(sb1));
		
		
		
		System.out.println(sb==sb1);
		
		
	
	}

}
