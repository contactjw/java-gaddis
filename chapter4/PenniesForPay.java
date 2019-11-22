package chapter4;
import java.util.Scanner;

public class PenniesForPay {
	public static void main(String[] args) {
		int daysWorked;
		double totalPay = 0.01;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the number of days worked: ");
		daysWorked = keyboard.nextInt();
		
		while (daysWorked < 1) {
			System.out.print("Days worked cannot be less than 1: ");
			daysWorked = keyboard.nextInt();
		}
		
		
		System.out.println("\nDay\t\tAmount");
		
		for (int i = 1; i <= daysWorked; i++) {
			System.out.printf("%d\t\t %,.2f\n", i, totalPay);
			totalPay *= 2;
		}
		
		keyboard.close();
	}
}
