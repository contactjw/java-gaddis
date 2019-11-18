package chapter3;
import javax.swing.JOptionPane;

public class BodyMassIndex {
	public static void main(String[] args) {
		String input;
		double height, weight, bmi;
		
		input = JOptionPane.showInputDialog("Enter your height in inches");
		height = Double.parseDouble(input);
		
		input = JOptionPane.showInputDialog("Enter your weight in pounds");
		weight = Double.parseDouble(input);
		
		bmi = weight * 703 / Math.pow(height, 2);
		
		if (bmi < 18.5)
			JOptionPane.showMessageDialog(null, "You are underweight.");
		else if (bmi < 25)
			JOptionPane.showMessageDialog(null, "You are at an optimal weight.");
		else
			JOptionPane.showMessageDialog(null, "You are considered overweight.");
	
	}
}
