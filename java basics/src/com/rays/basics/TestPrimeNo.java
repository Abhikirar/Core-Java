package com.rays.basics;

public class TestPrimeNo {
public static void main (String[]args) {
	
int []	a = {3,7,8,17,19};
int count = 0;
for (int b : a) {
	for (int i = 2; i< b; i++) {
		if  (b % i == 0) {
		count ++;
		
		}
	} if (count > 0) {
		System.out.println(b + "is not prime");
		count = 0;
	}else {
		System.out.println(b + "is prime");
	}
}
	
}
}
