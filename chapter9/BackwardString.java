package chapter9;
import java.util.Scanner;

public class BackwardString {
	public static void main(String[] args) {
		String word;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter a word to reverse: ");
		word = keyboard.nextLine();
		
		reverse(word);
		
		keyboard.close();
	}
	
	
	public static void reverse(String str) {
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
	}
}
