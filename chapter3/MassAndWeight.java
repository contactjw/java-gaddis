package chapter3;
import java.util.Scanner;

public class MassAndWeight {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		double mass,
			   weight;
		
		System.out.print("Enter the objects mass in kilograms: ");
		mass = keyboard.nextDouble();
		
		weight = mass * 9.8;
		
		if (weight > 1000)
			System.out.println("The object is too heavy.");
		else if (weight < 10)
			System.out.println("The object is too light.");
		else
			System.out.println("That is an optimal weight of " + weight + " newtons.");
		
		keyboard.close();
	}

}
