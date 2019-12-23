package chapter11;

@SuppressWarnings("serial")
public class InvalidEmployeeNumber extends Exception{

	public InvalidEmployeeNumber() {
		super("Invalid Employee Number Entered.");
	}
	
}
