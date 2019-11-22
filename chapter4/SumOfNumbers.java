package chapter4;
import java.util.Scanner;

public class SumOfNumbers {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int sum = 0,
			number;
		
		System.out.print("Enter a positive nonzero integer value: ");
		number = keyboard.nextInt();
		
		while (number <= 0) {
			System.out.print("Enter a positive nonzero integer value: ");
			number = keyboard.nextInt();
		}
		
		for (int i = 1; i <= number; i++)
			sum += i;
		
		System.out.println("The sum of all numbers leading to " + number + " is " + sum); 
		
		keyboard.close();
	}
}
