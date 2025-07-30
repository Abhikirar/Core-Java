package com.rays.oop.encasulation;

public class Account {
	private String name;
	private String accountno;
	private double accountbalance;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccountno() {
		return this.accountno;
	}

	public void setAccountno(String accountno) {
		this.accountno = accountno;
	}

	public double getAccountbalance() {
		return this.accountbalance;
	}

	public void setAccountbalance(double accountbalance) {
		this.accountbalance = accountbalance;
	}
}
