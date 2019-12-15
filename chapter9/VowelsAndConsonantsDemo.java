package chapter9;
import java.util.Scanner;

public class VowelsAndConsonantsDemo {

	public static void main(String[] args) {
		String str;
		String choice;
		
		Scanner keyboard = new Scanner(System.in);
		

		
		do {
			System.out.print("Enter a sentence: ");
			str = keyboard.nextLine();
			VowelsAndConsonants newTest = new VowelsAndConsonants(str);
			menu();
			choice = keyboard.nextLine();
			while (Character.toLowerCase(choice.charAt(0)) < 'a' || Character.toLowerCase(choice.charAt(0)) > 'e') {
				System.out.println("Enter a valid choice (a-e): ");
				choice = keyboard.nextLine();
			}
			checkChoice(choice);
		} while (Character.toLowerCase(choice.charAt(0)) == 'd');
		
		keyboard.close();
	}
	
	public static void menu() {
		System.out.println("a. Count the number of vowels in the string");
		System.out.println("b. Count the number of consonants in the string");
		System.out.println("c. Count both the vowels and consonants in the string");
		System.out.println("d. Enter another string");
		System.out.println("e. Exit the program");
		System.out.print("Enter your choice (a-e): ");
	}
	
	public static void checkChoice(String str) {
		char choice = str.charAt(0);
		choice = Character.toLowerCase(choice);
		
		switch (choice) {
		case 'a':
			System.out.println("Vowels: " + VowelsAndConsonants.getVowels());
			break;
		case 'b':
			System.out.println("Consonants: " + VowelsAndConsonants.getConsonants());
			break;
		case 'c':
			System.out.println("Vowels: " + VowelsAndConsonants.getVowels());
			System.out.println("Consonants: " + VowelsAndConsonants.getConsonants());
			break;
		case 'd':
			return;
		case 'e':
			System.exit(0);
			
		}
	}

}
