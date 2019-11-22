package chapter4;
import javax.swing.JOptionPane;
import java.util.Scanner;
import java.io.*;

public class FileLetterCounter {
	public static void main(String[] args) throws IOException {
		String input,
			   charString,
			   fileName;
		char letter;
		int numCount = 0;
		
		fileName = JOptionPane.showInputDialog("Enter the name of a file to read: ");
		File myFile = new File(fileName);
		
		if (myFile.exists()) {
			System.out.println("File does exist.");
		}
		else {
			System.out.println("File does not exist.  Terminating program.");
			System.exit(0);
		}
		
		Scanner inputFile = new Scanner(myFile);
		
		charString = JOptionPane.showInputDialog("Enter a character in that string: ");
		letter = charString.charAt(0);
		
		while (inputFile.hasNext()) {
			input = inputFile.nextLine();
			for (int i = 0; i < input.length(); i++) {
				if (Character.toLowerCase(input.charAt(i)) == Character.toLowerCase(letter))
					numCount++;
			}
		}
		
		JOptionPane.showMessageDialog(null, "Number of times " + letter + 
											" appears in the file: " + numCount);
		
		inputFile.close();
		System.exit(0);
	}
}
