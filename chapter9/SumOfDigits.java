package chapter9;
import java.util.Scanner;

public class SumOfDigits {
	public static void main(String[] args) {
		String number;
		char[] digits;
		
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter a number and I'll add the digits: ");
		number = keyboard.nextLine();
		
		digits = number.toCharArray();
		
		int highest = Character.getNumericValue(digits[0]);
		int lowest = Character.getNumericValue(digits[0]);
		int sum = 0;
		
		for (int i = 0; i < digits.length; i++) {
			if (Character.getNumericValue(digits[i]) > highest)
				highest = Character.getNumericValue(digits[i]);
			if (Character.getNumericValue(digits[i]) < lowest)
				lowest = Character.getNumericValue(digits[i]);
			sum += Character.getNumericValue(digits[i]);
		}
		
		System.out.println("Highest value in the number: " + highest);
		System.out.println("Lowest value in the number: " + lowest);
		System.out.println("Sum of all the digits: " + sum);
		
		keyboard.close();
	}
}
