package com.rays.oop.inheritance;

public class TestShape {
	public static void main(String[] args) {

		Circle c = new Circle();
		c.setColor("red");
		c.setBorderwirdth(4);
		c.setBorderwirdth(5);
		
		System.out.println("--------circle-------------");
		
		System.out.println("color:" + c.getColor());
		System.out.println("borderwidth :" + c.getBorderwridth());
		System.out.println("radius:" + c.getRadius());
		System.out.println("area" + c.area());

		Rectangle r = new Rectangle();

		r.setBridth(6);
		r.setLength(4);
		r.setColor("blue");
		r.setBorderwirdth(5);
		System.out.println("----------------------");
		
		System.out.println("length :"+ r.getLength());
		System.out.println("brigth:"+ r.getBridth());
		System.out.println("color:"+r.getColor());
		System.out.println("borderwirdth:"+ r.getBorderwridth());
		System.out.println("area:"+r.area());
		
		Triangle t = new Triangle();
		
		 t.setBase(898);
		 t.setHight(625);
		 t.setColor("white");
		 
		 System.out.println("-------triangle-------");
		 
		 System.out.println("base:"+ t.getBase());
		 System.out.println("hight:"+ t.getHigth());
		 System.out.println("color:"+ t.getColor());
		 System.out.println("area:"+ t.area());
		 
		 
		 
		 
		

	}

}
