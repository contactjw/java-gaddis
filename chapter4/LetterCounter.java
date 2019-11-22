package chapter4;
import javax.swing.JOptionPane;

public class LetterCounter {
	public static void main(String[] args) {
		String input,
			   charString;
		char letter;
		int numCount = 0;
		
		input = JOptionPane.showInputDialog("Enter a string: ");
		
		charString = JOptionPane.showInputDialog("Enter a character in that string: ");
		letter = charString.charAt(0);
		
		for (int i = 0; i < input.length(); i++) {
			if (Character.toLowerCase(input.charAt(i)) == Character.toLowerCase(letter))
				numCount++;
		}
		
		JOptionPane.showMessageDialog(null, "Number of times " + letter + 
											" appears in " + input + ": " + numCount);
		
		System.exit(0);
	}
}
