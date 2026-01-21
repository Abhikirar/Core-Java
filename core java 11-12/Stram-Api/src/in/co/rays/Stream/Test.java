package in.co.rays.Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();

		list.add("abhishek");
		list.add("ranu");
		list.add("neeraj");
		list.add("Lucky");
		list.add("chetan");
		list.add("abhishek");
		list.add("tannya");

		list.forEach(e -> System.out.print(e + ", "));
		System.out.println();
		System.out.println("=============by distinct==============");
		list.stream().distinct().forEach(e -> System.out.print(e + ", "));
		System.out.println();
		System.out.println("by shoorted eith reverse==============");
		list.stream().distinct().sorted(Collections.reverseOrder()).forEach(e -> System.out.print(e + ", "));
		System.out.println();
		System.out.println("==================to upper case=============");
		list.stream().distinct().map(e -> e.toUpperCase()).forEach(e -> System.out.print(e + " ,"));
		System.out.println();
		System.out.println("==============to loweer case===========");
		list.stream().distinct().map(e -> e.toLowerCase()).forEach(e -> System.out.print(e + " ,"));
		System.out.println();
		System.out.println("=============satart with method==============");
		list.stream().distinct().map(e -> e.toLowerCase()).filter(e -> e.startsWith("t"))
				.forEach(e -> System.out.print(e + ", "));

	}
}
