package com.trident.methods;

public class Addition {

	public static int addNumbers(int a, int b) {
		int sum = a + b;
		return sum;
	}

	public static void main(String[] args) {
		int num1 = 30;
		int num2 = 56;
		int result = addNumbers(num1, num2);
		System.out.println("Sum is: " + result);
	}

}
