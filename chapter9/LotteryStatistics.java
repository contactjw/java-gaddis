package chapter9;
import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class LotteryStatistics {
	public static void main(String[] args) throws IOException{
		int[] normalNums = new int[69];
		int[] powerNums = new int[35];
		
		File file = new File("pbnumbers.txt");
		Scanner inputFile = new Scanner(file);
		
		// initialize each array to 0
		for (int i = 0; i < normalNums.length; i++)
			normalNums[i] = 0;
		
		for (int i = 0; i < powerNums.length; i++)
			powerNums[i] = 0;
		
		int number = 0;
		int power = 0;
		
		while (inputFile.hasNext()) {
			String line = inputFile.nextLine();
			String[] tokens = line.split(" ");
			for (int i = 0; i < 5; i++) {
				number = Integer.parseInt(tokens[i]);
				for (int j = 0; j < normalNums.length; j++) {
					if (number == (j + 1)) {
						normalNums[j]++;
					}
				}
			}
			power = Integer.parseInt(tokens[5]);
			for (int j = 0; j < powerNums.length; j++) {
				if (j < powerNums.length && (j + 1) == power) {
					powerNums[j]++;
				}
			}
		}
		
		ArrayList<Integer> freq = new ArrayList<>();
		int mostFrequent = 0,
		    mostFrequentNum = 0;
		
		int leastFrequent = 10000,
			leastFrequentNum = 0;
		
		// find the smallest and highest values.
		for (int i = 0; i < normalNums.length; i++) {
			if (normalNums[i] > mostFrequent) {
				mostFrequent = normalNums[i];
			}
			if (normalNums[i] < leastFrequent) {
				leastFrequent = normalNums[i];
			}
		}
		
		
		for (int i = 0; i < normalNums.length; i++) {
			System.out.println((i + 1) + " ocurred " + normalNums[i] + " times.");
			
			if (normalNums[i] >= mostFrequent && freq.size() < 10) {
				mostFrequent = normalNums[i];
				mostFrequentNum = i + 1;
				freq.add((i + 1));
				normalNums[i] = 0;
			}
//			if (normalNums[i] < leastFrequent) {
//				leastFrequent = normalNums[i];
//				leastFrequentNum = i + 1;
//			}
		}
		
		System.out.println(freq.size());
		
		System.out.println("10 Most frequent numbers: ");
		for (int i = 0; i < 10; i++) {
			System.out.print(freq.get(i) + " ");
		}
		
		System.out.println("\nMost frequent number: " + mostFrequentNum);
		System.out.println("Least frequent number: " + leastFrequentNum);
		
		System.out.println();
		
		for (int i = 0; i < powerNums.length; i++) {
			System.out.println((i + 1) + " ocurred " + powerNums[i] + " times.");
		}
		
	}
	
}
