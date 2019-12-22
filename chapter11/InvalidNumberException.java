package chapter11;

@SuppressWarnings("serial")
public class InvalidNumberException extends Exception{

	public InvalidNumberException() {
		super("Error: Invalid Number.");
	}
	
	public InvalidNumberException(int num) {
		super("Error: Invalid Number: " + num);
	}
	
	public InvalidNumberException(double num) {
		super("Error: Invalid Number: " + num);
	}
}
