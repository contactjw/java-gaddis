package chapter3;
import java.util.Scanner;

public class MagicDates {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int month,
			day,
			year;
		
		System.out.print("Enter the month (1-12): ");
		month = keyboard.nextInt();
		
		System.out.print("Enter the day (1-30): ");
		day = keyboard.nextInt();
		
		System.out.print("Enter the year (1995 = 95): ");
		year = keyboard.nextInt();
		
		if (month * day == year)
			System.out.println("This is a magic date!");
		else
			System.out.println("This is not a magic date..");
		
		keyboard.close();
	}
}
