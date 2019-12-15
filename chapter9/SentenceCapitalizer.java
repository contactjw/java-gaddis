package chapter9;
import java.util.Scanner;

public class SentenceCapitalizer {

	public static void main(String[] args) {
		String sentence;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter a few sentences separated by a space: ");
		sentence = keyboard.nextLine();
		
		keyboard.close();

		String capSentence;
		
		capSentence = capitalize(sentence);
		
		System.out.println(capSentence);
	
	}
	
	public static String capitalize(String str) {
		StringBuilder newString = new StringBuilder(str);
		int index = 0;
		
		// check the first position and capitalize if needed.
		if (newString.length() > 0)
			newString.setCharAt(0, Character.toUpperCase(newString.charAt(0)));
		
		// set the index to the first period.
		index = newString.indexOf(". ");
		
		while (index != -1) {
			// progress to the index after the period.
			index++;
			
			// if the index is a space character, keep progressing.
			while (index < newString.length() && newString.charAt(index) == ' ')
				index++;
				
			newString.setCharAt(index, Character.toUpperCase(newString.charAt(index)));
			
			index = newString.indexOf(". ", index);
		}
		
		return newString.toString(); 
	}

}
