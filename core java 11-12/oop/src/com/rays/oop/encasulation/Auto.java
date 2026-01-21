package com.rays.oop.encasulation;

public class Auto {

	private String name;
	private String colors;
	private String modal;
	private double price;
	private int speed;
	public static final int NO_OF_GEAR = 6;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColors() {
		return colors;
	}

	public void setColors(String colors) {
		this.colors = colors;
	}

	public String getModal() {
		return modal;
	}

	public void setModal(String modal) {
		this.modal = modal;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getSpeed() {
		return this.speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void Accelater() {
		speed = speed + 20;
		System.out.println("accelater current speed=" + this.speed + "km/h");
	}

	public void breack() {
		speed = speed - 15;
		if (speed < 15) {
			speed = 0;
		}
		System.out.println("breack current speed=" + this.speed + "km/h");
	}

	public void changegear(int gear) {
		if (gear > 0 && gear <= NO_OF_GEAR) {
			System.out.println("gear change to=" + gear);
		} else {
			System.out.println("invaled gear please select gear between 1 and" + NO_OF_GEAR);
		}
	}

}