package chapter3;
import java.util.Scanner;

public class SpeedOfSound {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		String medium;
		double distance,
			   time = 0.0;
		
		System.out.print("Enter the medium the sound wave will travel " +
						 "the sound wave will travel through (air, water, steel): ");
		medium = keyboard.nextLine();
		
		System.out.print("Enter the distance to travel: ");
		distance = keyboard.nextDouble();
	
		if (medium.compareToIgnoreCase("air") == 0)
			time = distance/1100;
		else if (medium.compareToIgnoreCase("water") == 0)
			time = distance/4900;
		else if (medium.compareToIgnoreCase("steel") == 0)
			time = distance/16400;
		
		if (time != 0)
			System.out.printf("It takes %.2f seconds for a sound wave to travel " +
						   	   "through %s", time, medium);
		else
			System.out.println("Rerun program and enter a proper medium.");
		
		keyboard.close();
	}
}
