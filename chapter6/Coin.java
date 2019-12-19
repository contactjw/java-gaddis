package chapter6;
import java.util.Random;

public class Coin {
	private String side;
	
	public Coin() {
		Random rand = new Random();
		if ((rand.nextInt(2)) == 0)
			side = "heads";
		else
			side = "tails";
	}
	
	public void toss() {
		Random rand = new Random();
		if (rand.nextInt(2) == 0)
			side = "heads";
		else
			side = "tails";
	}
	
	public String getSideUp() {
		return side;
	}
}
