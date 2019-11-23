package chapter4;
import java.util.Scanner;

public class LargestAndSmallest {
	public static void main(String[] args) {
		int number,
			largest = 0,
			smallest = 0;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter a number, or -99 to quit: ");
		number = keyboard.nextInt();
		
		if (number != -99) {
			largest = number;
			smallest = number;
		}
		
		while (number != -99) {
			if (number > largest)
				largest = number;
			if (number < smallest)
				smallest = number;
			System.out.print("Enter a number, or -99 to quit: ");
			number = keyboard.nextInt();
		}
		
		System.out.println("Smallest number: " + smallest);
		System.out.println("Largest number: " + largest);
		
		keyboard.close();
	}
}
