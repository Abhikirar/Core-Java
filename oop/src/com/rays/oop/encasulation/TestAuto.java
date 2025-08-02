package com.rays.oop.encasulation;

public class TestAuto {
	public static void main(String[] args) {

		Auto a = new Auto();

		a.setColors("Red");
		a.setName("Gwagon");
		a.setModal("svu");
		a.setPrice(6756.87);
		a.setSpeed(159);
		
		System.out.println("name = " + a.getName());
		System.out.println("modal =" + a.getModal());
		System.out.println("colrs =" + a.getColors());
		System.out.println("price = " + a.getPrice());

		a.Accelater();
		a.breack();
		a.changegear(4);
		a.changegear(7);
		a.breack();
		a.breack();
		a.Accelater();
	}
}
