package com.rays.oop.constructor;

public class Rectangle extends Shape {
	private int lenght;
	private int bridth;

	public Rectangle(int lenght, int bridth) {
		this.lenght = lenght;
		this.bridth = bridth;

	}
	public int getLenght() {
		return this.lenght;
	}
	public int getBridth() {
		return this.bridth;
	}
	public double area(){
		double area = lenght*bridth;
		return area;
	}
}
