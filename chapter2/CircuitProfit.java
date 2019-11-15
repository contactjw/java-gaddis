package chapter2;
import javax.swing.JOptionPane;

public class CircuitProfit {
	public static void main(String[] args) {
		final double PERC_PROFIT = 0.40;
		double totalProfit, retailPrice;
		String input;
		
		input = JOptionPane.showInputDialog("Enter the retail price of the circuit board: ");
		retailPrice = Double.parseDouble(input);
		
		totalProfit = retailPrice * PERC_PROFIT;
		
		JOptionPane.showMessageDialog(null, "Amount paid for board: $" + retailPrice +
										    "\nPercent Profit: " + PERC_PROFIT + 
										    "\nProfit Earned: $" + totalProfit);
		System.exit(0);		
	}
}
