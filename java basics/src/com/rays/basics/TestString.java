package com.rays.basics;

public class TestString {
public static void main (String [] args) {
	String name =  "abhishek singh kirar";
	System.out.println("name=" + name);
	System.out.println(" leng=" + name.length());
	System.out.println("7th char is :" + name.charAt(6));
	System.out.println("index of a is :"+ name.lastIndexOf('a'));
	System.out.println("index of a is:" + name.indexOf ('a'));
	System.out.println("String length" + name.length());
	System.out.println("a replace with b:"+ name.replace ('a', 'b'));
	System.out.println("chota abhishek " + name.toLowerCase());
	System.out.println(" bada abhishek"+ name.toUpperCase());
	System.out.println(name.startsWith("ab"));
	System.out.println(name.endsWith("rar"));
	System.out.println(name.endsWith("ar"));
	System.out.println("i replace with k;" + name.replace('i' ,'k'));
	System.out.println();
}

}
