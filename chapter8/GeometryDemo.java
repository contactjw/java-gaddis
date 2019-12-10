package chapter8;
import java.util.Scanner;

public class GeometryDemo {
	public static void main(String[] args) {
		int choice;
		Scanner keyboard = new Scanner(System.in);
		
		do {
			showMenu();
			System.out.print("Enter your choice (1-4): ");
			choice = keyboard.nextInt();
			while (choice < 1 || choice > 4) {
				System.out.print("Enter a valid choice (1-4): ");
				choice = keyboard.nextInt();
			}
			validateChoice(choice);
		} while (choice != 4);
		
		keyboard.close();
	}
	
	public static void showMenu() {
		System.out.println("Gemoetry Calculator");
		System.out.println("1. Calculate the Area of a Circle");
		System.out.println("2. Calculate the Area of a Rectangle");
		System.out.println("3. Calculate the Area of a Triangle");
		System.out.println("4. Quit");
		System.out.println();
	}
	
	public static void validateChoice(int c) {
		Scanner keyboard = new Scanner(System.in);
		
		if (c == 1) {
			double radius, area = 0.0;
			System.out.print("\nEnter the radius of the circle: ");
			radius = keyboard.nextDouble();
			while (radius < 0.0) {
				System.out.print("Radius cannot be negative: ");
				radius = keyboard.nextDouble();
			}
			area = Geometry.getAreaCircle(radius);
			System.out.printf("\nThe area of the circle with a radius of %.2f = %.2f\n\n", radius, area);
		}
		else if (c == 2) {
			double length, width, area = 0.0;
			System.out.print("\nEnter the length of the rectangle: ");
			length = keyboard.nextDouble();
			while (length < 0.0) {
				System.out.print("Length cannot be negative: ");
				length = keyboard.nextDouble();
			}
			System.out.print("\nEnter the width of the rectangle: ");
			width = keyboard.nextDouble();
			while (width < 0.0) {
				System.out.print("Width cannot be negative: ");
				width = keyboard.nextDouble();
			}
			area = Geometry.getAreaRectangle(length, width);
			System.out.printf("\nThe area of the rectangle with a length of %.2f and width " +
						      "of %.2f = %.2f\n\n", length, width, area);
		}
		else if (c == 3) {
			double base, height, area = 0.0;
			System.out.print("\nEnter the base of the triangle: ");
			base = keyboard.nextDouble();
			while (base < 0.0) {
				System.out.print("Base cannot be negative: ");
				base = keyboard.nextDouble();
			}
			System.out.print("\nEnter the height of the triangle: ");
			height = keyboard.nextDouble();
			while (height < 0.0) {
				System.out.print("Height cannot be negative: ");
				height = keyboard.nextDouble();
			}
			area = Geometry.getAreaRectangle(base, height);
			System.out.printf("\nThe area of the triangle with a base of %.2f and height " +
						      "of %.2f = %.2f\n\n", base, height, area);
		}
		else {
			System.out.println("\nProgram exiting.  Goodbye!");
		}
	}
		
}
