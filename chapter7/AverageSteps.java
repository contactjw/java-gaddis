package chapter7;
import java.io.*;
import java.util.Scanner;

public class AverageSteps {
	public static void main(String[] args) throws IOException{
		
		int[] January = new int[31];
		int[] February = new int[28];
		int[] March = new int[31];
		int[] April = new int[30];
		int[] May = new int[31];
		int[] June = new int[30];
		int[] July = new int[31];
		int[] August = new int[31];
		int[] September = new int[30];
		int[] October = new int[31];
		int[] November = new int[30];
		int[] December = new int[31];
		
		File inputFile = new File("steps.txt");
		@SuppressWarnings("resource")
		Scanner input = new Scanner(inputFile);
		for (int i = 0; i < January.length; i++) {
			January[i] = input.nextInt();
		}
		for (int i = 0; i < February.length; i++) {
			February[i] = input.nextInt();
		}
		for (int i = 0; i < March.length; i++) {
			March[i] = input.nextInt();
		}
		for (int i = 0; i < April.length; i++) {
			April[i] = input.nextInt();
		}
		for (int i = 0; i < May.length; i++) {
			May[i] = input.nextInt();
		}
		for (int i = 0; i < June.length; i++) {
			June[i] = input.nextInt();
		}
		for (int i = 0; i < July.length; i++) {
			July[i] = input.nextInt();
		}
		for (int i = 0; i < August.length; i++) {
			August[i] = input.nextInt();
		}
		for (int i = 0; i < September.length; i++) {
			September[i] = input.nextInt();
		}
		for (int i = 0; i < October.length; i++) {
			October[i] = input.nextInt();
		}
		for (int i = 0; i < November.length; i++) {
			November[i] = input.nextInt();
		}
		for (int i = 0; i < December.length; i++) {
			December[i] = input.nextInt();
		}

		
//		populateMonth(January);
//		populateMonth(February);
//		populateMonth(March);
//		populateMonth(April);
//		populateMonth(May);
//		populateMonth(June);
//		populateMonth(July);
//		populateMonth(August);
//		populateMonth(September);
//		populateMonth(October);
//		populateMonth(November);
//		populateMonth(December);
		
		System.out.printf("January Average Steps: %.2f\n", getAverage(January));
		System.out.printf("February Average Steps: %.2f\n", getAverage(February));
		System.out.printf("March Average Steps: %.2f\n", getAverage(March));
		System.out.printf("April Average Steps: %.2f\n", getAverage(April));
		System.out.printf("May Average Steps: %.2f\n", getAverage(May));
		System.out.printf("June Average Steps: %.2f\n", getAverage(June));
		System.out.printf("July Average Steps: %.2f\n", getAverage(July));
		System.out.printf("August Average Steps: %.2f\n", getAverage(August));
		System.out.printf("September Average Steps: %.2f\n", getAverage(September));
		System.out.printf("October Average Steps: %.2f\n", getAverage(October));
		System.out.printf("November Average Steps: %.2f\n", getAverage(November));
		System.out.printf("December Average Steps: %.2f\n", getAverage(December));
		
	}
	
//	public static void populateMonth(int[] m) throws IOException{
//		File inputFile = new File("steps.txt");
//		@SuppressWarnings("resource")
//		Scanner input = new Scanner(inputFile);
//		for (int i = 0; i < m.length; i++) {
//			m[i] = input.nextInt();
//		}
//	}
//	
	public static double getAverage(int[] m) {
		double avg = 0.0;
		for (int i = 0; i < m.length; i++) {
			avg += m[i];
		}
		avg /= m.length;
		return avg;
	}

}
