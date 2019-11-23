package chapter4;
import java.util.Scanner;
import java.io.*;

public class FileHeadDisplay {
	public static void main(String[] args) throws IOException {
		String filename;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter the name of a file to display: ");
		filename = keyboard.nextLine();
		
		File myFile = new File(filename);
		if (!myFile.exists()) {
			System.out.println("File does not exist.");
			System.exit(0);
		}
		
		Scanner readFile = new Scanner(myFile);
		
		int count = 1;
		while (readFile.hasNext() && count < 6) {
			System.out.println(readFile.nextLine());
			count++;
		}

		readFile.close();
		keyboard.close();
	}
}
