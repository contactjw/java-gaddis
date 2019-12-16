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
		String[] tokens = phone.split("-");
		String justNum = tokens.toString();
		char[] charNum = justNum.toCharArray();
		
		for (int i = 0; i < charNum.length; i++) {
			if (Character.isAlphabetic(charNum[i])) {
				if (charNum[i] == 'A' || charNum[i] == 'B' || charNum[i] == 'C') {
					charNum[i] = '2';
				}
				else if (charNum[i] == 'D' || charNum[i] == 'E' || charNum[i] == 'F') {
					charNum[i] = '3';
				}
				else if (charNum[i] == 'G' || charNum[i] == 'H' || charNum[i] == 'I') {
					charNum[i] = '4';
				}
				else if (charNum[i] == 'J' || charNum[i] == 'K' || charNum[i] == 'L') {
					charNum[i] = '5';
				}
				else if (charNum[i] == 'M' || charNum[i] == 'N' || charNum[i] == 'O') {
					charNum[i] = '6';
				}
				else if (charNum[i] == 'P' || charNum[i] == 'Q' || charNum[i] == 'R' || charNum[i] == 'S') {
					charNum[i] = '7';
				}
				else if (charNum[i] == 'T' || charNum[i] == 'U' || charNum[i] == 'V') {
					charNum[i] = '8';
				}
				else if (charNum[i] == 'W' || charNum[i] == 'X' || charNum[i] == 'Y' || charNum[i] == 'Z') {
					charNum[i] = '9';
				}
			}
		}
		
		StringBuilder finalNum = new StringBuilder();

		for (int i = 0; i < charNum.length; i++) {
			finalNum.append(charNum[i]);
		}
		
		return finalNum.toString();
		
	}
}
