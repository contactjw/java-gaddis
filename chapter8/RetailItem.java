package chapter8;

public class RetailItem {
	
	private String description;
	private int unitsOnHand;
	private double price;
	
	public RetailItem() {
		description = "";
		unitsOnHand = 0;
		price = 0.0;
	}
	
	public RetailItem(String d, int u, double p) {
		description = d;
		unitsOnHand = u;
		price = p;
	}
	
	public RetailItem(RetailItem r) {
		this.description = r.description;
		this.unitsOnHand = r.unitsOnHand;
		this.price = r.price;
	}
	
	public void setDescription(String d) {
		description = d;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setUnits(int u) {
		unitsOnHand = u;
	}
	
	public int getUnits() {
		return unitsOnHand;
	}
	
	public void setPrice(double p) {
		price = p;
	}
	
	public double getPrice() {
		return price;
	}
}
