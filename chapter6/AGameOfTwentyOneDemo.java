package chapter6;
import java.util.Scanner;

public class AGameOfTwentyOneDemo {
	public static void main(String[] args) {
		Die die1 = new Die(6);
		Die die2 = new Die(6);
		String keepGoing = "";
		
		Scanner keyboard = new Scanner(System.in);
		AGameOfTwentyOne game1 = new AGameOfTwentyOne();
		
		do {
			// Roll for computer
			die1.roll();
			die2.roll();
			game1.addComputerPoints(die1.getValue(), die2.getValue());
			
			// Roll for player
			System.out.println("You roll (2) six-sided dice...");
			die1.roll();
			die2.roll();
			System.out.println("You rolled " + die1.getValue() + " and " + die2.getValue());
			game1.addPlayerPoints(die1.getValue(), die2.getValue());
			if (game1.getPlayerScore() > 21) {
				System.out.println("You went over 21!");
				break;
			}
			System.out.println("\nYour current total is " + game1.getPlayerScore());
			System.out.print("Roll again? (yes or no): ");
			keepGoing = keyboard.nextLine();
			System.out.println("\n----------------------------");
		}while (keepGoing.compareToIgnoreCase("yes") == 0);
		
		System.out.print("\n------------");
		System.out.println("\nFinal Scores");
		System.out.println("------------");
		System.out.println("Computer's Total: " + game1.getComputerScore());
		System.out.println("  Player's Total: " + game1.getPlayerScore());
		System.out.println();
		if (game1.getPlayerScore() > game1.getComputerScore() && game1.getPlayerScore() <= 21)
			System.out.println("YOU WON THE GAME!");
		else if (game1.getComputerScore() > 21 && game1.getPlayerScore() > 21)
			System.out.println("You both went over 21... you both lose.");
		else if (game1.getComputerScore() > game1.getPlayerScore() && game1.getComputerScore() <= 21)
			System.out.println("The Computer won the game.");
		else if (game1.getComputerScore() <= 21 && game1.getPlayerScore() > 21)
			System.out.println("The Computer won the game.");
		else if (game1.getComputerScore() > 21 && game1.getPlayerScore() <= 21)
			System.out.println("YOU WON THE GAME!");
		
		keyboard.close();
	}
}
