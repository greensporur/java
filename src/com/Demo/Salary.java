package com.Demo;

public  class Salary {

	public int augSalary() {

		int varPay = 30000;
		int fixPay = 40000;

		int totalAugSalary = varPay + fixPay;

		return totalAugSalary;
	}

	public int sepSalary() {

		int varPay = 30000;
		int fixPay = 40000;

		int totalSepSalary = varPay + fixPay;
		return totalSepSalary;

	}

	public  void totalSalary() {

		int augSalary = augSalary();

		int sepSalary = sepSalary();

		int totalSalary = augSalary + sepSalary;

		System.out.println("Total of last two montth salary is " + totalSalary);

	}
	public static void main(String[] args) {
		
		Nature nt = new Nature();
		
		int a = 10;
		
		 a= 20;
		 
		
	}

}
