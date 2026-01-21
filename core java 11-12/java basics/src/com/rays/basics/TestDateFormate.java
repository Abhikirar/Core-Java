package com.rays.basics;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDateFormate {
	public static void main(String[] args) throws ParseException {
		Date d = new Date();
		System.out.println(d);

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String s = sdf.format(d);
		System.out.println("formate Date "+ s);
		System.out.println("-------");

		
		
		String dob = "21-02-1999";
		System.out.println("dod before date:" + dob );
		
		SimpleDateFormat sdf1 = new SimpleDateFormat();
		Date d1 = sdf.parse(dob);
		System.out.println("dob after date :"+ d1);
	}

}
