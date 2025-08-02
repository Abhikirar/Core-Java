package com.rays.oop.inheritance;

public class Triangle extends Shape {
 
	private int base;
	private int hight;
	
	
	public int getHigth() {
		return this.hight;
	}
	public void  setHight(int hight) {
		this.hight = hight;
	}
	public int getBase() {
		return this.base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public double area() {
		double area = (base*hight)/2 ;
		return area;
	}
	
}
