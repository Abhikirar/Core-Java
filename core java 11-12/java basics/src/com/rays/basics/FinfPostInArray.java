package com.rays.basics;

public class FinfPostInArray {
 public static void main (String [] args) {
	int [] arry = {7,8,6,3,5,7,9,7}; 
	int n = 7;
	int count = -1;
	for (int i = 0; i< arry.length; i++) {
		if (n == arry[i]) {
			count = i;
			System.out.println(count+"="+ arry[i]);
 		}
	}
	if (count == -1) {
		System.out.println(count);
	}
 }
}
