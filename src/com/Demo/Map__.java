package com.Demo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map__ {
	
	public static void main(String[] args) {
		
		Map<Integer,String> m = new HashMap<Integer,String>();
		
		
		m.put(null, "Java");
		
		m.put(2,"Selenium");
		
		m.put(3,"Project");
		
		m.put(4, "Java");
		
		
		System.out.println(m);
		
		System.out.println(m.size());
		
		Set<Integer> keySet = m.keySet();
		
		
		System.out.println(keySet);
		
		Collection<String> values = m.values();
		
		System.out.println(values);
		
		boolean containsKey = m.containsKey(3);
		
		System.out.println(containsKey);
		
		boolean containsValue = m.containsValue("Java");
		
		System.out.println(containsValue);
		
		Set<Entry<Integer, String>> entrySet = m.entrySet();
		
		
		System.out.println(entrySet);
		
	}

}
