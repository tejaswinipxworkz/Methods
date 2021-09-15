package com.trident.methods;

public class Phone {
//hearing songs, playing game, transfer money, calling, camera,
	public static void hearSong() {
		System.out.println("Song heard from playmusic");
	}

	public static void playGame() {
		System.out.println("Game needs 4 people");
	}

	public static void transferMoney() {
		System.out.println("Money transfered successfully");
	}

	public static void makeCall() {
		System.out.println("calling to police");
	}

	public static void camera() {
		System.out.println("Photo captured");
	}
	public static void main(String[] args) {
		Phone.hearSong();
		Phone.playGame();
		Phone.transferMoney();
		Phone.makeCall();
		Phone.camera();
	}

}
