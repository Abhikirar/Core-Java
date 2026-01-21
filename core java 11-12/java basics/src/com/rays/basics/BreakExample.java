package com.rays.basics;

public class BreakExample {
	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			if (i == 6) {
				break; // exit the loop 6

			}
			System.out.println("number " + i);
		}
	}

}
