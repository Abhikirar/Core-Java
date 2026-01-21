package com.rays.oop.overriding;

public class TestShape2 {
	public static void main(String[] args) {

		// paresnt can keep child's reference
		Shape s1 = new Circle();

		//type cast shape s1 to circle c
		
		Circle c =   (Circle) s1;
		
		c.setColor("black");
		c.setBorderwidth(5);
		c.setRadius(4);
		
		
		System.out.println("colour:" + c.getColor());
		System.out.println("border width:"+ c.getBorderwidth());
		System.out.println("radius:"+ c.getRadius());
		c.area();
	}

}
