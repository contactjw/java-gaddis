package chapter7;
import java.io.*;
import java.util.Scanner;

public class MagicBallDemo {

	public static void main(String[] args) throws IOException {
		String keepGoing = "yes";
		String question;
		
		Scanner keyboard = new Scanner(System.in);
		Magic8Ball ball = new Magic8Ball();
		
		while(keepGoing.compareToIgnoreCase("yes") == 0) {
			System.out.print("Ask the Magic 8 Ball a Question: ");
			question = keyboard.nextLine();
			ball.getResponse(question);
			System.out.println();
			System.out.print("Have another question? (yes or no): ");
			keepGoing = keyboard.nextLine();
			System.out.println();
		}
		
		keyboard.close();
	}
}
