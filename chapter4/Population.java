package chapter4;
import java.util.Scanner;

public class Population {
	public static void main(String[] args) {
		int numDays;
		double dailyIncrease,
			   startPopulation;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the starting population: ");
		startPopulation = keyboard.nextDouble();
		
		while (startPopulation < 2) {
			System.out.print("Starting population cannot be less than 2: ");
			startPopulation = keyboard.nextDouble();
		}
		
		System.out.print("Enter the daily population increase as a percent (50% = 0.5): ");
		dailyIncrease = keyboard.nextDouble();
		
		while (dailyIncrease < 0) {
			System.out.print("Daily population increase cannot be negative: ");
			dailyIncrease = keyboard.nextDouble();
		}
		
		System.out.print("Enter the number of days the organisms will multiply for: ");
		numDays = keyboard.nextInt();
		
		while (numDays < 1) {
			System.out.print("Number of days cannot be less than 1: ");
			numDays = keyboard.nextInt();
		}
		
		System.out.println("Day\t\tPopulation");
		for (int i = 0; i < numDays; i++) {
			System.out.println((i + 1) + "\t\t" + startPopulation);
			startPopulation += (startPopulation * dailyIncrease);
		}
		
		keyboard.close();
		
	}
}
