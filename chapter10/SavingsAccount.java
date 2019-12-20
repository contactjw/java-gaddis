package chapter10;

public class SavingsAccount extends BankAccount{
	private boolean active;
	
	public SavingsAccount(double bal, double annualInt) {
		super(bal, annualInt);
		if (super.balance < 25.00)
			active = false;
		else
			active = true;
	}
	
	public void withdraw(double amount) {
		if (!active)
			System.out.println("Account balance below $25.00, Cannot withdraw.");
		else
			super.withdraw(amount);
	}
	
	public void deposit(double amount) {
		super.deposit(amount);
		if (!active) {
			if (super.balance > 25.00)
				active = true;
		}
	}
	
	public void monthlyProcess() {
		if (super.numWithdrawals > 4) {
			super.monthlyServiceCharges += (1 * (super.numWithdrawals - 4));
		}
		super.monthlyProcess();
		System.out.printf("Current Account Balance: $%.2f\n", super.balance);
		if (super.balance < 25.00)
			active = false;
	}

	public void displayBalance() {
		System.out.printf("Current Account Balance: $%.2f\n", super.balance);
	}
}
