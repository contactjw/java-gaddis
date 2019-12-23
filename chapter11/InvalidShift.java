package chapter11;

@SuppressWarnings("serial")
public class InvalidShift extends Exception{
	
	public InvalidShift() {
		super("Invalid Shift Entered.");
	}
	
	public InvalidShift(int s) {
		super("Invalid Shift Entered " + s);
	}
}
