<<<<<<< HEAD
// November 26, 2019
=======
>>>>>>> 3851348aa9416ff228497258374d9ce939138c9c
package chapter5;
import java.util.Scanner;
import java.util.Random;

public class RockPaperScissorsGame {
	public static void main(String[] args) {
		int computer,
			player;
		
		do {
		computer = computerChoice();
		player = playerChoice();
		System.out.println("\nComputer chose " + selected(computer));
		System.out.println("You chose " + selected(player));
		System.out.println();
		whoWon(computer, player);
		} while (player == computer);
		
	}
	
	public static int computerChoice() {
		Random randomNum = new Random();
		int computerChoice = randomNum.nextInt(3) + 1;
		return computerChoice;
	}
	
	public static int playerChoice() {
		// Ignore this warning JVM handles closing scanners.
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		int playerChoice;
		menu();
		System.out.print("Enter your choice: ");
		playerChoice = keyboard.nextInt();
		while (playerChoice < 1 || playerChoice > 4) {
			System.out.print("Enter one of the choices displayed: ");
			playerChoice = keyboard.nextInt();
		}
		if (playerChoice == 4)
			System.exit(0);
		return playerChoice;
	}
	
	public static String selected(int value) {
		String choice = "";
		switch (value) {
			case 1:
				choice = "Rock";
				break;
			case 2:
				choice = "Paper";
				break;
			case 3:
				choice = "Scissors";
				break;
		}
		return choice;
	}
	
	public static void whoWon(int computer, int player) {
		if (computer == 1 && player == 3)
			System.out.println("Computer wins!");
		else if (computer == 1 && player == 2)
			System.out.println("You win!");
		else if (computer == 1 && player == 1)
			System.out.println("You tied.");
		else if (computer == 2 && player == 1)
			System.out.println("Computer wins!");
		else if (computer == 2 && player == 2)
			System.out.println("You tied!");
		else if (computer == 2 && player == 3)
			System.out.println("You win!");
		else if (computer == 3 && player == 1)
			System.out.println("You win!");
		else if (computer == 3 && player == 2)
			System.out.println("Computer wins!");
		else
			System.out.println("You tied.");
	}
	
	public static void menu() {
		System.out.println("Menu Selection");
		System.out.println("1. Rock");
		System.out.println("2. Paper");
		System.out.println("3. Scissors");
		System.out.println("4. Quit");
	}	
	
}
