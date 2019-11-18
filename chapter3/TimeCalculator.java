package chapter3;
import javax.swing.JOptionPane;

public class TimeCalculator {
	public static void main(String[] args) {
		String input;
		int seconds,
			minutes = 0,
			hours = 0,
			days = 0;
		
		input = JOptionPane.showInputDialog("Enter the number of seconds: ");
		seconds = Integer.parseInt(input);
		
		if (seconds >= 60)
			minutes = seconds / 60;
		if (seconds >= 3600)
			hours = seconds / 3600;
		if (seconds >= 86400)
			days = seconds / 86400;
		
		JOptionPane.showMessageDialog(null, seconds + " seconds contains:" +
											"\nMinutes: " + minutes +
											"\nHours: " + hours +
											"\nDays: " + days);

		System.exit(0);
	}
}
