package com.rays.oop.constructor;

public class Triangle extends Shape {
	private int base;
	private int hight;

	public Triangle(int hight, int base) {
		this.base = base;
		this.hight = hight;
	}

	public int getHight() {
		return this.hight;
	}

	public int getBase() {
		return this.base;
	}

	public double area() {
		double area = (base * hight) / 2;
		return area;
	}

}
