package chapter4;
import java.io.*;
import java.util.Scanner;

public class UppercaseFileConverter {
	public static void main(String[] args) throws IOException{
		String fileName1,
			   fileName2,
			   inputLine;
		
		Scanner keyboard = new Scanner(System.in);
				
		System.out.print("Enter the name of input file to read from: ");
		fileName1 = keyboard.nextLine();
		File file1 = new File(fileName1);
		
		if (!file1.exists()) {
			System.out.println("File does not exist.");
			System.exit(0);
		}
		
		// Create the scanner to read the file input.
		Scanner inputFile = new Scanner(file1);

		System.out.print("Enter the name of output file to create: ");
		fileName2 = keyboard.nextLine();
		
		// PrintWriter allows us to use print/println to write data to a file.
		PrintWriter outputFile = new PrintWriter(fileName2);
		
		while (inputFile.hasNext()) {
			inputLine = inputFile.nextLine();
			outputFile.println(inputLine.toUpperCase());
		}
		
		System.out.println("Entering data to output file.");
		
		keyboard.close();
		inputFile.close();
		outputFile.close();
	}
}
