package in.co.rays.Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TestContestant {
	public static void main(String[] args) {

		List<Contestant> list = new ArrayList<Contestant>();

		list.add(new Contestant("ram", "7685778906"));
		list.add(new Contestant("shyam", "8680778906"));
		list.add(new Contestant("vijay", "9885778906"));
		list.add(new Contestant("ajay", "3485778906"));
		list.add(new Contestant("lucky", "6765378906"));
		list.add(new Contestant("Neeraj", "000778906"));
		list.add(new Contestant("amit", "12357789"));
		list.add(new Contestant("akash", "6685778906"));
		list.add(new Contestant("saurav", "7685778906"));
		list.add(new Contestant("jony", "7676577890"));
		list.add(new Contestant("invalidNo", " 0011"));

       // Get the phone no
System.out.println("<----Get the phone no ----->");
list.stream().map(e -> e.phone).forEach(e -> System.out.println(e));

// Get valid no
System.out.println("<---Get valid no--->");
list.stream().map(e -> e.phone).filter( e -> e.length() == 10).forEach( e -> System.out.println(e));

System.out.println("---remove duplicate phone no---");

list.stream().map(e -> e.phone).filter( e -> e.length() == 10).distinct().forEach( e -> System.out.println(e));

 System.out.println("---shuffel the phone no---");

 list.stream().map(e -> e.phone).filter( e -> e.length() == 10).distinct()
 .collect(Collectors .collectingAndThen(Collectors.toList(), e -> {
	 Collections.shuffle(e);
	 return e.stream();
	  })).forEach( e -> System.out.println(e));
 
 System.out.println("---limited three no--->");
 
 list.stream().map(e -> e.phone).filter( e -> e.length() == 10).distinct()
 .collect(Collectors .collectingAndThen(Collectors.toList(), e -> {
	 Collections.shuffle(e);
	 return e.stream();
	  })).limit(3).forEach( e -> System.out.println(e));
 
 
 



}
	
	
	
}