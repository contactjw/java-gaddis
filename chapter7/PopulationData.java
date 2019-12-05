package chapter7;
import java.io.*;
import java.util.Scanner;

public class PopulationData {

	public static void main(String[] args) throws IOException{
		final int START_YEAR = 1950;
		final int END_YEAR = 1990;
		final int SIZE = END_YEAR - START_YEAR + 1;
		int[] populations = new int[SIZE];
		double average = 0.0;
		int largestYear;
		int smallestYear;
		
		loadData(populations);
		average = getAverage(populations);
		largestYear = getLargestIncrease(populations) + START_YEAR;
		smallestYear = getSmallestIncrease(populations) + START_YEAR;
		
		System.out.printf("Average yearly population increase: %,.2f\n", average);
		System.out.printf("Largest increase occured in %d\n", largestYear);
		System.out.printf("Smallest increase occured in %d\n", smallestYear);
		
	}
	
	public static void loadData(int[] pop) throws IOException {
		File inputFile = new File("USPopulation.txt");
		Scanner input = new Scanner(inputFile);
		
		for (int i = 0; i < pop.length; i++) {
			pop[i] = input.nextInt();
		}
		
		input.close();
	}
	
	public static double getAverage(int[] pop) {
		double total = 0.0;
		
		for (int i = 0, j = 1; j < pop.length; i++, j++) {
			total += pop[j] - pop[i];
		}
		
		return (total / (double)pop.length);
	}
	
	public static int getLargestIncrease(int[] pop) {
		int largestIncrease = pop[1] - pop[0];
		int index = 0;
		
		for (int i = 0, j = 1; j < pop.length; i++, j++) {
			if ((pop[j] - pop[i]) > largestIncrease) {
				largestIncrease = pop[j] - pop[i];
				index = j;
			}
		}
		return index;
	}
	
	public static int getSmallestIncrease(int[] pop) {
		int smallestIncrease = pop[1] - pop[0];
		int index = 0;
		
		for (int i = 0, j = 1; j < pop.length; i++, j++) {
			if ((pop[j] - pop[i]) < smallestIncrease) {
				smallestIncrease = pop[j] - pop[i];
				index = j;
			}
		}
		return index;
	}
}
