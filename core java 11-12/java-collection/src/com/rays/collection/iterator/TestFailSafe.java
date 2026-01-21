package com.rays.collection.iterator;

import java.util.Enumeration;
import java.util.Vector;

public class TestFailSafe {

	public static void main(String[] args) {
		Vector v = new Vector();

		v.add(43);
		v.add("Abhishek");
		v.add("kirar");
		v.add('r');
		v.add(true);
		v.add(2);

		Enumeration e = v.elements();

		// fail safe or not fail fast
		v.add("abhi");
		
		while(e.hasMoreElements()) {
			Object o = e.nextElement();
			System.out.println(o);
		}
	}
}
