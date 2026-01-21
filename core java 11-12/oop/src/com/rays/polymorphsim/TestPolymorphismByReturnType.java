package com.rays.polymorphsim;

public class TestPolymorphismByReturnType {
	public static void main(String[] args) {
		Shape[] s = new Shape[3];

		s[0] = Shape.getShape(1); // new Circle();
		s[1] = Shape.getShape(2); // new Rectangle();
		s[2] = Shape.getShape(3); // new Triangle();

		Circle c = (Circle) s[0];
		c.setRadius(4);

		Rectangle r = (Rectangle) s[1];
		r.setLength(5);
		r.setWidth(7);

		Triangle t = (Triangle) s[2];
		t.setBase(8);
		t.setHight(3);

		 
		}

	}


