package chapter8;

public class FirstToOneDemo {

	public static void main(String[] args) {
		Die die = new Die(6);
		
		Player player1 = new Player();
		Player player2 = new Player();
		
		while (player1.getScore() != 1 && player2.getScore() != 1) {
			die.roll();
			System.out.println("Player 1 rolled: " + die.getValue());
			System.out.println("Player 1's current score is: " + player1.subtractDie(die.getValue()));
			System.out.println("-------------------------------------\n");
			die.roll();
			System.out.println("Player 2 rolled: " + die.getValue());
			System.out.println("Player 2's current score is: " + player2.subtractDie(die.getValue()));
			System.out.println("-------------------------------------\n");	
		}
		
		if (player1.getScore() == 1 && player2.getScore() == 1)
			System.out.println("\nThe players have tied the game!");
		else if (player1.getScore() == 1)
			System.out.println("\nPlayer 1 has won the game!");
		else if (player2.getScore() == 1)
			System.out.println("\nPlayer 2 has won the game!");
	}

}
