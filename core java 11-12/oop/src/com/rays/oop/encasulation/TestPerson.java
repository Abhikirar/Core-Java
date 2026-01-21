package com.rays.oop.encasulation;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestPerson {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		Person p1 = new Person();

		p1.setName("abhishek");
		p1.setAddress("indore");
		p1.setDob(sdf.parse("2005-07-13"));

		System.out.println("name" + p1.getName());
		System.out.println("address" + p1.getAddress());
		System.out.println("dob:" + p1.getDob());
		
		System.out.println("-------");

           Person p2 = new Person();
           p2.setName( "rani");
           p2.setDob(sdf.parse( "2003-02-21"));
           p2.setAddress( "petlwad");
   		System.out.println("name" + p2.getName());
   		System.out.println("address" + p2.getAddress());
   		System.out.println("dob:" + p2.getDob());


	}

}
