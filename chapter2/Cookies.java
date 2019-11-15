package chapter2;
import java.util.Scanner;

public class Cookies {
	public static void main(String[] args) {
		final int COOKIES_IN_BAG = 40;
		final int SERVINGS_IN_BAG = 10;
		final int SERVING_CALORIES = 300;
		double cookiesEaten, calsPerCookie;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the number of cookies you ate: ");
		cookiesEaten = keyboard.nextDouble();
		
		calsPerCookie = (SERVING_CALORIES) / (((double)COOKIES_IN_BAG / SERVINGS_IN_BAG));
		
		System.out.println("Number of cookies eaten: " + cookiesEaten);
		System.out.println("Total calories consumed: " + (cookiesEaten * calsPerCookie));
		
		keyboard.close();
	}
}
