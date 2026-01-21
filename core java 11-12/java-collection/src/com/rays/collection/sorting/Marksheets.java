package com.rays.collection.sorting;

public class Marksheets implements Comparable<Marksheets> {
	public String name;
	public int id;
	public int physics;

	
	//constractor//
	public Marksheets(String name, int id, int physics) {
		this.name = name;
		this.id = id;
		this.physics = physics;

	}
//get methord ki jagaha toString ka use kiya//
	public String toString() {
		return " Name = " + name + " id = " + id + " physics =" + physics;

	}
	
	//comprabale ki methord ko overide kiya//

	@Override
	public int compareTo(Marksheets o) {
		return this.name.compareTo(o.name);
		//return this.id- o.id;
	   // return this.physics - o.physics;
		//return o.physics - physics;
		//return  o.name.compareTo(name);
	}

}
