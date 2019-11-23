package chapter4;
import java.util.Scanner;
import java.util.Random;

public class ESPGame {
	public static void main(String[] args) {
		String guess,
			   compColor = "";
		int numColor,
			count = 0,
			numCorrect = 0;
		
		Scanner keyboard = new Scanner(System.in);
		Random randomNum = new Random();
		
		while (count < 10) {
			numColor = randomNum.nextInt(5);
			switch (numColor) {
				case 0:
					compColor = "Red";
					break;
				case 1:
					compColor = "Green";
					break;
				case 2:
					compColor = "Blue";
					break;
				case 3:
					compColor = "Orange";
					break;
				case 4:
					compColor = "Yellow";
					break;
			}
			
			System.out.print("Guess the computer's color (Red, Green, Blue, " +
							 "Orange, Yellow): ");
			guess = keyboard.nextLine();
			System.out.println("Computer's color was " + compColor);
			if (compColor.compareToIgnoreCase(guess) == 0) {
				numCorrect++;
			}
			count++;
		}
		
		System.out.println("You answered " + numCorrect + " out of 10!");
		keyboard.close();
		
	}
}
