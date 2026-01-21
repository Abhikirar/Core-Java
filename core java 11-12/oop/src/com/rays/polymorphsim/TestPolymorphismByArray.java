package com.rays.polymorphsim;

public class TestPolymorphismByArray {
	public static void main(String[] args) {
		
		Shape[] s = new Shape[3];
		System.out.println("length of shape array:" + s);
		
		s[0] = new Circle();
		s[1] = new Rectangle();
		s[2] = new Triangle();
		
		Circle c = (Circle) s[0];	
		c.setRadius( 4);
		
		Rectangle r = (Rectangle)s[1];
		r.setLength(6);
		r.setWidth(7);
		
		
		Triangle t = (Triangle) s[2];
		t.setBase(5);
		t.setHight(7);
		
		
		for(int i = 0; i< s.length; i++) {
			s[i].area();
		}
		
		

	}

}
