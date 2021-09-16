package com.trident.methods;

public class CubeRoot {
	public static int cubeRoot(int num) {
		return num * num * num;
	}

	public static void main(String[] args) {
		int result;
		result = cubeRoot(9);
		System.out.println("Cube root of 9 is:" + result);
	}

}
