package chapter11;

@SuppressWarnings("serial")
public class InvalidMonthName extends Exception{
	
	public InvalidMonthName() {
		super("Error: Invalid Month Name.");
	}
	
	public InvalidMonthName(String n) {
		super("Error: Invalid Month Name: " + n);
	}
	
}
