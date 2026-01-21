package com.rays.oop.abstrac;

public class Businessman extends Person implements RichMan,SocilWorker {

	@Override
	public void helptoother() {
		System.out.println("help to other...!");
		 
		
	}

	@Override
	public void earnmoney() {
		System.out.println("earnmoney...!");
		 
	}

	@Override
	public void donation() {
		System.out.println("donation...!");
		 
		
	}

	@Override
	public void party() {
		System.out.println("party...!");
	 
		
	}
	

}
