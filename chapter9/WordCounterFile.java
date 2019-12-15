package chapter9;
import java.io.*;
import java.util.Scanner;

public class WordCounterFile {
	public static void main(String[] args) throws IOException{
		String input;
		String line;
		int words = 0;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the name of a file ending with .txt: ");
		input = keyboard.nextLine();
		
		File file = new File(input);
		Scanner inputFile = new Scanner(file);
		
		while (inputFile.hasNext()) {
			line = inputFile.nextLine();
			words += countWords(line);
		}		
		
		System.out.println("The file contains " + words + " words.");
		
		keyboard.close();
		inputFile.close();
	}
	
	public static int countWords(String line) {
		String[] tokens = line.split(" ");
		return tokens.length;
	}
}
