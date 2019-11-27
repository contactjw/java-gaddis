package chapter5;
import javax.swing.JOptionPane;

public class IsPrimeMethod {
	public static void main(String[] args) {
		String input;
		int value;
		
		input = JOptionPane.showInputDialog("Enter a number to check if it's prime.");
		value = Integer.parseInt(input);
		
		if (isPrime(value)) {
			JOptionPane.showMessageDialog(null, value + " is a prime number.");
		}
		else {
			JOptionPane.showMessageDialog(null, value + " is not a prime number.");
		}
		
		System.exit(0);
	}
	
	public static boolean isPrime(int number) {
		boolean isPrime = true;
		
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime = false;
				return isPrime;
			}
			else
				isPrime = true;
		}
		
		return isPrime;
	}
}
