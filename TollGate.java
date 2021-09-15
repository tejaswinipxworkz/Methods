package com.trident.methods;

public class TollGate {
	public static void gateOpen() {
		System.out.println("Gate opened");
	}
	
	public static void collectMoney() {
		System.out.println("Money paid");
	}

	public static void gateClose() {
		System.out.println("Gate closed");
	}
	public static void main(String[] args) {
		System.out.println("Entering toll gate");
		TollGate.gateOpen();
		TollGate.collectMoney();
		TollGate.gateClose();
		System.out.println("Leaving toll gate");

	}

}
