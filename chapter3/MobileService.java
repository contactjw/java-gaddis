package chapter3;
import java.util.Scanner;

public class MobileService {
	public static void main(String[] args) {
		String servicePack;
		int minutes;
		double total = 0.0;
		
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
		}
		else if (servicePack.charAt(0) == 'B' || servicePack.charAt(0) == 'b') {
			total += 59.99;
			if (minutes > 900) {
				minutes -= 900;
				total += (minutes * 0.40);
			}
		}
		else if (servicePack.charAt(0) == 'C' || servicePack.charAt(0) == 'c') {
			total += 69.99;
		}
		
		if (total == 0.0) {
			System.out.println("Rerun program and enter a valid serice package...");
		}
		else {
			System.out.printf("Your monthly charge is: $%.2f", total);
		}
		
		keyboard.close();
	}
}
