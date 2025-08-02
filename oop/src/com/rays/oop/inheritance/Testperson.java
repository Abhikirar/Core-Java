package com.rays.oop.inheritance;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Testperson {
	public static void main(String[] args) throws ParseException {
		Student s = new Student();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		s.setName("ram");
		s.setDob(sdf.parse("13/07/2005"));
		s.setRollno(1246);
		s.setSubject("maths");
		s.setSchool("ahiliya devi");
		s.setAddress("indore");

		System.out.println("name = " + s.getName());
		System.out.println("rollno = " + s.getRoolno());
		System.out.println("subject = " + s.getSubject());
		System.out.println("dob = " + s.getDob());
		System.out.println("address = " + s.getAddress());
		System.out.println("school = " + s.getSchool());
		System.out.println("---------------");
		
		Doctor d = new Doctor();

		d.setHospital("M.y");
		d.setSpecilist("heart");

		System.out.println("Hospital name: " + d.getHospital());
		System.out.println("specalist: " + d.getSpecilist());
		System.out.println("----- buss----");
		
		Bussinessmen b = new Bussinessmen();
		
		b.setIncome(1234);
		b.setCompany( "tcs");
		b.setAddress("indore");
		b.setName("sunil sahu");
		b.setDob( sdf.parse( "12/07/1947"));
		
		
		System.out.println("income = "+ b.getIncome());
		System.out.println("address = "+ b.getAddress());
		System.out.println("company = "+ b.getCompany());
		System.out.println("name = "+ b.getName());
		System.out.println("dob = "+ b.getDob());
	}
}
