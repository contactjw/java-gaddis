package chapter6;
import java.util.Scanner;

public class RoulettePocketDemo {
	public static void main(String[] args) {
		int userNum;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a roulette number (0-36): ");
		userNum = keyboard.nextInt();
		while (userNum < 0 || userNum > 36) {
			System.out.print("Number must be between 0-36: ");
			userNum = keyboard.nextInt();
		}
		
		RoulettePocket pocket = new RoulettePocket(userNum);
		
		System.out.println(pocket.getPocketColor());
		
		keyboard.close();
	}
}
