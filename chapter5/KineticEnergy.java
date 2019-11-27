package chapter5;
import java.util.Scanner;

public class KineticEnergy {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		double mass,
			   velocity,
			   kEnergy;
		
		System.out.print("Enter the object's mass in kilograms: ");
		mass = keyboard.nextDouble();
		
		System.out.print("Enter the object's velocity in meters per second: ");
		velocity = keyboard.nextDouble();
		
		kEnergy = kineticEnergy(mass, velocity);
		
		System.out.printf("The object has a kinetic energy of %,.2f joules of kinetic energy.", kEnergy);
		
		keyboard.close();
	}
	
	public static double kineticEnergy(double mass, double velocity) {
		return (1/2.0) * mass * velocity * velocity;
	}
}
