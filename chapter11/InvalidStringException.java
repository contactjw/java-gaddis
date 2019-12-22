package chapter11;

@SuppressWarnings("serial")
public class InvalidStringException extends Exception{

	public InvalidStringException() {
		super("Error: Empty String.");
	}
	
}
