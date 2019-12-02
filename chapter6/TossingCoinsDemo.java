package chapter6;

public class TossingCoinsDemo {
	public static void main(String[] args) {
		double totalAmount = 0.0;
		int round = 1;
		
		Coin quarter = new Coin();
		Coin dime = new Coin();
		Coin nickel = new Coin();
		
		System.out.println("Tossing Coins Game");
		System.out.println("------------------");
		while (totalAmount < 1.0) {
			System.out.println("\nTossing a quarter, dime, and nickel...");
			quarter.toss();
			dime.toss();
			nickel.toss();
			
			if (quarter.getSideUp().compareToIgnoreCase("heads") == 0) {
				totalAmount += 0.25;
				System.out.println("Quarter landed heads.");
			}
			if (dime.getSideUp().compareToIgnoreCase("heads") == 0) {
				totalAmount += 0.10;
				System.out.println("Dime landed heads.");
			}
			if (nickel.getSideUp().compareToIgnoreCase("heads") == 0) {
				totalAmount += 0.05;
				System.out.println("Nickel landed heads.");
			}
			
			System.out.printf("Total amount after round %d: $%.2f\n\n", round, totalAmount);
			round++;
		}
		
		if (totalAmount > 1.00)
			System.out.println("You lost.. you went over $1.00");
		else
			System.out.println("You won!! You landed on exactly $1.00");
	}
}
