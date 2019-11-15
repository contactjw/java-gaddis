package chapter2;
import javax.swing.JOptionPane;

public class Initials {
	public static void main(String[] args) {
		String firstName, middleName, lastName;
		char firstInitial, middleInitial, lastInitial;
		
		firstName = JOptionPane.showInputDialog("Enter your first name: ");
		middleName = JOptionPane.showInputDialog("Enter your middle name: ");
		lastName = JOptionPane.showInputDialog("Enter your last name: ");
		
		firstInitial = firstName.charAt(0);
		middleInitial = middleName.charAt(0);
		lastInitial = lastName.charAt(0);
		
		JOptionPane.showMessageDialog(null, "Full Name: " + firstName
									  + " " + middleName + " " + lastName + "\n"
									  + "Initials: " + firstInitial + middleInitial
									  + lastInitial);
		
		System.exit(0);
	}
}
