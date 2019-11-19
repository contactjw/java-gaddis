package chapter3;
import java.util.Scanner;

public class WifiDiagnostic {
	public static void main(String[] args) {
		String input;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Reboot the computer and try to connect.");
		System.out.print("Did that fix the problem? ");
		input = keyboard.nextLine();
		if (input.compareToIgnoreCase("yes") == 0)
			System.exit(0);
		
		
		System.out.println("Reboot the router and try to connect.");
		System.out.print("Did that fix the problem (Yes or No)? ");
		input = keyboard.nextLine();
		if (input.compareToIgnoreCase("yes") == 0)
			System.exit(0);
		
		System.out.println("Make sure the cables between the router and modem are " +
						   "plugged in firmly.");
		System.out.print("Did that fix the problem (Yes or No)? ");
		input = keyboard.nextLine();
		if (input.compareToIgnoreCase("yes") == 0)
			System.exit(0);
		
		System.out.println("Move the router to a new location and try to connect.");
		System.out.print("Did that fix the problem (Yes or No)? ");
		input = keyboard.nextLine();
		if (input.compareToIgnoreCase("yes") == 0)
			System.exit(0);
		
		System.out.println("Get a new router.");
		
		keyboard.close();
		
	}
}
