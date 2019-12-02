package chapter7;
import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;

// Example of checking account numbers from a file.

public class ChargeAccountFile {
	private ArrayList<Integer> accounts = new ArrayList<Integer>();
	
	private void populateAccounts() throws IOException{
		File inputFile = new File("accountCheck.txt");
		@SuppressWarnings("resource")
		Scanner input = new Scanner(inputFile);
		while (input.hasNext()) {
			accounts.add(input.nextInt());
		}
	}
	
	public boolean checkAccount(int acc) throws IOException{
		populateAccounts();
		boolean valid = false;
		for (int i = 0; i < accounts.size(); i++) {
			if (acc == accounts.get(i))
				valid = true;
		}
		
		return valid;
	}
}
