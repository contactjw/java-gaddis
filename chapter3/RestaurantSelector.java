package chapter3;
import java.util.Scanner;

public class RestaurantSelector {
	public static void main(String[] args) {
		String vegetarian,
			   vegan,
			   glutenFree;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Is anyone in your party a vegetarian? ");
		vegetarian = keyboard.nextLine();
		
		System.out.print("Is anyone in your party a vegan? ");
		vegan = keyboard.nextLine();
		
		System.out.print("Is anyone in your party gluten-free? ");
		glutenFree = keyboard.nextLine();
		
		if (vegetarian.compareToIgnoreCase("no") == 0 &&
			vegan.compareToIgnoreCase("no") == 0 &&
			glutenFree.compareToIgnoreCase("no") == 0) {
				System.out.println("Here are your restaurant choices: ");
				System.out.println("   Joe's Gourmet Burgers");
				System.out.println("   Main Street Pizza Company");
				System.out.println("   Corner Cafe");
				System.out.println("   Mama's Fine Italian");
				System.out.println("   The Chef's Kitchen");
		}
		else if (vegetarian.compareToIgnoreCase("yes") == 0 &&
				vegan.compareToIgnoreCase("no") == 0 &&
				glutenFree.compareToIgnoreCase("yes") == 0) {
					System.out.println("Here are your restaurant choices: ");
					System.out.println("   Main Street Pizza Company");
					System.out.println("   Corner Cafe");
					System.out.println("   The Chef's Kitchen");
		}
		else if (vegetarian.compareToIgnoreCase("yes") == 0 &&
				vegan.compareToIgnoreCase("yes") == 0 &&
				glutenFree.compareToIgnoreCase("yes") == 0) {
					System.out.println("Here are your restaurant choices: ");
					System.out.println("   Corner Cafe");
					System.out.println("   The Chef's Kitchen");
		}
		else if (vegetarian.compareToIgnoreCase("yes") == 0 &&
				vegan.compareToIgnoreCase("no") == 0 &&
				glutenFree.compareToIgnoreCase("no") == 0) {
					System.out.println("Here are your restaurant choices: ");
					System.out.println("   Main Street Pizza Company");
					System.out.println("   Corner Cafe");
					System.out.println("   Mama's Fine Italian");
					System.out.println("   The Chef's Kitchen");
		}
		else if (vegetarian.compareToIgnoreCase("no") == 0 &&
				vegan.compareToIgnoreCase("no") == 0 &&
				glutenFree.compareToIgnoreCase("yes") == 0) {
					System.out.println("Here are your restaurant choices: ");
					System.out.println("   Main Street Pizza Company");
					System.out.println("   Corner Cafe");
					System.out.println("   The Chef's Kitchen");
		}
		else if (vegetarian.compareToIgnoreCase("no") == 0 &&
				vegan.compareToIgnoreCase("yes") == 0 &&
				glutenFree.compareToIgnoreCase("no") == 0) {
					System.out.println("Here are your restaurant choices: ");
					System.out.println("   Corner Cafe");
					System.out.println("   The Chef's Kitchen");
		}
		else if (vegetarian.compareToIgnoreCase("yes") == 0 &&
				vegan.compareToIgnoreCase("yes") == 0 &&
				glutenFree.compareToIgnoreCase("no") == 0) {
					System.out.println("Here are your restaurant choices: ");
					System.out.println("   Corner Cafe");
					System.out.println("   The Chef's Kitchen");
		}
		else if (vegetarian.compareToIgnoreCase("no") == 0 &&
				vegan.compareToIgnoreCase("yes") == 0 &&
				glutenFree.compareToIgnoreCase("yes") == 0) {
					System.out.println("Here are your restaurant choices: ");
					System.out.println("   Corner Cafe");
					System.out.println("   The Chef's Kitchen");
		}
		
		
		keyboard.close();
	}
}
