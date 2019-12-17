package chapter9;
import java.util.Scanner;

public class WordSeparator {
	public static void main(String[] args) {
		String input;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter a sentence with no spaces and capital letters separating the words: ");
		input = keyboard.nextLine();
		
		StringBuilder sentence = new StringBuilder(input);
		
		// start from one to skip the first character.
		for (int i = 1; i < sentence.length(); i++) {
			if (Character.isUpperCase(sentence.charAt(i))) {
				sentence.replace(i, i + 1, " " + Character.toLowerCase(sentence.charAt(i)));
			}
		}
		
		System.out.println(sentence);
		
		keyboard.close();
	}
}
