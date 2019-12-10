package chapter8;

public class Player {
	private int score;
	
	public Player() {
		score = 50;
	}
	
	public int subtractDie(int val) {
		if ((score - val) <= 0)
			score += val;
		else
			score -= val;
		
		return score;
	}
	
	public int getScore() {
		return score;
	}
}
