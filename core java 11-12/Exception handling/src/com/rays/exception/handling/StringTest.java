package com.rays.exception.handling;

public class StringTest {
public static void main(String[] args) {
	try {
		String a = "abhi";
		System.out.println(a.length());
		System.out.println(a.charAt(4));
	}catch(NullPointerException n) {
		System.out.println("project finished"+ n.getLocalizedMessage());
		
	}
	catch(IndexOutOfBoundsException i) {
		System.out.println("project finished"+ i.getLocalizedMessage());
	}finally {
		System.out.println("always exicutable");
	}
	System.out.println("project finished by abhishek");
	
}
}
