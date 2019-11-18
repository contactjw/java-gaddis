package chapter3;
import java.util.Scanner;

public class TestsAndGrades {
	public static void main(String[] args) {
		double score1,
			   score2,
			   score3,
			   average = 0;
		char grade;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter test score #1: ");
		score1 = keyboard.nextDouble();
		average += score1;
		
		System.out.print("Enter test score #2: ");
		score2 = keyboard.nextDouble();
		average += score2;
		
		System.out.print("Enter test score #3: ");
		score3 = keyboard.nextDouble();
		average += score3;
		
		average /= 3.0;
		
		System.out.printf("\nYour average: %.2f\n", average);
		
		if (average < 60.0)
			grade = 'F';
		else if (average < 70.0)
			grade = 'D';
		else if (average < 80.0)
			grade = 'C';
		else if (average < 90.0)
			grade = 'B';
		else
			grade = 'A';
		
		System.out.println("Your letter grade: " + grade);
		
		keyboard.close();
	}
}
