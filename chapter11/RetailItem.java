package chapter11;

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

	public void setDescription(String d) {
		description = d;
	}

	public void setUnits(int u) throws NegativeUnits{
		if (u < 0)
			throw new NegativeUnits(u);
		unitsOnHand = u;
	}

	public void setPrice(double p) throws NegativePrice{
		if (p < 0)
			throw new NegativePrice(p);
		price = p;
	}

	public String getDescription() {
		return description;
	}

	public int getUnits() {
		return unitsOnHand;
	}

	public double getPrice() {
		return price;
	}
}