package chapter8;
import java.util.Scanner;

public class LandTractDemo {

	public static void main(String[] args) {
		double length,
			   width;
		
		Scanner keyboard = new Scanner(System.in);
		LandTract tract1 = new LandTract(10.5, 11.5);
		LandTract tract2 = new LandTract();
		
		System.out.print("Enter the length of tract 2: ");
		length = keyboard.nextDouble();
		System.out.print("Enter the width of tract 2: ");
		width = keyboard.nextDouble();
		
		tract2.setLength(length);
		tract2.setWidth(width);
		
		System.out.printf("Tract1 Area: %.2f\n", tract1.getArea());
		System.out.printf("Tract2 Area: %.2f\n", tract2.getArea());
		
		if (tract1.equals(tract2))
			System.out.println("The tracts of land ARE equal.");
		else
			System.out.println("The tracts of land are NOT equal.");
		
		keyboard.close();
	}

}
