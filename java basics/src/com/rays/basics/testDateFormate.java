package com.rays.basics;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class testDateFormate {
public static void main(String[] args) throws ParseException {
	Date d = new Date();
	System.out.println(d);
	 SimpleDateFormat sdf = new SimpleDateFormat("h:mm");
	String formatedDate = sdf.format(d);
	System.out.println("after formate"+ formatedDate);
	System.out.println("----------");
	
	String dob = "13/07/2005";
	System.out.println("dob before date:"+dob);
	
	SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy/MM/dd");
	Date d1 = sdf1.parse(dob);
	System.out.println("dob after date:"+d1);
	
}
}
