package chapter15;
import java.util.Scanner;

public class CharacterCounter {
	public static void main(String[] args) {
		String myString = "Hello how are you today boss?  I heard we did well last night at the event";
		char[] charArray = myString.toCharArray();
		String charString;
		char myChar;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter a character to see how many times it appears in the sentence: ");
		charString = keyboard.nextLine();
		myChar = charString.charAt(0);
		
		int count = 0;
		count = countChar(charArray, myChar, 0, count);
		
		System.out.println("The number of times " + myChar + " appears in the sentence is: " + count);
		
		keyboard.close();
	}
	
	public static int countChar(char[] arr, char c, int pos, int count) {
		if (pos == arr.length - 1)
			return count;
		else {
			if (arr[pos] == c)
				return countChar(arr, c, pos + 1, count + 1);
			else
				return countChar(arr, c, pos + 1, count);
		}
	}
	
}
