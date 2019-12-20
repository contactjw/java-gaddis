package chapter10;

public class SavingsAccountDemo {

	public static void main(String[] args) {
		SavingsAccount account1 = new SavingsAccount(2500.50, 0.04);
		
		account1.displayBalance();
		account1.withdraw(100.00);
		account1.withdraw(200.50);
		account1.withdraw(100.00);
		account1.withdraw(100.00);
		account1.monthlyProcess();
		account1.displayBalance();
	}

}
