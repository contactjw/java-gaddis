package chapter5;
import javax.swing.JOptionPane;

public class RetailPriceCalculator {
	public static void main(String[] args) {
		double wholeSale,
			   markupPercent;
		String input;
		
		input = JOptionPane.showInputDialog("Enter the whole sale value of the item.");
		wholeSale = Double.parseDouble(input);
		
		input = JOptionPane.showInputDialog("Enter the markup percentage (50% = 0.50).");
		markupPercent = Double.parseDouble(input);
		
		JOptionPane.showMessageDialog(null, "The retail value of the item is: $" +
									  calculateRetail(wholeSale, markupPercent));
		
		System.exit(0);	
	}
	
	public static double calculateRetail(double wholeSale, double markup) {
		double total = wholeSale + (wholeSale * markup);
		return total;
	}
}
