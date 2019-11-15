package chapter2;
import java.util.Scanner;

public class GenderPercents {
	public static void main(String[] args) {
		int males, females, totalStudents;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the number of males in class: ");
		males = keyboard.nextInt();
		
		System.out.print("Enter the number of females in class: ");
		females = keyboard.nextInt();
		
		totalStudents = males + females;
		
		System.out.println("Total Students in Class: " + totalStudents +
						   "\nPercent Males: " + (((double)males/totalStudents) * 100) +
						   "\nPercenet Females: " + (((double)females/totalStudents) * 100));
		
		keyboard.close();
	}
}
