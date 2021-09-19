package com.trident.methods;

public class TrainInformation {

	public static void ticketReserve(String seatnumber, String counter) {
		System.out.println( "The tickets are reserved in counter " + counter + " for seatnumber " + seatnumber);
	}

	public static void chennaiExpress(String time) {
		System.out.println( "chennai express will start arriving at " + time);

	}

	public static void main(String[] args) {
		TrainInformation.ticketReserve("256", "80");
		TrainInformation.chennaiExpress("8:00 PM");
		System.out.println("Tickets reserved successfully");
	}

}
