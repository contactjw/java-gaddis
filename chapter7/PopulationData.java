package chapter7;
import java.util.Scanner;
import java.io.*;

public class PopulationData {
	public static void main(String[] args) throws IOException{
		
		int[] yearsPopulation = new int[41];
		double averageIncrease = 0.0;
		int lowestIncrease = 20000;
		int highestIncrease = -20000;
		int lowestIndexStart = -1;
		int lowestIndexEnd = -1;
		int highestIndexStart = -1;
		int highestIndexEnd = -1;
		
		File inputFile = new File("USPopulation.txt");
		Scanner input = new Scanner(inputFile);
		
		for (int i = 0; i < yearsPopulation.length; i++) {
			yearsPopulation[i] = input.nextInt();
		}
		
		for (int i = 0, j = 1; j < yearsPopulation.length; i++, j++) {
			lowestIncrease = yearsPopulation[0] + yearsPopulation[1];
			highestIncrease = yearsPopulation[0] + yearsPopulation[1];
			averageIncrease += (yearsPopulation[i] + yearsPopulation[j]);
			if (yearsPopulation[i] + yearsPopulation[j] < lowestIncrease) {
				lowestIncrease = yearsPopulation[i] + yearsPopulation[j];
				lowestIndexStart = i;
				lowestIndexEnd = j;
			}
			if (yearsPopulation[i] + yearsPopulation[j] > highestIncrease) {
				highestIncrease = yearsPopulation[i] + yearsPopulation[j];
				highestIndexStart = i;
				highestIndexEnd = j;
			}
		}
		
			
		averageIncrease /= (double)yearsPopulation.length;
		System.out.printf("Average increase in population from 1950 to 1990: %,.2f\n", averageIncrease);
		System.out.printf("Greatest increase in population from 1950 to 1990: %,d\n", highestIncrease);
		System.out.printf("Lowest increase in population from 1950 to 1990: %,d\n", lowestIncrease);

		
		
	}
}
