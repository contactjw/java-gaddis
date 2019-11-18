package chapter3;
import java.util.Scanner;

public class ShippingCharges {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int numberOfMiles;
		double weight,
			   shippingCharge,
			   totalCost;
		
		System.out.print("Enter the weight of the package: ");
		weight = keyboard.nextDouble();
		
		if (weight <= 2.0)
			shippingCharge = 1.10;
		else if (weight <= 6)
			shippingCharge = 2.20;
		else if (weight <= 10)
			shippingCharge = 3.70;
		else
			shippingCharge = 3.80;
		
		System.out.print("Enter the number of miles to send the package: ");
		numberOfMiles = keyboard.nextInt();
		
		totalCost = (int)(numberOfMiles / 500) * shippingCharge;
		
		System.out.println("Weight of Package: " + weight);
		System.out.println("Number of Miles: " + numberOfMiles);
		System.out.println("Shipping Charge Per 500 Miles: $" + shippingCharge);
		System.out.printf("Total Cost: $%.2f", totalCost);
		
		keyboard.close();
	}
}
