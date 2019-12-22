package chapter11;

@SuppressWarnings("serial")
public class NegativePrice extends Exception{

	public NegativePrice() {
		super("Error: The price entered was negative.");
	}
	
	public NegativePrice(double price) {
		super("Error: Negative price of $" + price + " was entered.");
	}
}
