package chapter2;
import javax.swing.JOptionPane;

public class TestAverage {
	public static void main(String[] args) {
		double test1, test2, test3, average;
		String input;
		
		input = JOptionPane.showInputDialog("Enter the score for test 1: ");
		test1 = Double.parseDouble(input);
		
		input = JOptionPane.showInputDialog("Enter the score for test 2: ");
		test2 = Double.parseDouble(input);
		
		input = JOptionPane.showInputDialog("Enter the score for test 3: ");
		test3 = Double.parseDouble(input);
		
		average = (test1 + test2 + test3) / 3.0;
		
		JOptionPane.showMessageDialog(null, "Test Scoring" +
											"\nTest 1: " + test1 +
											"\nTest 2: " + test2 +
											"\nTest 3: " + test3 +
											"\nAverage: " + average);
		System.exit(0);
	}
}
