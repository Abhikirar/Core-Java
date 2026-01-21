
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
	public void deposit (double amount) {
		this.accountbalance = this.accountbalance +amount;
		System.out.println("total amount after deposit:"+ this.accountbalance);
	}
	public void withdrwal(double amount) {
		 if (amount>this.accountbalance) {
			 System.out.println("insuficent found");
		 }else {
			 this.accountbalance = this.accountbalance-amount;
			 System.out.println("total amount after withdrwal ="+ getAccountbalance());
		 }
	}
}
