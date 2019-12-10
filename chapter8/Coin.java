package chapter8;
import java.util.Random;

public class Coin {
	private String sideUp;
	
	public Coin() {
		Random rand = new Random();
		if ((rand.nextInt(2)) == 0)
			sideUp = "heads";
		else
			sideUp = "tails";
	}
	
	public void toss() {
		Random rand = new Random();
		if (rand.nextInt(2) == 0)
			sideUp = "heads";
		else
			sideUp = "tails";
	}
	
	public String getSideUp() {
		return sideUp;
	}
}
