package com.trident.methods;

public class LoginMethod {

	public static void loginMethod(String UN, String PW) {
		String userName = "abc123";
		String passWord = "xyz321";
		if (UN == userName && PW == passWord) {
			System.out.println("Login successful");
		} else {
			System.out.println("Login failed");
		}
	}

	public static void main(String[] args) {
		LoginMethod.loginMethod("abc123", "xyz321");
	}
}
