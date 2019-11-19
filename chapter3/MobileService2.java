package chapter3;
import java.util.Scanner;

public class MobileService2 {
	public static void main(String[] args) {
		String servicePack;
		int minutes;
		double total = 0.0,
			   wouldSaveB = 0.0,
			   wouldSaveC = 0.0;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Select your package (A, B, or C): ");
		servicePack = keyboard.nextLine();
		
		System.out.print("Enter the number of minutes used: ");
		minutes = keyboard.nextInt();
		
		if (servicePack.charAt(0) == 'A' || servicePack.charAt(0) == 'a') {
			total += 39.99;
			if (minutes > 450) {
				minutes -= 450;
				total += (minutes * 0.45);
			}
			if (total > 59.99 && minutes < 900) {
				wouldSaveB = total - 59.99;
			}
			else if (total > 59.99 && minutes > 900) {
				wouldSaveB = total - (59.99 + ((minutes - 900) * 0.40));
			}
			if (total > 69.99) {
				wouldSaveC = total - 69.99;
			}
		}
		else if (servicePack.charAt(0) == 'B' || servicePack.charAt(0) == 'b') {
			total += 59.99;
			if (minutes > 900) {
				minutes -= 900;
				total += (minutes * 0.40);
			}
			if (total > 69.99) {
				wouldSaveC = total - 69.99;
			}
		}
		else if (servicePack.charAt(0) == 'C' || servicePack.charAt(0) == 'c') {
			total += 69.99;
		}
		
		if (total == 0.0) {
			System.out.println("Rerun program and enter a valid serice package...");
		}
		else if (wouldSaveB != 0.0 && wouldSaveC == 0.0) {
			System.out.printf("Your monthly charge is: $%.2f", total);
			System.out.printf("\nYou would have saved: $%.2f with Package B", wouldSaveB);
		}
		else if (wouldSaveB != 0.0 && wouldSaveC != 0.0) {
			System.out.printf("Your monthly charge is: $%.2f", total);
			System.out.printf("\nYou would have saved: $%.2f with Package B", wouldSaveB);
			System.out.printf("\nYou would have saved: $%.2f with Package C", wouldSaveC);
		}
		else if (wouldSaveB == 0.0 && wouldSaveC != 0.0) {
			System.out.printf("Your monthly charge is: $%.2f", total);
			System.out.printf("\nYou would have saved: $%.2f with Package C", wouldSaveC);
		}
		else {
			System.out.printf("Your monthly charge is: $%.2f", total);
		}
		
		keyboard.close();
	}
}