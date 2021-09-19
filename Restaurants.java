package com.trident.methods;

public class Restaurants {
	public static void restaurantBill(int pizza, int ice) {
		int pizzaAmount = 450 ;
		int iceAmount = 250;
		int totalAmount;
		totalAmount = pizzaAmount + iceAmount;
		System.out.println("The toal bill is " + totalAmount);

	}

	public static void main(String[] args) {
		Restaurants.restaurantBill(450, 250);
	}

}
