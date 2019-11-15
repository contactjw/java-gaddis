package chapter2;

public class StockCommission {
	public static void main(String[] args) {
		final int SHARES_BOUGHT = 600;
		final double PRICE_PER_SHARE = 21.77;
		final double COMMISSION_RATE = 0.02;
		
		double totalCost;
		double commissionCost;
		
		totalCost = (SHARES_BOUGHT * PRICE_PER_SHARE);
		commissionCost = totalCost * COMMISSION_RATE;
		
		System.out.println("Stock Cost: $" + totalCost +
						   "\nCommission Cost: $" + commissionCost +
						   "\nTotal amount paid: $" + (totalCost + commissionCost));
	}
}
