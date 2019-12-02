package chapter7;
import java.util.Scanner;

// Example of checking account numbers from an array.

public class ChargeAccountDemo {
	public static void main(String[] args) {
		int accountNum;
		
		Scanner keyboard = new Scanner(System.in);
		
		ChargeAccount acc = new ChargeAccount();
		
		System.out.print("Enter an account number: ");
		accountNum = keyboard.nextInt();
		
		if (acc.checkAccount(accountNum)) {
			System.out.println("Valid account.  Access Granted.");
		}
		else {
			System.out.println("Account does not exist.  Access Denied.");
		}
		
		keyboard.close();
		
	}
}
