package com.rays.basics;

public class TestString {
	public static void main(String[] args) {
		String name = "Abhishek singh kirar";
		System.out.println("name=" + name);
		System.out.println("length="+ name.length());
		System.out.println("7char is:"+ name.charAt(7));
		System.out.println("index of a is:"+ name.indexOf('b'));
		System.out.println("String lenght"+ name.length());
		System.out.println("a replace with a:"+ name.replace('b', 'a'));
		System.out.println(" small:"+name .toLowerCase());
		System.out.println("upper:"+ name.toUpperCase());
		System.out.println(name.startsWith("A"+ "b"));
		System.out.println(name.endsWith("rar"));
		System.out.println(name.endsWith("Ar"));
		System.out.println("i replace with k;"+ name.replace('i', 'k'));
		System.out.println(name);
	}

}
