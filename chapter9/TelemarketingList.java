package chapter9;
import java.util.Scanner;

public class TelemarketingList {
	public static void main(String[] args) {
		String[] names = {"Harrison, Rose", "James, Jean", "Smith, William", "Smith, Brad"};
		String[] numbers = {"555-2234", "555-9098", "555-1785", "555-9224"};
		
		String input;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter a name or part of a name to find their number: ");
		input = keyboard.nextLine();
		System.out.println();
		
		for (int i = 0; i < names.length; i++) {
			if (names[i].contains(input))
				System.out.println(names[i] + ": " + numbers[i]);
		}
		
		keyboard.close();
	}
}
