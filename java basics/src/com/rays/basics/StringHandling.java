package com.rays.basics;

public class StringHandling {
public static void main (String []args) {
	String s1 = "sunrays";
	String s2 = "sunrays";
	String s3 = new String ("welcome");
	String s4 = new String ("sunrays");
	
	System.out.println(s1 == s4);
	System.out.println(s1.equals(s4));
}
}
