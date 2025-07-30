package com.rays.basics;

public class FabonicSeries {
public static void main (String[]args) {
	long a = 10;
	long b = 1;
	long c = 0;
	for (long i=0; i< 50; i++) {
		c = a+b;
		System.out.println(c+",");
		a = b;
		b = c;
	}
}
}
