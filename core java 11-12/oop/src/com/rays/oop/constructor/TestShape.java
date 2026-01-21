package com.rays.oop.constructor;

public class TestShape {
	public static void main(String[] args) {
		Circle c = new Circle(6);
		c.setColor("black");
		c.setBorderwirdth(6);
		System.out.println("radius = " + c.getRadius());
		System.out.println(c.getBorderwridth());
		System.out.println(c.getColor());
		 System.out.println("---------");
		 
		 Triangle t = new Triangle(46, 56);
		 System.out.println(t.getHight());
		 System.out.println(t.getBase());
		 System.out.println(t.area());
		 System.out.println("_______----");
		 
		 
		 Rectangle r = new Rectangle (67, 43);
		 System.out.println(r.getLenght());
		 System.out.println(r.getBridth());
		 System.out.println(r.area());
	}
}

