package chapter6;
import java.util.Scanner;

public class CircleDemo {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		double radius;
		
		System.out.print("Enter the radius of the circle: ");
		radius = keyboard.nextDouble();
		
		Circle myCircle = new Circle(radius);
		
		System.out.println("Circle Information");
		System.out.printf("Circle's Area: %.2f\n", myCircle.getArea());
		System.out.printf("Circles Diameter: %.2f\n", myCircle.getDiameter());
		System.out.printf("Circle's Circumference: %.2f\n", myCircle.getCircumference());
		
		keyboard.close();
	}
}
