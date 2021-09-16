package com.trident.methods;

public class GooglePhotos {
	public static void loginGP(String Em, int Ps) {
		String Email = "xyz@gmail.com";
		int Password = 346754;
		if (Email == Em && Password == Ps) {
			System.out.println("Welcome to googlephotos");
		} else {
			System.out.println("Wrong username or password");
		}
	}

	public static void main(String[] args) {
		GooglePhotos.loginGP("xyz@gmail.com", 346754);
	}
}
