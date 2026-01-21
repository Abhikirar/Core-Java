package com.rays.map;

import java.util.HashMap;
import java.util.Map;

public class TestMap {

	public static void main(String[] args) {
		Map m = new HashMap();

		m.put("one", 1);
		m.put("two", 2);
		m.put("three", 3);
		m.put("four", 4);

		System.out.println();
		System.out.println(m.get("three"));
		System.out.println(m.entrySet());
		System.out.println(m.containsValue(3));
		System.out.println(m.size());
		System.out.println(m.containsKey("two"));
		System.out.println(m.containsKey("five"));
		m.remove("two");
		System.out.println(m.size());
		System.out.println(m.entrySet());
		System.out.println(m.containsKey("six"));

	}
}
