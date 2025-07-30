package com.rays.basics;

import java.time.LocalDate;
import java.util.Date;

public class TestLocalDate {
public static void main(String[] args) {
	LocalDate now = LocalDate.now ();
	System.out.println(now);
	LocalDate dob = LocalDate.of(2005, 07,  13);
	System.out.println(dob);
	System.out.println(dob.getDayOfMonth());
	System.out.println(dob.getMonthValue());
	System.out.println(dob.getDayOfYear());
	System.out.println(dob.getYear());
 System.out.println(dob.getDayOfWeek()); 
}
}
