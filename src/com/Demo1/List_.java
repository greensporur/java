package com.Demo1;

import java.util.ArrayList;
import java.util.List;

public class List_ {
	
	public static void main(String[] args) {
		
	List <Integer> li = new ArrayList<Integer>();
	
	li.add(11);
	li.add(12);
	li.add(13);
	li.add(13);
	
	int size = li.size();
	
	System.out.println(size);
	
	Integer integer = li.get(0);
	
	System.out.println(integer);
	
	System.out.println(li.get(1));
	
	li.set(1, 15);
		
		System.out.println(li.get(1));
		
		System.out.println(li);
		
	//	li.remove(2);
		
		System.out.println(li);
		
		int indexOf = li.indexOf(13);
		
		System.out.println(indexOf);
		
		boolean contains = li.contains(13);
		
		System.out.println(contains);
		
	//	li.clear();
		
		System.out.println(li);
		
		
		List<Integer> li1 = new ArrayList<Integer>();
		
		li1.add(1);
		li1.add(2);
		li1.add(3);
		li1.add(15);
		li1.add(11);
		
		
		System.out.println(li);
		
	//	li.addAll(li1);
		
		System.out.println(li);
		
	//	li.retainAll(li1);
		
		System.out.println(li);
		
//		li.removeAll(li1);
		
		System.out.println(li);
		
		for (int i = 0; i < li1.size(); i++) {
			
			
			System.out.println(li1.get(i));
		}
		
		
	}

}
