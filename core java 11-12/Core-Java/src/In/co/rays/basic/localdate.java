package In.co.rays.basic;

import java.time.LocalDate;

public class localdate {
public static void main(String[]args) {
	LocalDate now= LocalDate.now();
	
	System.out.println(now);
	System.out.println(now.getDayOfWeek());
	System.out.println(now.getDayOfYear());
	System.out.println(now.getDayOfMonth());
	System.out.println(now.getMonth());
	
	
	System.out.println ("----------------------");
	
	LocalDate dob = LocalDate.of(2005, 10, 26);
	
	System.out.println(dob);
	System.out.println(dob.getDayOfWeek());
	System.out.println(dob.getDayOfYear());
	System.out.println(dob.getDayOfMonth());
	
	System.out.println ("----------");
	System.out.println(now.getYear() - dob.getYear());
}
}
