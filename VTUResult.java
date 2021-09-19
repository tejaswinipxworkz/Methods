package com.trident.methods;

public class VTUResult {
	
	public static void checkResult(String UN) {
		String USN = "2TG17EC078";
		double result = 8.6;
		if (USN == UN) {
			System.out.println("The CGPA of " +USN+ " is "+result);
		} else {
			System.out.println("Invalied USN");
		}

	}

	public static void main(String[] args) {
		VTUResult.checkResult("2TG17EC078");
	}
}
