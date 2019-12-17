package chapter9;
import java.util.Scanner;

public class MorseCodeConverter {
	public static void main(String[] args) {
		String input;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter a sentence to convert to morse code: ");
		input = keyboard.nextLine();
		
		String morse = morseCode(input);
		
		System.out.println("\nEnglish: " + input);
		System.out.println("Morse code: " + morse);
		
		keyboard.close();
	}
	
	
	public static String morseCode(String str) {
		char[] normal = {' ', ',', '.', '?', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G',
						 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
		
		String[] code = {" ", "--..--", ".-.-.-", "..--..", "-----", ".----", "..---", "...--", "....-", ".....",
						 "-....", "--...", "---..", "----.", ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....",
						 "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-",
						 "...-", ".--", "-..-", "-.--", "--.."};
		
		StringBuilder morse = new StringBuilder();
		
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < normal.length; j++) {
				if (Character.toUpperCase(str.charAt(i)) == normal[j])
					morse.append(code[j]);
			}
		}
		
		return morse.toString();
	}
}
