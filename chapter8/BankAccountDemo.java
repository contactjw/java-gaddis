package chapter8;

public class BankAccountDemo {

	public static void main(String[] args) {
		BankAccount myAccount = new BankAccount(150.00);
		
		System.out.printf("My account currently has $%.2f\n", myAccount.getBalance());
		
		System.out.println("Making a copy of my account.");
		
		BankAccount yourAccount = new BankAccount(myAccount);
		
		System.out.printf("Your account currently has $%.2f", yourAccount.getBalance());
	}

}
