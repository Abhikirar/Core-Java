package com.rays.basics;

public class CountVowels {
	public static void main(String[] args) {
		// a,e,i,o,u
		String str = " Abhishek";
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			// if ('a'== str.charAt(i)||'e'== str.charAt(i)||'i'== str.charAt(i)||'0'==
			// str.charAt(i)||'u'== str.charAt(i)|| )
			// count++;
		}

		for (int i = 0; i < str.length(); i++) {
			if ('a' == str.charAt(i)) {
				count++;
			}
			if ('e' == str.charAt(i)) {
				count++;
			}
			if ('i' == str.charAt(i)) {
				count++;
			}
			if ('o' == str.charAt(i)) {
				count++;
			}
			if ('u' == str.charAt(i)) {
				count++;
			}
			 

		}
		System.out.println("total vowels are:"+count);
	}
}
