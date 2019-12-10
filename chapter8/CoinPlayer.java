package chapter8;

public class CoinPlayer {
	private int score;
	
	public CoinPlayer() {
		score = 0;
	}
	
	public void checkIfScore(String val, String guess) {
		if (val.equalsIgnoreCase(guess)) {
			System.out.println("\nCorrect guess!");
			score++;
		}
		else 
			System.out.println("\nWrong guess.");
	}
	
	public int getScore() {
		return score;
	}
}
