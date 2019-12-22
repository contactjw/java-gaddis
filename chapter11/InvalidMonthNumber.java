package chapter11;

@SuppressWarnings("serial")
public class InvalidMonthNumber extends Exception{
	
	public InvalidMonthNumber() {
		super("Error: Invalid Month Number.");
	}
	
	public InvalidMonthNumber(int m) {
		super("Error: Invalid Month Number: " + m);
	}

}
