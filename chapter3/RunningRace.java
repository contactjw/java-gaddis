package chapter3;
import javax.swing.JOptionPane;

public class RunningRace {
	public static void main(String[] args) {
		String input;
		String runner1,
			   runner2,
			   runner3;
		double runnerTime1,
			   runnerTime2,
			   runnerTime3;
		
		runner1 = JOptionPane.showInputDialog("Enter the name of runner #1: ");
		input = JOptionPane.showInputDialog("Enter the time runner #1 finished: ");
		runnerTime1 = Double.parseDouble(input);
		
		runner2 = JOptionPane.showInputDialog("Enter the name of runner #2: ");
		input = JOptionPane.showInputDialog("Enter the time runner #2 finished: ");
		runnerTime2 = Double.parseDouble(input);
		
		runner3 = JOptionPane.showInputDialog("Enter the name of runner #3: ");
		input = JOptionPane.showInputDialog("Enter the time runner #3 finished: ");
		runnerTime3 = Double.parseDouble(input);
		
		if (runnerTime1 < runnerTime2 && runnerTime1 < runnerTime3) {
			if (runnerTime2 < runnerTime3) {
				JOptionPane.showMessageDialog(null, "1st Place: " + runner1 + 
													" with a time of " + runnerTime1 +
													"\n2nd Place: " + runner2 +
													" with a time of " + runnerTime2 +
													"\n3rd Place: " + runner3 + 
													" with a time of " + runnerTime3);
			}
			else {
				JOptionPane.showMessageDialog(null, "1st Place: " + runner1 + 
						" with a time of " + runnerTime1 +
						"\n2nd Place: " + runner3 +
						" with a time of " + runnerTime3 +
						"\n3rd Place: " + runner2 + 
						" with a time of " + runnerTime2);
			}
		}
		else if (runnerTime2 < runnerTime1 && runnerTime2 < runnerTime3) {
			if (runnerTime1 < runnerTime3) {
				JOptionPane.showMessageDialog(null, "1st Place: " + runner2 + 
						" with a time of " + runnerTime2 +
						"\n2nd Place: " + runner1 +
						" with a time of " + runnerTime1 +
						"\n3rd Place: " + runner3 + 
						" with a time of " + runnerTime3);
			}
			else {
				JOptionPane.showMessageDialog(null, "1st Place: " + runner2 + 
						" with a time of " + runnerTime2 +
						"\n2nd Place: " + runner3 +
						" with a time of " + runnerTime3 +
						"\n3rd Place: " + runner1 + 
						" with a time of " + runnerTime1);
			}
		}
		else if (runnerTime3 < runnerTime1 && runnerTime3 < runnerTime2) {
			if (runnerTime1 < runnerTime2) {
				JOptionPane.showMessageDialog(null, "1st Place: " + runner3 + 
						" with a time of " + runnerTime3 +
						"\n2nd Place: " + runner1 +
						" with a time of " + runnerTime1 +
						"\n3rd Place: " + runner2 + 
						" with a time of " + runnerTime2);
			}
			else {
				JOptionPane.showMessageDialog(null, "1st Place: " + runner3 + 
						" with a time of " + runnerTime3 +
						"\n2nd Place: " + runner2 +
						" with a time of " + runnerTime2 +
						"\n3rd Place: " + runner1 + 
						" with a time of " + runnerTime1);
			}
		}
		System.exit(0);
	}
}
