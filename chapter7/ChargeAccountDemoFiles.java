package chapter7;
import java.util.Scanner;
import java.io.*;

// Example of checking account numbers from a file.

public class ChargeAccountDemoFiles {
	public static void main(String[] args) throws IOException{
		int accountNum;
		
		Scanner keyboard = new Scanner(System.in);
		
		ChargeAccountFile acc = new ChargeAccountFile();
		
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
