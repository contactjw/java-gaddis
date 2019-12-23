package chapter11;

@SuppressWarnings("serial")
public class InvalidPayRate extends Exception{
	
	public InvalidPayRate() {
		super("Invalid Payrate Entered.");
	}
	
	public InvalidPayRate(double p) {
		super("Invalid Payrate Entered: $" + p);
	}

}
