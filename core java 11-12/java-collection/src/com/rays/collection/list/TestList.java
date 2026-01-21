package com.rays.collection.list;

import java.util.ArrayList;
import java.util.List;

//1.List can contain duplicate values
//2.List can contain multiple null values
//3.order of list is  natural order

public class TestList {
 
	
	public static void main(String[] args) {
		  
		
		List list = new ArrayList();
		
		list.add(56);
		list.add("ram");
		list.add("ram");
		list.add(null);
		list.add(null);
		list.add('a');
		
		System.out.println(list);
		System.out.println(list.get(5));
		System.out.println(list.add('b'));
		System.out.println(list);
		list.remove(null);
		System.out.println(list);
		list.set( 5, "abhi");	
		System.out.println(list);
		System.out.println(list.indexOf("ram"));
		System.out.println(list.lastIndexOf('a'));
	}
}
