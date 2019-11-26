package chapter5;
import javax.swing.JOptionPane;

public class PaintJobEstimator {
	public static void main(String[] args) {
		double squareFeet = 0.0,
			   pricePerGallon;
		int numRooms;
		String input;
		
		input = JOptionPane.showInputDialog("Enter the number of rooms to be painted: ");
		numRooms = Integer.parseInt(input);
		
		input = JOptionPane.showInputDialog("Enter the cost of paint per gallon: ");
		pricePerGallon = Double.parseDouble(input);
		
		for (int i = 1; i <= numRooms; i++) {
			input = JOptionPane.showInputDialog("Enter the square feet of wall space in room " + i + ": ");
			squareFeet += Double.parseDouble(input);
		}
				
		int gallons = getNumGallons(squareFeet);
		int hours = getLaborHours(squareFeet);
		double totalPaintCost = getPaintCost(pricePerGallon, gallons);
		double laborCost = getLaborCharges(hours);
		double totalCost = getTotalCost(totalPaintCost, laborCost);
		
		JOptionPane.showMessageDialog(null, "The total cost of the job is $" + totalCost);
	}
	
	public static int getNumGallons(double squareFeet) {
		int gallons = (int)(squareFeet / 115);
		return gallons;
	}
	
	public static int getLaborHours(double squareFeet) {
		int hours = ((int)(squareFeet / 115)) * 8;
		return hours;
	}
	
	public static double getPaintCost(double price, int numGallons) {
		return price * numGallons;
	}
	
	public static double getLaborCharges(double numHours) {
		return 18.00 * numHours;
	}
	
	public static double getTotalCost(double totalPaint, double totalLabor) {
		return totalPaint + totalLabor;
	}
}
