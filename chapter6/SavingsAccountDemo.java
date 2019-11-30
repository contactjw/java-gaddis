package chapter6;
import java.util.Scanner;

public class SavingsAccountDemo {
	public static void main(String[] args) {
		double annualInt,
			   startBal,
			   deposit,
			   totalDeposit = 0.0,
			   withdrawal,
			   totalWithdrawal = 0.0;
		int months;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the annual interest rate of the account (5% = 0.05): ");
		annualInt = keyboard.nextDouble();
		
		System.out.print("Enter the starting balance of the account: $");
		startBal = keyboard.nextDouble();
		
		System.out.print("Enter the number of months since account has been established: ");
		months = keyboard.nextInt();
		
		SavingsAccount savings = new SavingsAccount(startBal);
		
		savings.setAnnualInterest(annualInt);
		
		for (int i = 1; i <= months; i++) {
			System.out.print("Enter the total deposit amount for month " + i + ": $");
			deposit = keyboard.nextDouble();
			totalDeposit += deposit;
			savings.deposit(deposit);
			System.out.print("Enter the total withdrawal amount for month " + i + ": $");
			withdrawal = keyboard.nextDouble();
			totalWithdrawal += withdrawal;
			savings.withdrawal(withdrawal);
			// add the monthly interest rate to balance
			savings.addInterest();
		}
		
		System.out.printf("\nCurrent Balance: $%.2f", savings.getBalance());
		System.out.printf("\nTotal Amount Deposited: $%.2f", totalDeposit);
		System.out.printf("\nTotal Amount Withdrawn: $%.2f", totalWithdrawal);
		System.out.printf("\nTotal Interest Earned: $%.2f", savings.getInterestEarned());
		
		keyboard.close();
	}
}
