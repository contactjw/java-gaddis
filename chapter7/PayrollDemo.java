package chapter7;
import java.util.Scanner;

public class PayrollDemo {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int hours = 0;
		double pay = 0.0;
		double wage = 0.0;
		int id = 0;
		
		Payroll payGroup = new Payroll();
		
		for (int i = 0; i < 7; i++) {
			System.out.print("Enter the hours worked for employee " + payGroup.getIdAt(i) + ": ");
			hours = keyboard.nextInt();
			while (hours < 0) {
				System.out.print("Hours cannot be negative try again: ");
				hours = keyboard.nextInt();
			}
			
			System.out.print("Enter the pay rate for employee " + payGroup.getIdAt(i) + ": ");
			pay = keyboard.nextDouble();
			while (pay < 6.00) {
				System.out.print("Pay rate cannot be less than $6.00 an hour: ");
				pay = keyboard.nextDouble();
			}
			
			payGroup.setHoursAt(i, hours);
			payGroup.setPayRateAt(i, pay);
			System.out.println();
		}
		
		System.out.print("Enter an employee ID to get their total pay: ");
		id = keyboard.nextInt();
		wage = payGroup.getWages(id);
		
		System.out.printf("Total Pay: $%.2f\n", wage);
		
		
		keyboard.close();
	}
}
