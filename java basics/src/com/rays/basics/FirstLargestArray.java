package com.rays.basics;

public class FirstLargestArray {
public static void main (String[]args) {
	int [] array = {25,52,35,78,98,10};
	int n = array [0];
	for (int a: array) {
		if (a > n) {
			n = a;
		}
	}
	System.out.println("largest:"+n);
}
}
