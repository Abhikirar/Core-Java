package com.rays.basics;

public class Palindorm {
	public static void main(String[] args) {
		int i = 121;
		int temp = i;
		int r = 0;
		int rv = 0;
		
		while(temp>0);{
		r = temp%10;
		 rv =  (rv * 10) + r;
		 temp = temp/10;
		 
		}System.out.println(rv);
		if (i == rv){
			System.out.println("pailndromr");
		}else{
			System.out.println("not plaindrome"); 
		}
	
	}
}
