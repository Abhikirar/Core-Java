package com.rays.basics;

public class ArmstongNo {
public static void main(String[]args) {
	int i =153;
	int temp = i;
	int r=0;
	int arms = 0;
	while (temp>0) {
		r = temp%10;
		temp = temp/10;
		arms = arms+r*r*r;
	}
	System.out.println(arms);
	if (i==arms) {
		System.out.println("armstrong no");
	}else {
		System.out.println("not armstrong no");
	}
	
}
}
