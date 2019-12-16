package chapter9;
import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class SalesAnalysis {
	public static void main(String[] args) throws IOException{
		ArrayList<String> stringList = new ArrayList<>();
		String week;
		
		File file = new File("SalesData.txt");
		Scanner input = new Scanner(file);
		
		while (input.hasNext()) {
			week = input.nextLine();
			stringList.add(week);
		}
		
		processWeeks(stringList);
		
		input.close();
		
	}
	
	public static void processWeeks(ArrayList<String> weekList) {
		double totalAll = 0.0;

		// Create an ArrayList of the total values of each week.
		ArrayList<Double> weekTotals = new ArrayList<>();
		
		// Process information for weeks
		for (int weeks = 0; weeks < weekList.size(); weeks++) {
			
			double total = 0.0;
			
			// split the week values using , delimiter
			String[] tokens = weekList.get(weeks).split(",");
			
			for (int i = 0; i < tokens.length; i++) {
				
				// add the total of each double.
				total += Double.parseDouble(tokens[i]);
			}
			
			// Add total into the totals ArrayList
			weekTotals.add(total);
			
			// Get a running total of all weeks totals
			totalAll += total;
			
			// Display current weeks total
			System.out.printf("Week %d total sales:           $%,.2f\n", (weeks + 1), total);
			System.out.printf("Week %d average sales per day: $%,.2f\n", (weeks + 1), (total / tokens.length));
			System.out.println();
		}
		
		// Display total and average for all weeks
		System.out.printf("\nTotal sales for all weeks: $%,.2f", totalAll);
		System.out.printf("\nAverage sales for all weeks: $%.2f\n", (totalAll / (weekList.size() * 7.0)));
		
		// Set index value of highest and lowest weeks starting at first arrayposition
		int highestWeek = 0,
		    lowestWeek = 0;
		
		// Process highest and lowest index.
		for (int i = 0; i < weekTotals.size(); i++) {
			if (weekTotals.get(i) > weekTotals.get(highestWeek))
				highestWeek = i;
			if (weekTotals.get(i) < weekTotals.get(lowestWeek))
				lowestWeek = i;
		}
		System.out.println("\nWeek with the highest sales: Week " + (highestWeek + 1));
		System.out.println("Week with the lowest sales: Week " + (lowestWeek + 1));
		
	}
}
