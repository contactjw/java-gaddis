package chapter3;
import java.util.Scanner;

public class BookClubPoints {
	public static void main(String[] args) {
		int books,
			points = 0;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the number of books purchased this month: ");
		books = keyboard.nextInt();
		
		switch(books) {
			case 0:
				points = 0;
				break;
			case 1:
				points = 5;
				break;
			case 2:
				points = 15;
				break;
			case 3:
				points = 30;
				break;
			default:
				points = 60;
				break;
		}
		
		System.out.println("Total Number of Books Purchased: " + books);
		System.out.println("Total number of Points Earned: " + points);
		
		keyboard.close();
	}
}
