package chapter7;
import java.util.Scanner;

public class GradesDemo {

	public static void main(String[] args) {
		String name;
		double grade = 0.0;
		double[] grades = new double[4];
		
		Scanner keyboard = new Scanner(System.in);
		
		// For calculating regular grades.
		//Grades newStudents = new Grades();
		
		// For dropping the lowest.
		GradesDropLowest newStudents = new GradesDropLowest();
		
		System.out.println("This program calculates the average scores for 5 students.");
		
		for (int i = 0; i < 5; i++) {
			System.out.print("Enter name of student " + (i + 1) + ": ");
			name = keyboard.nextLine();
			newStudents.setStudentName(i, name);
			for (int j = 0; j < grades.length; j++) {
				System.out.print("Enter score #" + (j + 1) + ": ");
				grade = keyboard.nextDouble();
				while (grade < 0 || grade > 100) {
					System.out.print("Enter a score between 0 and 100: ");
					grade = keyboard.nextDouble();
				}
				grades[j] = grade;
			}
			newStudents.setStudentScores(i, grades);
			keyboard.nextLine();
		}
		
		
		System.out.println("\nStudent Information:");
		for (int i = 0; i < 5; i++) {
			System.out.println("Name: " + newStudents.getStudentName(i));
			System.out.printf("Average Test Score: %.2f\n", newStudents.getAverageScore(i));
			System.out.println("Letter Grade: " + newStudents.getLetterGrade(i));
			System.out.println();
		}
		
		keyboard.close();
	}
}
