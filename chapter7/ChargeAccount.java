package chapter7;

// Example of checking account numbers from an array.

public class ChargeAccount {
	private int[] accounts = { 5658845, 4520125, 7895122, 8777541, 8451277, 1302850,
							   8080152, 4562555, 5552012, 5050552, 7825877, 1250255,
							   1005231, 6545231, 3852085, 7576651, 7881200, 4581002 };
	
	
	public boolean checkAccount(int acc) {
		boolean valid = false;
		for (int i = 0; i < accounts.length; i++) {
			if (acc == accounts[i])
				valid = true;
		}
		
		return valid;
	}
}
