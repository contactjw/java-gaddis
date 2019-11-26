package chapter5;
import java.util.Scanner;

public class ConversionProgram {
	public static void main(String[] args) {
		int choice;
		double meters;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter a distance in meters: ");
		meters = keyboard.nextDouble();
		while (meters < 0) {
			System.out.print("Meters cannot be negative, enter again: ");
			meters = keyboard.nextDouble();
		}
		
		do {
			menu();
			System.out.print("Enter your choice: ");
			choice = keyboard.nextInt();
			while (choice < 1 || choice > 4) {
				System.out.print("Enter a choice in the range of 1-4: ");
				choice = keyboard.nextInt();
			}
			switch(choice) {
				case 1:
					showKilometers(meters);
					break;
				case 2:
					showInches(meters);
					break;
				case 3:
					showFeet(meters);
					break;
			}
		} while (choice != 4);
		
		keyboard.close();
	}
	
	public static void menu() {
		System.out.println("1. Convert to kilometers");
		System.out.println("2. Convert to inches");
		System.out.println("3. Convert to feet");
		System.out.println("4. Quit the program\n");
	}
	
	public static void showKilometers(double meters) {
		double kilometers = meters * 0.001;
		System.out.printf("%.2f meters = %.2f kilometers\n\n", meters, kilometers);
	}
	
	public static void showInches(double meters) {
		double inches = meters * 39.37;
		System.out.printf("%.2f meters = %.2f inches\n\n", meters, inches);
	}
	
	public static void showFeet(double meters) {
		double feet = meters * 3.281;
		System.out.printf("%.2f meters = %.2f feet\n\n", meters, feet);
	}
}
