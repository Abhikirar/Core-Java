package com.rays.collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestRetainAll {
public static void main(String[] args) {
	 Collection c1 = new ArrayList();
	 c1.add("abhi");
	 c1.add(45.6);
	 c1.add(true);
	 c1.add('a');
	 System.out.println(c1);
	 Collection c2 = new ArrayList();
	 c2.add("kirar");
	 c2.add(true);
	 c2.add('a');
	 c2.add(33.2);
	 System.out.println(c2);
	 c1.retainAll(c2);
	 System.out.println(c1);
}
}
