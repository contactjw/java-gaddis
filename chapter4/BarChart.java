package chapter4;
import java.util.Scanner;

public class BarChart {
	public static void main(String[] args) {
		double store1,
			   store2,
			   store3,
			   store4,
			   store5;
		int numStars1,
			numStars2,
			numStars3,
			numStars4,
			numStars5;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter today's sales for store 1: ");
		store1 = keyboard.nextDouble();
		numStars1 = (int)store1 / 100;
		System.out.print("Enter today's sales for store 2: ");
		store2 = keyboard.nextDouble();
		numStars2 = (int)store2 / 100;
		System.out.print("Enter today's sales for store 3: ");
		store3 = keyboard.nextDouble();
		numStars3 = (int)store3 / 100;
		System.out.print("Enter today's sales for store 4: ");
		store4 = keyboard.nextDouble();
		numStars4 = (int)store4 / 100;
		System.out.print("Enter today's sales for store 5: ");
		store5 = keyboard.nextDouble();
		numStars5 = (int)store5 / 100;

		
		System.out.println("\nSALES BAR CHART");
		System.out.print("Store 1: ");
		for (int i = 1; i <= numStars1; i++)
			System.out.print("* ");
		System.out.println();
		System.out.print("Store 2: ");
		for (int i = 1; i <= numStars2; i++)
			System.out.print("* ");
		System.out.println();
		System.out.print("Store 3: ");
		for (int i = 1; i <= numStars3; i++)
			System.out.print("* ");
		System.out.println();
		System.out.print("Store 4: ");
		for (int i = 1; i <= numStars4; i++)
			System.out.print("* ");
		System.out.println();
		System.out.print("Store 5: ");
		for (int i = 1; i <= numStars5; i++)
			System.out.print("* ");
		System.out.println();
		
		keyboard.close();
	}
}
