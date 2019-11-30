package chapter6;

public class AGameOfTwentyOne {
	private int computerScore;
	private int playerScore;
	
	public AGameOfTwentyOne() {
		computerScore = 0;
		playerScore = 0;
	}
	
	public int getComputerScore() {
		return computerScore;
	}
	
	public int getPlayerScore() {
		return playerScore;
	}
	
	public void addComputerPoints(int comp1, int comp2) {
		computerScore += (comp1 + comp2);
	}
	
	public void addPlayerPoints(int player1, int player2) {
		playerScore += (player1 + player2);
	}
}
