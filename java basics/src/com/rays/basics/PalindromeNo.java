package com.rays.basics;

public class PalindromeNo {
public static void main (String[]arms) {
	int n = 121;
	int temp = n;
	int r = 0;
	int rv = 0;
	
	while (temp > 0) {
		r = temp % 10;
		rv = (rv * 10) + r;
		temp = temp / 10;
	}
	System.out.println(rv);
	if (n == rv) {
		System.out.println("paildrom ");
	}else {
	System.out.println("not palindrom");	
	}
}
}
