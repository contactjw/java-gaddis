package chapter2;
import java.util.Scanner;

public class Grapevines {
	public static void main(String[] args) {
		double rowLength,
			   postSpace,
			   spaceBetweenVines,
			   totalVines;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the length of the row in feet: ");
		rowLength = keyboard.nextDouble();
		
		System.out.print("Enter the space in feet used by an end-post assembly: ");
		postSpace = keyboard.nextDouble();
		
		System.out.print("Enter the space between vines in feet: ");
		spaceBetweenVines = keyboard.nextDouble();
		
		totalVines = (rowLength - 2 * postSpace) / spaceBetweenVines;
		
		System.out.println("You can plant " + totalVines + " grapevines per row.");
		
		keyboard.close();
	}
}
