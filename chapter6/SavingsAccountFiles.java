package chapter6;
import java.util.Scanner;
import java.io.*;

public class SavingsAccountFiles {
	public static void main(String[] args) throws IOException{
		double annualInt,
			   deposit = 0.0,
			   totalDeposit = 0.0,
			   withdrawal = 0.0,
			   totalWithdrawal = 0.0;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the annual interest rate of the account (5% = 0.05): ");
		annualInt = keyboard.nextDouble();
						
		SavingsAccount savings = new SavingsAccount(500.00);
		
		savings.setAnnualInterest(annualInt);
		
		File file = new File("Deposits.txt");
		Scanner inFile = new Scanner(file);
		
		while (inFile.hasNext()) {
			deposit = inFile.nextDouble();
			totalDeposit += deposit;
			savings.deposit(deposit);
		}
		
		inFile.close();
		
		file = new File("Withdrawals.txt");
		inFile = new Scanner(file);
		
		while (inFile.hasNext()) {
			withdrawal = inFile.nextDouble();
			totalWithdrawal += withdrawal;
			savings.withdrawal(withdrawal);
		}
		
		
		savings.addInterest();
		
		System.out.printf("\nCurrent Balance: $%.2f", savings.getBalance());
		System.out.printf("\nTotal Amount Deposited: $%.2f", totalDeposit);
		System.out.printf("\nTotal Amount Withdrawn: $%.2f", totalWithdrawal);
		System.out.printf("\nTotal Interest Earned: $%.2f", savings.getInterestEarned());
		
		inFile.close();
		keyboard.close();
		
	}
}
