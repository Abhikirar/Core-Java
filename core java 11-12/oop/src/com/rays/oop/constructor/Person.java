package com.rays.oop.constructor;

public class Person {
	private String name;
	private String address;

	public Person() {
		System.out.println("This is a default ");
	}

	public Person(String name) {
		System.out.println(name);
	}

	public Person(String name, String address) {
		// System.out.println(name + " " + address);
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

}
