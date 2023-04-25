package com.java8am;

public class DataTypes_ {

	public void nonPrimitiveDataTypes() {

		String s = "Sachin";

		System.out.println("String value is " + s);

		int[] arr = new int[5]; // Array Declared

		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;

		System.out.println(arr[1]);

		System.out.println(arr[3]);

	}

	public static void main(String[] args) {

		DataTypes_ dts = new DataTypes_();

		dts.nonPrimitiveDataTypes();

	}

}
