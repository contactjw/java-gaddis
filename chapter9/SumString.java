package chapter9;
import java.util.Scanner;

public class SumString {
	public static void main(String[] args) {
		String numbers;
		int sum = 0;
		Scanner keyboard = new Scanner(System.in);
		
		
		System.out.print("Enter a series of numbers separated by commas: ");
		numbers = keyboard.nextLine();
		
		String[] tokens = numbers.split(",");
		
		for (int i = 0; i < tokens.length; i++) {
			sum += Integer.parseInt(tokens[i]);
		}
		
		System.out.println("The sum of your numbers is: " + sum);
		
		keyboard.close();
	}

}
