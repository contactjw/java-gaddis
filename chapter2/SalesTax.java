package chapter2;
import java.util.Scanner;

public class SalesTax {
	public static void main(String[] args) {
		final double STATE_TAX = 0.04;
		final double COUNTY_TAX = 0.02;
		double purchase, totalState, totalCounty, totalTax, totalPurchase;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the amount of the purchase: ");
		purchase = keyboard.nextDouble();
		
		totalState = purchase * STATE_TAX;
		totalCounty = purchase * COUNTY_TAX;
		totalTax = totalState + totalCounty;
		totalPurchase = totalTax + purchase;
		
		System.out.println("Purchase price: $" + purchase);
		System.out.println("State Tax: $" + totalState);
		System.out.println("County Tax: $" + totalCounty);
		System.out.println("Total Taxes: $" + totalTax);
		System.out.println("Total price of purchase: $" + totalPurchase);
		
		keyboard.close();
	}
}
