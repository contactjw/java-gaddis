package chapter9;
import java.util.Scanner;

public class WordCounter {
	public static void main(String[] args) {
		String myString;
		int numWords = 0;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		myString = keyboard.nextLine();
		
		numWords = count(myString);
		
		System.out.println("That string contains " + numWords + " words.");
		
		keyboard.close();
	}
	
	public static int count(String str) {
		String[] words = str.split(" ");
		return words.length;
	}
}
