package chapter3;
import java.util.Scanner;

public class BankCharges {
	public static void main(String[] args) {
		double total = 0.0;
		int numChecks;
		
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter the number of checks written this month: ");
		numChecks = keyboard.nextInt();
		
		if (numChecks < 20)
			total = 10 + (numChecks * 0.10);
		else if (numChecks < 39)
			total = 10 + (numChecks * 0.08);
		else if (numChecks < 59)
			total = 10 + (numChecks * 0.06);
		else
			total = 10 + (numChecks * 0.04);
		
		System.out.printf("Total Checks Written: %d\nTotal Charges: $%.2f", numChecks, total);
		
		keyboard.close();
	}
}
