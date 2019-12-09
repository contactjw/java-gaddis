package chapter8;

public class CashRegister {
	
	private int quantity;
	private RetailItem item;
	
	public CashRegister(RetailItem r, int quant) {
		item = new RetailItem(r);
		quantity = quant;
	}
	
	public double getSubtotal() {
		return item.getPrice() * (double)quantity;
	}
	
	public double getTax() {
		return (getSubtotal() * 0.06);
	}
	
	public double getTotal() {
		return ((getSubtotal() + getTax()));
	}

}
