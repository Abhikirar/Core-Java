package com.rays.collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollectionAddAll {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("ram");
		c.add(44.44);
		c.add(false);
		c.add('b');

		System.out.println("c1:" + c);
		System.out.println("size of c:" + c.size());
		System.out.println(c.contains("ram"));
		c.remove(44.44);
		System.out.println(c);
		
		
		System.out.println("------");

		Collection c1 = new ArrayList();

		c1.add("shayam");
		c1.add(42.34);
		c1.add(true);
		c1.add('h');
		c1.add('a');

	  System.out.println("c1:"+ c1);
	  System.out.println("size of c1:"+ c1.size());
	  
	  
	  System.out.println("-----");
	  
	  c.addAll(c1);
	  System.out.println(" c after adding c1 :"+ c1 );
	  System.out.println("c after remove c1 "+ c1);
		System.out.println(c.removeAll(c1));
	  
	  System.out.println(c.removeAll(c1));
	}
}
