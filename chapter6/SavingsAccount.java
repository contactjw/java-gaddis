package chapter6;

public class SavingsAccount {
	private double annualIntRate;
	private double balance;
	private double interestEarned;
	
	public SavingsAccount(double bal) {
		balance = bal;
		interestEarned = 0.0;
	}
	
	public void setAnnualInterest(double intRate) {
		annualIntRate = intRate;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void withdrawal(double withdraw) {
		balance -= withdraw;
	}
	
	public void deposit(double deposit) {
		balance += deposit;
	}
	
	public void addInterest() {
		double monthlyInterest;
		monthlyInterest = annualIntRate / 12.0;
		balance += (monthlyInterest * balance);
		interestEarned += (monthlyInterest * balance);
	}
	
	public double getInterestEarned() {
		return interestEarned;
	}
	
}
