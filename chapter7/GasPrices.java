package chapter7;
import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class GasPrices {
	public static void main(String[] args) throws IOException{
		ArrayList<Double> gasPrices = new ArrayList<Double>();
		
		File inputFile = new File("1994_Weekly_Gas_Averages.txt");
		Scanner input = new Scanner(inputFile);
		
		// populate the ArrayList
		while (input.hasNext())
			gasPrices.add(input.nextDouble());
		
		getLowest(gasPrices);
		getHighest(gasPrices);
		getAverage(gasPrices);
		
		input.close();
	}
	
	public static void getLowest(ArrayList<Double> a) {
		double lowest = a.get(0);
		int lowestWeek = 1;
		String month = "";
		for (int i = 0; i < a.size(); i++) {
			if (a.get(i) < lowest) {
				lowest = a.get(i);
				lowestWeek = i;
			}
		}
		
		month = getMonth(lowestWeek);
		
		System.out.printf("The lowest gas price was: $%.3f\n", lowest);
		System.out.println("Occurring at week #" + lowestWeek);
		System.out.println("In " + month);
		System.out.println();
	}
	
	public static void getHighest(ArrayList<Double> a) {
		double highest = a.get(0);
		int highestWeek = 1;
		String month = "";
		for (int i = 0; i < a.size(); i++) {
			if (a.get(i) > highest) {
				highest = a.get(i);
				highestWeek = i;
			}
		}
		
		month = getMonth(highestWeek);
		
		System.out.printf("The highest gas price was: $%.3f\n", highest);
		System.out.println("Occurring at week #" + highestWeek);
		System.out.println("In " + month);
		System.out.println();
	}
	
	public static void getAverage(ArrayList<Double> a) {
		double average = 0.0;
		String month = "";
		for (int i = 1; i <= a.size(); i++) {
			average += a.get((i - 1));
			if (i % 4 == 0) {
				average /= 4.0;
				month = getMonth(i);
				System.out.print("The average gas price for " + month + " was ");
				System.out.printf("%.3f\n", average);
				average = 0.0;
			}

		}
	}

	private static String getMonth(int week) {
		String m = "";
		if (week <= 4)
			m = "January";
		else if (week <= 8)
			m = "February";
		else if (week <= 12)
			m = "March";
		else if (week <= 16)
			m = "April";
		else if (week <= 20)
			m = "May";
		else if (week <= 24)
			m = "June";
		else if (week <= 28)
			m = "July";
		else if (week <= 32)
			m = "August";
		else if (week <= 36)
			m = "September";
		else if (week <= 40)
			m = "October";
		else if (week <= 44)
			m = "November";
		else if (week <= 48)
			m = "December";
		else
			m = "December";
		
		return m;
	}
}
