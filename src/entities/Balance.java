package entities;

public class Balance {
	private String name;
	private int account;
	private double balance;
	private char check;
	
	public Balance(String name, int account, double balance) {
		this.name = name;
		this.account = account;
		this.balance = balance;
	}
	public String getName () {
		return name;
	}
	public int getAccount() {
		return account;
	}
	public double getBalance() {
		return balance;
	}
	public void addDeposit(double deposit) {
		this.balance += deposit;
	}
	public void addWithdraw(double withdraw) {
		this.balance -= withdraw + 5;
	}
	public String toStringAccount() {
		return name + " conta:" + account + " saldo:" + String.format("%.2f", balance);
	}
}
