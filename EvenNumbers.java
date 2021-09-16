package com.trident.methods;

public class EvenNumbers {
	
	public static void checkEven(int array[]) {
		int a[] = { 12, 23, 34, 54, 56, 77, 65, 69, 80, 90 };
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				System.out.println(a[i]);
			}
		}
	}

	public static void main(String[] args) {
		EvenNumbers.checkEven(null);

	}

}
