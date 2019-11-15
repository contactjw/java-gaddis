package chapter2;
import javax.swing.JOptionPane;

public class CompoundInterest {
	public static void main(String[] args) {
		String input;
		double principal,
			   annualInterest,
			   timesCompounded,
			   yearsToEarn,
			   totalEarned;
		
		input = JOptionPane.showInputDialog("Enter the principal amount in savings: $");
		principal = Double.parseDouble(input);
		
		input = JOptionPane.showInputDialog("Enter the annual interest rate" +
											" as a percent (5% = 0.05): ");
		annualInterest = Double.parseDouble(input);
		
		input = JOptionPane.showInputDialog("Enter the number of times compounded per year: ");
		timesCompounded = Double.parseDouble(input);
		
		input = JOptionPane.showInputDialog("Enter the number of years in the bank: ");
		yearsToEarn = Double.parseDouble(input);
		
		totalEarned = principal * Math.pow((1 + (annualInterest/timesCompounded)),
												(timesCompounded * yearsToEarn));
		
		JOptionPane.showMessageDialog(null, "Total amount earned on the account over\n" +
											(int)yearsToEarn + " years is: $" + totalEarned);

		System.exit(0);
	}
}
