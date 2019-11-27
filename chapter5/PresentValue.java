// November 26, 2019
package chapter5;
import java.util.Scanner;

public class PresentValue {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double presentVal,
			   futureVal,
			   annualInterestRate,
			   years;
		String keepGoing = "yes";
		
		while (keepGoing.compareToIgnoreCase("yes") == 0) {
			System.out.print("Enter the future value you wish to obtain from savings: $");
			futureVal = keyboard.nextDouble();
			
			System.out.print("Enter the annual interest rate of your savings account (5% = 0.05): ");
			annualInterestRate = keyboard.nextDouble();
			
			System.out.print("Enter the number of years you want this amount by: ");
			years = keyboard.nextDouble();
			
			presentVal = presentValue(futureVal, annualInterestRate, years);
			System.out.printf("You need to deposit $%,.2f today to get $%,.2f in %.0f years.\n",
							presentVal, futureVal, years);
			
			keyboard.nextLine();
			
			System.out.print("\nWould you like to test again (y = yes, n = no): ");
			keepGoing = keyboard.nextLine();
			System.out.println();
			
		}
		
		keyboard.close();
	}
	
	public static double presentValue(double futureVal, double annualInterest, double numYears) {
		return futureVal / Math.pow((1 + annualInterest), numYears);
	}
}
