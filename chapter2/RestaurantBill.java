package chapter2;
import javax.swing.JOptionPane;

public class RestaurantBill {
	public static void main(String[] args) {
		final double TAX = 0.0675;
		final double TIP = 0.20;
		double mealPrice, totalBill, totalTax, totalTip;
		String input;
		
		input = JOptionPane.showInputDialog("Enter the price of the bill: $");
		mealPrice = Double.parseDouble(input);
		
		totalTax = mealPrice * TAX;
		totalTip = (totalTax + mealPrice) * TIP;
		totalBill = mealPrice + totalTax + totalTip;
		
		JOptionPane.showMessageDialog(null, "Meal Price: $" + mealPrice +
											"\nTax Amount: $" + totalTax +
											"\nTip Amount: $" + totalTip +
											"\nTotal Meal Charge: $" + totalBill);
		
		System.exit(0);
	}
}
