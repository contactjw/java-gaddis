package chapter11;

@SuppressWarnings("serial")
public class NegativeUnits extends Exception{
	
	public NegativeUnits() {
		super("Error: Negative number of units on hand entered.");
	}
	
	public NegativeUnits(int u) {
		super("Error: Negative number of " + u + " units was entered.");
	}
}
