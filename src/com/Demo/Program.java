package com.Demo;

public class Program {

	public static void main(String[] args) {

		String s = "Hello Java Selenium"; // olleH avaJ

		String[] split = s.split(" ");

		String output = "";

		for (int i = 0; i < split.length; i++) {

			String word = split[i]; // Hello

			for (int j = word.length() - 1; j >= 0; j--) {

				char charAt = word.charAt(j);

				output = output + charAt;

			}

			output = output + " ";

		}

		System.out.println(output);

	}

}
