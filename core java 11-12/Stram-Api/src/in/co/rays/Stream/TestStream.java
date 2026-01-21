package in.co.rays.Stream;

import java.util.ArrayList;
import java.util.List;

public class TestStream {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();

		list.add(2);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		
		list.stream().distinct().filter( e -> e % 2 == 0).forEach(e -> System.out.println(e + "even"));
		System.out.println();
		list.stream().distinct().filter( e -> e % 2 != 0).forEach(e -> System.out.println(e + "odd"));
		
		
		
		
		
		
		
		
	}
}
