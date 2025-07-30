package com.rays.basics;

public class ForEachLoop {
public static void main(String[]args) {
	int [] a = {5,10,15,20,25,30 };
	System.out.println( a[3]+" "+ a[4]);
 	for (int b : a) {
 	System.out.println(b +" ");
 	} 
	
	for (int i = 0; i< a.length; i++) {
		System.out.println(a[i]);
	}
}
}
