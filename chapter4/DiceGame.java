package chapter4;
import java.util.Scanner;
import java.util.Random;

public class DiceGame {
	public static void main(String[] args) {
		int computerDie,
			playerDie,
			computerScore = 0,
			playerScore = 0;
		
		Scanner keyboard = new Scanner(System.in);
		Random randomInt = new Random();
		
		System.out.println("Dice Game");
		System.out.println("---------");
		
		for (int i = 0; i < 10; i++) {
			System.out.println("-----------------------------------");
			System.out.print("Computer Score: " + computerScore);
			System.out.println("\tPlayer Score: " + playerScore);
			System.out.println("-----------------------------------");
			computerDie = randomInt.nextInt(6) + 1;
			playerDie = randomInt.nextInt(6) + 1;
			System.out.println("Computer rolled a " + computerDie);
			System.out.println("Player rolled a " + playerDie);
			System.out.println();
			if (computerDie > playerDie)
				computerScore++;
			else if (playerDie > computerDie)
				playerScore++;	
		}
		
		if (computerScore > playerScore)
			System.out.println("COMPUTER WON WITH A SCORE OF: " + computerScore);
		else if (playerScore > computerScore)
			System.out.println("PLAYER WON WITH A SCORE OF: " + playerScore);
		else
			System.out.println("PLAYER AND COMPUTER TIED WITH A SCORE OF: " + playerScore);
		
		keyboard.close();
	}
}
