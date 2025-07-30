package com.rays.basics;

public class ReverseNo {
public static void main(String[] args) {
	int a= 45367;
	int rn =0;
	int r= 0;
	while (a>0) {
		r = a%10;
		rn= (rn*10)+r;
		a = a/10;
	}
	System.out.println(rn);		
}
}
