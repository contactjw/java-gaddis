package chapter5;
import java.util.Scanner;

public class TestAverageAndGrade {
	public static void main(String[] args) {
		double grade1,
			   grade2,
			   grade3,
			   grade4,
			   grade5;
		
		Scanner keyboard = new Scanner(System.in);
			
		System.out.print("Enter score for test 1: ");
		grade1 = keyboard.nextDouble();
		System.out.print("Enter score for test 2: ");
		grade2 = keyboard.nextDouble();
		System.out.print("Enter score for test 3: ");
		grade3 = keyboard.nextDouble();
		System.out.print("Enter score for test 4: ");
		grade4 = keyboard.nextDouble();
		System.out.print("Enter score for test 5: ");
		grade5 = keyboard.nextDouble();
		
		
		System.out.println("\nYour test results");
		System.out.println("-----------------");
		System.out.println("Test #1: " + grade1 + " = " + determineGrade(grade1));
		System.out.println("Test #2: " + grade2 + " = " + determineGrade(grade2));
		System.out.println("Test #3: " + grade3 + " = " + determineGrade(grade3));
		System.out.println("Test #4: " + grade4 + " = " + determineGrade(grade4));
		System.out.println("Test #5: " + grade5 + " = " + determineGrade(grade5));
		System.out.printf("Average test score: %.2f", calcAverage(grade1, grade2, grade3, grade4, grade5));
		System.out.println("\nFinal grade in class: " + 
							determineGrade(calcAverage(grade1, grade2, grade3, grade4, grade5)));
		
		keyboard.close();
	}
	
	public static double calcAverage(double t1, double t2, double t3, double t4, double t5) {
		return (t1 + t2 + t3 + t4 + t5) / 5.0;
	}
	
	public static char determineGrade(double test) {
		if (test < 60)
			return 'F';
		else if (test < 69)
			return 'D';
		else if (test < 79)
			return 'C';
		else if (test < 89)
			return 'B';
		else
			return 'A';
	}
}
