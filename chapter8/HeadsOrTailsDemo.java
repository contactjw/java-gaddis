package chapter8;
import java.util.Scanner;

public class HeadsOrTailsDemo {
	public static void main(String[] args) {
		String player1Choice;
		String player2Choice;
		
		Coin coin = new Coin();
		
		CoinPlayer player1 = new CoinPlayer();
		CoinPlayer player2 = new CoinPlayer();
		
		Scanner keyboard = new Scanner(System.in);
		
		while (player1.getScore() != 5 && player2.getScore() != 5) {
			coin.toss();
			System.out.print("Player 1, enter heads or tails: ");
			player1Choice = keyboard.nextLine();
			while (!player1Choice.equalsIgnoreCase("heads") &&
				   !player1Choice.equalsIgnoreCase("tails")) {
				System.out.print("Enter heads or tails: ");
				player1Choice = keyboard.next();
			}
			player1.checkIfScore(coin.getSideUp(), player1Choice);
			System.out.println("\nPlayer 1's current score: " + player1.getScore());
			System.out.println("--------------------------------------------------");
			
			coin.toss();
			System.out.print("\nPlayer 2, enter heads or tails: ");
			player2Choice = keyboard.nextLine();
			while (!player2Choice.equalsIgnoreCase("heads") &&
				   !player2Choice.equalsIgnoreCase("tails")) {
				System.out.print("Enter heads or tails: ");
				player2Choice = keyboard.next();
			}
			player2.checkIfScore(coin.getSideUp(), player2Choice);
			System.out.println("\nPlayer 2's current score: " + player2.getScore());
			System.out.println("--------------------------------------------------");
			System.out.println();
		}
		
		if (player1.getScore() == 5 && player2.getScore() == 5)
			System.out.println("Both players have tied!");
		else if (player1.getScore() == 5)
			System.out.println("Player 1 has won the game!");
		else if (player2.getScore() == 5)
			System.out.println("Player 2 has won the game!");
		
		keyboard.close();
			
	}
}
