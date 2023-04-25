package com.Demo;

public class String_ {

	public static void main(String[] args) {

		String s = "JAVA";

		int length = s.length();

		System.out.println(length);

		for (int i = 0; i < length; i++) {

			char charAt = s.charAt(i);

			System.out.println(charAt);

		}

		String s1 = "  jeve in porur , Selenium in porur  ";

		boolean equals = s.equals(s1);

		System.out.println(equals);

		boolean equalsIgnoreCase = s.equalsIgnoreCase(s1);

		System.out.println(equalsIgnoreCase);

		String upperCase = s1.toUpperCase();

		System.out.println(upperCase);

		String lowerCase = s.toLowerCase();

		System.out.println(lowerCase);

		boolean startsWith = s1.startsWith("j");

		System.out.println(startsWith);

		boolean endsWith = s1.endsWith("porur");

		System.out.println(endsWith);

		boolean contains = s1.contains("in");

		System.out.println(contains);

		int indexOf = s1.indexOf('v');

		System.out.println(indexOf);

		int lastIndexOf = s1.lastIndexOf('a');

		System.out.println(lastIndexOf);

		String replace = s1.replace("porur", "annanagar");

		System.out.println(replace);

		String substring = s1.substring(5, 7);

		System.out.println(substring);

		String s2 = "";

		boolean empty = s2.isEmpty();

		System.out.println(empty);

		String[] split = s1.split("e");

		System.out.println(split[2]);

		String trim = s1.trim();

		System.out.println(trim);

		int compareTo = s1.compareTo(s2);

		System.out.println(compareTo);
	}

}
