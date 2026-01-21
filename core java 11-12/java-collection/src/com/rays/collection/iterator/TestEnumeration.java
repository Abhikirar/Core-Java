package com.rays.collection.iterator;

import java.util.Enumeration;
import java.util.Vector;

public class TestEnumeration {
	
public static void main(String[] args) {
	
	Vector v = new Vector();
	
	
	v.add(43);
	v.add("Abhishek");
	v.add("kirar");
	v.add('r');
	v.add(true);
	v.add(2);
	
	
	System.out.println(v);
	
	Enumeration e = v.elements(); 
	while (e.hasMoreElements()) {
		
		Object o = e.nextElement();
		System.out.println(o);
		
	}
	
			
	
}
}
