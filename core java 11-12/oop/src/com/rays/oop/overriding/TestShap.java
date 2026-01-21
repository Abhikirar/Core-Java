package com.rays.oop.overriding;

public class TestShap {
	public static void main(String[] args) {
		Circle c = new Circle();

		c.setColor("red");
		c.setBorderwidth(2);
		c.setRadius(4);

		System.out.println("colour:" + c.getColor());
		System.out.println("border width:" + c.getBorderwidth());
		System.out.println("radius: " + c.getRadius());
		c.area();

	}

}
