package com.rays.exception.handling;

public class TestException {
	public static void main(String[] args) {
		try {
			int a = 0;
			int b = 7;
			double div = b / a;
			System.out.println("div " + div);

		} catch (ArithmeticException e) {
			System.out.println("project finised" + e.getLocalizedMessage());

		}

	}
}
