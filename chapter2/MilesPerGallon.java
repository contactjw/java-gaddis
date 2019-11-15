package chapter2;
import java.util.Scanner;

public class MilesPerGallon {
	public static void main(String[] args) {
		double milesDriven, gallonsOfGas, milesPerGallon;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the number of miles driven: ");
		milesDriven = keyboard.nextDouble();
		
		System.out.print("Enter the gallons of gas used: ");
		gallonsOfGas = keyboard.nextDouble();
		
		milesPerGallon = milesDriven / gallonsOfGas;
		
		System.out.println("Your car gets a total of " + milesPerGallon + " miles per gallon");
		
		keyboard.close();
	}
}
