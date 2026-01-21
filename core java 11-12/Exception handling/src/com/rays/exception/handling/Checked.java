package com.rays.exception.handling;

public class Checked {
	public static void main(String[] args) {
		try {
			son();
		} catch (Exception e) {
			System.out.println("done = "+e.getLocalizedMessage());
		}
		System.out.println("bach gye");

	}
	public static void son() throws Exception{
	throw new Exception ("make amistake");
	}
}
