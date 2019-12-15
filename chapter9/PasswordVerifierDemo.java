package chapter9;
import java.util.Scanner;

public class PasswordVerifierDemo {

	public static void main(String[] args) {
		String input;
		Scanner keyboard = new Scanner(System.in);
		
		do {
			System.out.print("Enter a password: ");
			input = keyboard.nextLine();
			if (!PasswordVerifier.verifyPassword(input))
				System.out.println("Invalid password.  Try again.");
			else
				System.out.println("Valid password.");
		} while (!PasswordVerifier.verifyPassword(input));
		
		keyboard.close();
	}
}
