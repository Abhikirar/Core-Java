package com.rays.oop.inheritance;

public class Rectangle extends Shape {

	private int length;
	private int bridth;
	
	public int getLength() {
		return this.length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getBridth() {
		return this.bridth ;
	}
	public void setBridth(int bridth) {
		this.bridth = bridth;
	}
	public double area (){
		double area = length*bridth;
		return area;
	}
	
	
}
