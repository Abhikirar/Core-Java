package com.rays.oop.encasulation;

public class TestAccount {
	public static void main(String[] args) {
		Account a = new Account();

		a.setAccountbalance(45.00);
		a.setAccountno("435202120026952");
		a.setName("Abhishek");

		System.out.println("name = " + a.getName());
		System.out.println("aprintlnccountbalance = " + a.getAccountbalance());
		System.out.println("accountno = " + a.getAccountno());
         a.deposit(56);
		System.out.println("-------");

		Account a1 = new Account();

		a1.setAccountbalance(645.78);
		a1.setAccountno("6574836578");
		a1.setName("rani");

		System.out.println(a1.getName());
		System.out.println(a1.getAccountbalance());
		System.out.println(a1.getAccountno());
      a1.deposit( 5465);
      a1.withdrwal(7000);
	}
}
