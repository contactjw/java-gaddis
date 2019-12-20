package chapter10;

public abstract class BankAccount {
	protected double balance;
	protected int numDeposits;
	protected int numWithdrawals;
	protected double annualInterest;
	protected double monthlyServiceCharges;
	
	public BankAccount(double bal, double intRate) {
		balance = bal;
		annualInterest = intRate;
	}
	
	public void deposit(double amount) {
		balance += amount;
		numDeposits++;
	}
	
	public void withdraw(double amount) {
		balance -= amount;
		numWithdrawals++;
	}
	
	public void calcInterest() {
		double monthlyInterestRate = (annualInterest / 12.0);
		double monthlyInterest = balance * monthlyInterestRate;
		balance += monthlyInterest;
	}
	
	public void monthlyProcess() {
		balance -= monthlyServiceCharges;
		calcInterest();
		numDeposits = 0;
		numWithdrawals = 0;
		monthlyServiceCharges = 0.0;
	}
}
