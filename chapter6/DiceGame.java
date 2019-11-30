package chapter6;

// This class uses the die class
public class DiceGame {
	public static void main(String[] args) {
		int userScore = 0,
			computerScore = 0;
		
		Die playerDie = new Die(6);
		Die computerDie = new Die(6);
		
		for (int i = 0; i < 10; i++) {
			System.out.println("\nRolling both dice.");
			playerDie.roll();
			computerDie.roll();
			System.out.println("You rolled: " + playerDie.getValue());
			System.out.println("Computer rolled: " + computerDie.getValue());
			if (playerDie.getValue() > computerDie.getValue())
				userScore++;
			else if (computerDie.getValue() > playerDie.getValue())
				computerScore++;
			else
				continue;
			System.out.println();
		}
		
		System.out.println("Scoring Results:");
		System.out.println("User Score: " + userScore);
		System.out.println("Computer Score: " + computerScore);
		
		
		if (userScore > computerScore) 
			System.out.println("You are the grand winner!");
		else if (userScore == computerScore)
			System.out.println("You tied!");
		else
			System.out.println("Computer won!");
	
	}
}
