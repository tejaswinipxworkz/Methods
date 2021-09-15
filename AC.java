package com.trident.methods;

public class AC {
	public static void on() {
		System.out.println("AC is on");
	}

	public static void off() {
		System.out.println("AC is off");
	}

	public static void increaseTemp() {
		System.out.println("Temperature is increased");
	}

	public static void decreaseTemp() {
		System.out.println("Temperature is decreased");
	}

	public static void main(String[] args) {
		AC.on();
		AC.off();
		AC.increaseTemp();
		AC.decreaseTemp();

	}

}
