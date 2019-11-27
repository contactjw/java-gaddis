package chapter5;
import javax.swing.JOptionPane;

public class StockProfit {
	public static void main(String[] args) {
		String input;
		int numShares;
		double pricePerShare,
			   purchaseCommission,
			   sellPricePerShare,
			   saleCommission;
		
		input = JOptionPane.showInputDialog("Enter the number of shares bought.");
		numShares = Integer.parseInt(input);
		
		input = JOptionPane.showInputDialog("Enter the price per share.");
		pricePerShare = Double.parseDouble(input);
		
		input = JOptionPane.showInputDialog("Enter the purchase commission paid.");
		purchaseCommission = Double.parseDouble(input);
		
		input = JOptionPane.showInputDialog("Enter the sell price per share.");
		sellPricePerShare = Double.parseDouble(input);
		
		input = JOptionPane.showInputDialog("Enter the selling commission paid.");
		saleCommission = Double.parseDouble(input);
		
		calcProfit(numShares, pricePerShare, purchaseCommission, sellPricePerShare, saleCommission);
	}
	
	public static void calcProfit(int shares, double buyPrice, double buyCommission, double sellPrice,
								  double saleCommission) {
		double profit = ((shares * sellPrice) - saleCommission) - ((shares * buyPrice) + buyCommission);
		
		if (profit > 0)
			JOptionPane.showMessageDialog(null, "You made $" + profit);
		else
			JOptionPane.showMessageDialog(null, "You lost $" + profit);
	}
}
