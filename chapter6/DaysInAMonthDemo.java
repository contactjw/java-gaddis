package chapter6;
import java.util.Scanner;

public class DaysInAMonthDemo {
	public static void main(String[] args) {
		int month, year;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter a month (1-12): ");
		month = keyboard.nextInt();
		while (month < 1 || month > 12) {
			System.out.print("Enter a month in the range (1-12): ");
			month = keyboard.nextInt();
		}
		
		System.out.print("Enter a year: ");
		year = keyboard.nextInt();
		while (year < 1000 || year > 9999) {
			System.out.println("Enter a four digit year: ");
			year = keyboard.nextInt();
		}
		
		DaysInAMonth date1 = new DaysInAMonth(month, year);
		
		System.out.println(date1.numberOfDays() + " days");
		
		keyboard.close();
	}
}
