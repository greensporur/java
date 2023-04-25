package com.Demo1;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class Set_ {
	
	private static Set<Integer> keySet;

	public static void main(String[] args) {
		
		Map<Integer,String> mp = new HashMap<Integer,String>();
		
		mp.put(1, "Java");
		mp.put(2,"Selenium");
		mp.put(3, "Project");
	//	mp.put(1, "Ja");
		mp.put(null, "abc");
		mp.put(null, "Java");
		
		int size = mp.size();
		
		
		System.out.println(size);
		
		Set<Integer> keySet = mp.keySet();
		
		System.out.println(keySet);
		
		Collection<String> values = mp.values();
		
		
		System.out.println(values);
		
		boolean containsKey = mp.containsKey(1);
		
		System.out.println(containsKey);
		
		boolean containsValue = mp.containsValue("Java");
		
		System.out.println(containsValue);
		
		Set<Entry<Integer, String>> entrySet = mp.entrySet();
		
		System.out.println(entrySet);
		
		
		
	}

}
