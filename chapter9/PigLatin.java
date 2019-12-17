package chapter9;
import java.util.Scanner;

public class PigLatin {

	public static void main(String[] args) {
		String regular;
		String pigLatin;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter a sentence to convert to pig latin: ");
		regular = keyboard.nextLine();
		
		pigLatin = convert(regular);
		
		System.out.println(pigLatin);
		
		keyboard.close();
		
	}
	
	public static String convert(String str) {
		String [] tokens = str.split(" ");
		StringBuilder sentence = new StringBuilder();
		StringBuilder tempSentence = new StringBuilder();

		
		for (int i = 0; i < tokens.length; i++) {
			char tempChar;
			tempChar = tokens[i].charAt(0);
			tempSentence.append(tokens[i]);
			tempSentence.deleteCharAt(0);
			tempSentence.append(tempChar + "ay");
			sentence.append(tempSentence + " ");
			tempSentence.delete(0, tempSentence.length());
		}
		
		return sentence.toString();
	}

}
