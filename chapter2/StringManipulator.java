package chapter2;
import java.util.Scanner;

public class StringManipulator {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		String city,
			   upperCity,
			   lowerCity;
		int numberLetters;
		char firstChar;
		
		System.out.print("Enter the name of a city: ");
		city = keyboard.nextLine();
		
		numberLetters = city.length();
		upperCity = city.toUpperCase();
		lowerCity = city.toLowerCase();
		firstChar = city.charAt(0);
		
		System.out.println("City name: " + city +
						   "\nNumber of Letters: " + numberLetters + 
						   "\nCapitalized: " + upperCity + 
						   "\nLower Case: " + lowerCity +
						   "\nFirst Character: " + firstChar);
		
		keyboard.close();
	}
}
