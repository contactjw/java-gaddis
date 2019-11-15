package chapter2;
import java.util.Scanner;

public class IngredientAdjuster {
	public static void main(String[] args) {
		double cupsOfSugar = 1.5,
			   cupsOfButter = 1.0,
			   cupsOfFlour = 2.75;
		int cookiesMade = 48,
			cookiesWanted;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("How many cookies do you want to make: ");
		cookiesWanted = keyboard.nextInt();
		
		cupsOfSugar /= cookiesMade;
		cupsOfButter /= cookiesMade;
		cupsOfFlour /= cookiesMade;
		
		System.out.println("Cookies Wanted: " + cookiesWanted +
						   "\nCups of Sugar Needed: " + (cupsOfSugar * cookiesWanted) +
						   "\nCups of Butter Needed: " + (cupsOfButter * cookiesWanted) +
						   "\nCups of Flour Needed: " + (cupsOfFlour * cookiesWanted));
		
		keyboard.close();
	}
}
