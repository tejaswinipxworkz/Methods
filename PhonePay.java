package com.trident.methods;

public class PhonePay {

	// MoneyTransfer, MobileRecharge, ElectricityBill, WaterBill, DTH

	public static void transferMoney() {
		System.out.println("Money transferred successfully");
	}

	public static void rechargeMobile() {
		System.out.println("Mobile recharge successfully");
	}

	public static void electricityBill() {
		System.out.println("Electricity bill paid successfully");
	}

	public static void waterBill() {
		System.out.println("Water bill paid successfully");
	}

	public static void rechargeDTH() {
		System.out.println("DTH recharge paid successfully");
	}

	public static void main(String[] args) {
		System.out.println("Login into Phonepay");
		PhonePay.rechargeMobile();
		PhonePay.electricityBill();
		PhonePay.waterBill();
		PhonePay.rechargeDTH();
		System.out.println("Log out phonepay");
	}

}
