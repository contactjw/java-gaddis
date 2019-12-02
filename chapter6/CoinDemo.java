package chapter6;

public class CoinDemo {
	public static void main(String[] args) {
		int totalHeads = 0,
			totalTails = 0;
		
		Coin c = new Coin();
		
		System.out.println("Initial side facing up is " + c.getSideUp());
		System.out.println("\nFlipping the coin 20 times and displaying results...\n");
		
		for (int i = 0; i < 20; i++) {
			c.toss();
			System.out.println("Coin landed on " + c.getSideUp());
			if (c.getSideUp().compareToIgnoreCase("heads") == 0)
				totalHeads++;
			else
				totalTails++;
		}
		
		System.out.println();
		System.out.println("Total times coin landed on heads: " + totalHeads);
		System.out.println("Total times coin landed on tails: " + totalTails);
	}
}
