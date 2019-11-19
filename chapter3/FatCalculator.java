package chapter3;
import java.util.Scanner;

public class FatCalculator {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		double calories,
			   fatGrams,
			   calsFromFat,
			   percentFat;
		
		System.out.print("Enter the number of calories in food item: ");
		calories = keyboard.nextDouble();
		
		System.out.print("Enter the number of grams of fat in food item: ");
		fatGrams = keyboard.nextDouble();
		
		calsFromFat = fatGrams * 9;
		
		percentFat = calsFromFat / calories;
		
		if (calsFromFat > calories) {
			System.out.println("Calories from fat cannot be greater than total calories.");
		}
		else if (calsFromFat < (calories * .70)) {
			System.out.println("Food is low in fat with " + calsFromFat +
							   " calories from fat, which is " + (percentFat * 100) + "% fat.");
		}
		else {
			System.out.println("The food is not low in fat calories.");
		}
		
		keyboard.close();
	}
}
