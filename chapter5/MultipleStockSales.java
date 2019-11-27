package chapter5;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class MultipleStockSales {
	public static void main(String[] args) {
		String input;
		int numShares,
			stockSales;
		double pricePerShare,
			   purchaseCommission,
			   sellPricePerShare,
			   saleCommission,
			   totalMade = 0.0;
		
		input = JOptionPane.showInputDialog("Enter the number of stock sales.");
		stockSales = Integer.parseInt(input);
		
		for (int i = 1; i <= stockSales; i++) {
			input = JOptionPane.showInputDialog("Enter the number of shares bought for trade " + i);
			numShares = Integer.parseInt(input);
			
			input = JOptionPane.showInputDialog("Enter the price per share for trade " + i);
			pricePerShare = Double.parseDouble(input);
			
			input = JOptionPane.showInputDialog("Enter the purchase commission paid for trade " + i);
			purchaseCommission = Double.parseDouble(input);
			
			input = JOptionPane.showInputDialog("Enter the sell price per share for trade " + i);
			sellPricePerShare = Double.parseDouble(input);
			
			input = JOptionPane.showInputDialog("Enter the selling commission paid for trade " + i);
			saleCommission = Double.parseDouble(input);
			
			totalMade += calcProfit(numShares, pricePerShare, purchaseCommission,
						 sellPricePerShare, saleCommission);
		}
		
		DecimalFormat format = new DecimalFormat("#,##0.00");
		
		if(totalMade > 0)
			JOptionPane.showMessageDialog(null, "You made $" + format.format(totalMade));
		else
			JOptionPane.showMessageDialog(null, "You lost $" + format.format(totalMade));
		
		System.exit(0);

	}
	
	public static double calcProfit(int shares, double buyPrice, double buyCommission, double sellPrice,
								  double saleCommission) {
		double profit = ((shares * sellPrice) - saleCommission) - ((shares * buyPrice) + buyCommission);
		
		return profit;
	}
}
