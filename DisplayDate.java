package com.trident.methods;

import java.util.Date;

public class DisplayDate {
	public static void displayDate() {
		System.out.println(new Date());
	}

	public static void main(String[] args) {
		System.out.println("Beginning of main method");
		DisplayDate.displayDate();
		System.out.println("End of main method");

	}

}
