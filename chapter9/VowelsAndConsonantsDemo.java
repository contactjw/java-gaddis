package chapter9;
import java.util.Scanner;

public class VowelsAndConsonantsDemo {

	public static void main(String[] args) {
		String str;
		char choice;
		
		Scanner keyboard = new Scanner(System.in);
		
		do {
			System.out.print("Enter a sentence: ");
			str = keyboard.nextLine();
			VowelsAndConsonants newTest = new VowelsAndConsonants(str);
			choice  = menu();
			
			switch (choice) {
			case 'a':
				System.out.println("Vowels: " + newTest.getVowels());
				break;
			case 'b':
				System.out.println("Consonants: " + newTest.getConsonants());
				break;
			case 'c':
				System.out.println("Vowels: " + newTest.getVowels());
				System.out.println("Consonants: " + newTest.getConsonants());
				break;
			case 'd':
				break;
			case 'e':
				System.out.println("Program ending.. goodbye!");
				System.exit(0);
			}
			
		} while (choice != 'e');
		
		keyboard.close();
	}
	
	public static char menu() {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		String input;
		char menuChoice;
		System.out.println("a. Count the number of vowels in the string");
		System.out.println("b. Count the number of consonants in the string");
		System.out.println("c. Count both the vowels and consonants in the string");
		System.out.println("d. Enter another string");
		System.out.println("e. Exit the program");
		System.out.print("Enter your choice (a-e): ");
		input = keyboard.nextLine(); 
		menuChoice = Character.toLowerCase(input.charAt(0));
		while (menuChoice < 'a' || menuChoice > 'e') {
			System.out.println("Enter a choice between a - e: ");
			input = keyboard.nextLine();
			menuChoice = Character.toLowerCase(input.charAt(0));
		}
		
		return menuChoice;
	}
}
