package com.rays.collection.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestFailFast {

	public static void main(String[] args) {
		List list = new ArrayList();

		list.add(56);
		list.add("ram");
		list.add("ram");
		list.add(null);
		list.add(null);
		list.add('a');

		Iterator it = list.iterator();

		// fail fast
		//list.add("abhi");

		while (it.hasNext()) {
			
		
			Object o = it.next();
			//it.remove();
			System.out.println(o);
		}
		
		
		System.out.println("----");
		System.out.println(list);

	}
}
