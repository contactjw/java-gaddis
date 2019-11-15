package chapter2;

public class EnergyDrinks {
	public static void main(String[] args) {
		final int TOTAL_CUSTOMERS = 12467;
		final double PURCHASE_ENERGY = 0.14;
		final double PREFER_CITRUS = 0.64;
		
		System.out.println("Total customers who purchase energy drinks: " +
							(TOTAL_CUSTOMERS * PURCHASE_ENERGY) + 
							"\nTotal customers who prefer citrus energy: " +
							(TOTAL_CUSTOMERS * PURCHASE_ENERGY * PREFER_CITRUS));
		
	}
}
