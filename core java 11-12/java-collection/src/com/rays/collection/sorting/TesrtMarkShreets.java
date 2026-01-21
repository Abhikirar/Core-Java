package com.rays.collection.sorting;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TesrtMarkShreets {
  public static void main(String[] args) {
	List< Marksheets> list = new ArrayList<Marksheets>();
	
	list.add(new Marksheets("Abhishek", 11, 80));
	list.add(new Marksheets("Neeraj", 16, 40));
	list.add(new Marksheets("Lucky", 15, 85));
	list.add(new Marksheets("Rohit", 13, 86));
	list.add(new Marksheets("Shyam", 17, 82));
	list.add(new Marksheets("Mohit", 14, 56));
	list.add(new Marksheets("Suresh", 12,65));
	
	list.forEach(System.out::println);
	
	System.out.println("------shorting by roll no"+ "");
	
   Collections.sort(list);
   list.forEach(System.out::println);

	
}
}
