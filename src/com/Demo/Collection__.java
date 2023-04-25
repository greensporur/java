package com.Demo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Collection__ {

	public static void main(String[] args) {

		Set<Object> st = new HashSet<Object>();

		st.add(13);
		st.add(1);
		st.add(14);
		st.add(-1);
		st.add(14);
		st.add(12);
		st.add('a');
		System.out.println(st);

		Set<Integer> st1 = new LinkedHashSet<Integer>();
		st1.add(-1);
		st1.add(14);
		st1.add(12);
		st1.add(13);
		st1.add(1);
		st1.add(14);

		System.out.println(st1);

		Set<Integer> st2 = new TreeSet<Integer>();
		st2.add(-1);
		st2.add(14);
		st2.add(12);
		st2.add(13);
		st2.add(1);
		st2.add(14);

		System.out.println(st2);

	}

}
