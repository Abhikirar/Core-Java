package Com.rays.thread;

public class Account {
	private int balance;

	public int getBalance() throws InterruptedException {
		Thread.sleep(200);
		return this.balance = balance;
	};

}
