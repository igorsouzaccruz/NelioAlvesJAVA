package entities;

public class conta {

	private int number;
	private String holder;
	private double balance;
	
	public conta(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposite(initialDeposit);
	}

	public conta(int number, String holder) {
		super();
		this.number = number;
		this.holder = holder;
	}

	public int getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	public void deposite (double amount) {
		balance += amount;
	}
	public void withdraw (double amount) {
		balance -= amount + 5.0;
	}
	
	public String toString() {
		return "Account " + number + " Holder " + holder + ", Balance; $" 
	+ String.format("%.2f", balance);
	}
	
	
	 
}
