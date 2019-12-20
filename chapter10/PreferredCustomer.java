package chapter10;

public class PreferredCustomer extends Customer{
	private double purchaseTotal;
	private double discountLevel;
	private double priceAfterDiscount;
	
	public PreferredCustomer() {
		purchaseTotal = 0.0;
		discountLevel = 0.0;
		priceAfterDiscount = 0.0;
	}
	
	public PreferredCustomer(double total) {
		purchaseTotal = total;
		discountLevel = calculateDiscount(purchaseTotal);
		priceAfterDiscount = purchaseTotal - (purchaseTotal * discountLevel);
	}
	
	public PreferredCustomer(String n, String a, String p, String num, boolean list, double total) {
		super(n, a, p, num, list);
		purchaseTotal = total;
		discountLevel = calculateDiscount(purchaseTotal);
		priceAfterDiscount = purchaseTotal - (purchaseTotal * discountLevel);

	}
	
	public void setPurchaseTotal(double total) {
		purchaseTotal = total;
		discountLevel = calculateDiscount(purchaseTotal);
	}
	
	public double getPurchaseTotal() {
		return purchaseTotal;
	}
	
	public double getDiscountLevel() {
		return discountLevel;
	}
	
	public double getPriceAfterDiscount() {
		return priceAfterDiscount;
	}
	
	public String toString() {
		String info = super.toString() + String.format("\nPurchase Total: $%,.2f \nDiscount Level: %.2f \nPrice after discount: $%,.2f", 
														purchaseTotal, (discountLevel * 100.0), priceAfterDiscount);
		
		return info;
	}
	
	private double calculateDiscount(double total) {
		double disc = 0.0;
		
		if (total >= 2000)
			disc = 0.10;
		else if (total >= 1500)
			disc = 0.07;
		else if (total >= 1000)
			disc = 0.06;
		else if (total >= 500)
			disc = 0.05;
		else
			disc = 0.0;
		
		return disc;
	}
}
