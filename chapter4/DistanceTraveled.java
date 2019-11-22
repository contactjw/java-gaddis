package chapter4;
import java.util.Scanner;

public class DistanceTraveled {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int distance,
			speed,
			time;
		
		System.out.print("Enter the speed of the vehicle in mph: ");
		speed = keyboard.nextInt();
		
		while (speed < 0) {
			System.out.print("Speed cannot be negative: ");
			speed = keyboard.nextInt();
		}
		
		System.out.print("Enter number of hours vehicle has traveled: ");
		time = keyboard.nextInt();

		while (time < 1) {
			System.out.print("Enter a time greater than 0: ");
			time = keyboard.nextInt();
		}
		
		System.out.println("\n\tHour\t\tDistance Traveled");

		for (int i = 1; i <= time; i++) {
			distance = speed * i;
			System.out.println("\t" + i + "\t\t\t" + distance);
		}
		
		keyboard.close();
		
	}
}
