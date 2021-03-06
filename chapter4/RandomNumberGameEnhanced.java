package chapter4;
import java.util.Scanner;
import java.util.Random;

public class RandomNumberGameEnhanced {
	public static void main(String[] args) {
		int guess = -1,
			numGuesses = 0,
			computerNumber;
		
		Random randomNumber = new Random();
		Scanner keyboard = new Scanner(System.in);
		
		computerNumber = randomNumber.nextInt(100) + 1;
		
		System.out.println("RANDOM NUMBER GAME");
		System.out.println("------------------");
		
		while (guess != computerNumber) {
			System.out.print("Enter a number from 1-100: ");
			guess = keyboard.nextInt();
			if (guess < computerNumber)
				System.out.println("Too low, guess again.");
			if (guess > computerNumber)
				System.out.println("Too high, guess again.");
			numGuesses++;
		}
		
		System.out.println("\nYou won! Computers number was: " + computerNumber);
		System.out.println("It took you " + numGuesses + " tries!");
		
		keyboard.close();
	}
}
