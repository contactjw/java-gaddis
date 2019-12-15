package chapter9;
import javax.swing.JOptionPane;

public class CheckWriter {
	public static void main(String[] args) {
		String input;
		String date;
		String name;
		double amount;
		
		date = JOptionPane.showInputDialog("Enter today's date (11/24/2014)");
		name = JOptionPane.showInputDialog("To whom will the check go?");
		input = JOptionPane.showInputDialog("Enter the amount of the check");
		amount = Double.parseDouble(input);
		
		displayCheck(date, name, amount);
		
	}
	
	public static void displayCheck(String date, String name, double amount) {
		System.out.println("\t\t\t\t\t\tDate: " + date);
		System.out.println("Pay to the Order of:\t" + name + "\t\t\t$" + amount);
		System.out.println();
		System.out.println("One thousand nine hundred twenty and 85 cents");
	}

}
