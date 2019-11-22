package chapter4;
import java.util.Scanner;

public class AverageRainfall {
	public static void main(String[] args) {
		int numYears;
		double rainfall,
			   totalRainfall = 0.0;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the number of years to get rainfall for: ");
		numYears = keyboard.nextInt();
		
		while (numYears < 1) {
			System.out.print("Number of years must be greater than 0: ");
			numYears = keyboard.nextInt();
		}
		
		for (int i = 0; i < numYears; i++) {
			for (int j = 0; j < 12; j++) {
				System.out.print("Enter inches of rainfall for year " + (i + 1) +
								 " month " + (j + 1) + ": ");
				rainfall = keyboard.nextDouble();
				while (rainfall < 0.0) {
					System.out.print("Inches of rainfall cannot be negative: ");
					rainfall = keyboard.nextDouble();
				}
				totalRainfall += rainfall;
			}
		}
		
		int numMonths = numYears * 12;
		
		System.out.println("Number of months: " + (numYears * 12));
		System.out.printf("Total inches of rain: %.2f\n", totalRainfall);
		System.out.printf("Average rainfall each month: %.2f\n", (totalRainfall / numMonths));
		
		keyboard.close();
	}
}
