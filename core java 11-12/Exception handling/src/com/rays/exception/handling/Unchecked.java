package com.rays.exception.handling;

public class Unchecked {
	public static void main(String[] args) {

		son();

	}

	public static void son() {
		try {
			throw new RuntimeException("make a mistake");

		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
	}
}
