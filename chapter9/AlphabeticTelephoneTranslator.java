package chapter9;
import java.util.Scanner;

public class AlphabeticTelephoneTranslator {
	public static void main(String[] args) {
		String phoneNumber;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter a telephone number (815-242-4345): ");
		phoneNumber = keyboard.nextLine();
		
		String numericPhone = translate(phoneNumber);
		
		System.out.println(phoneNumber + " is equivalent to " + numericPhone);
		
		keyboard.close();
	}

	public static String translate(String phone) {
		StringBuilder translated = new StringBuilder();
		char[] charNum = phone.toCharArray();
		
		for (int i = 0; i < charNum.length; i++) {
			if (Character.isAlphabetic(charNum[i])) {
				charNum[i] = Character.toUpperCase(charNum[i]);
			}
			Character.toUpperCase(charNum[i]);
			if (charNum[i] == 'A' || charNum[i] == 'B' || charNum[i] == 'C') {
				translated.append('2');
			}
			else if (charNum[i] == 'D' || charNum[i] == 'E' || charNum[i] == 'F') {
				translated.append('3');
			}
			else if (charNum[i] == 'G' || charNum[i] == 'H' || charNum[i] == 'I') {
				translated.append('4');
			}
			else if (charNum[i] == 'J' || charNum[i] == 'K' || charNum[i] == 'L') {
				translated.append('5');
			}
			else if (charNum[i] == 'M' || charNum[i] == 'N' || charNum[i] == 'O') {
				translated.append('6');
			}
			else if (charNum[i] == 'P' || charNum[i] == 'Q' || charNum[i] == 'R' || charNum[i] == 'S') {
				translated.append('7');
			}
			else if (charNum[i] == 'T' || charNum[i] == 'U' || charNum[i] == 'V') {
				translated.append('8');
			}
			else if (charNum[i] == 'W' || charNum[i] == 'X' || charNum[i] == 'Y' || charNum[i] == 'Z') {
				translated.append('9');
			}
			else {
				translated.append(charNum[i]);
			}
		}
		
		return translated.toString();
		
	}
}
