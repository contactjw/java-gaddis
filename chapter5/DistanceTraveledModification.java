package chapter5;
import java.util.Scanner;

public class DistanceTraveledModification {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int speed,
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
			System.out.println("\t" + i + "\t\t\t" + distance(speed, i));
		}
		
		keyboard.close();
	}
	
	public static double distance(double speed, double time) {
		return speed * time;
	}
}
