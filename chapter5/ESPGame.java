<<<<<<< HEAD
// November 26, 2019
=======
>>>>>>> 3851348aa9416ff228497258374d9ce939138c9c
package chapter5;
import java.util.Scanner;
import java.util.Random;

public class ESPGame {
	public static void main(String[] args) {
		String computer,
			   player;
		int correct = 0;
		
		for (int i = 0; i < 10; i++) {
			computer = computerChoice();
			player = playerChoice();
			if (player.compareToIgnoreCase(computer) == 0) {
				correct++;
			}
			System.out.println("Computer chose: " + computer);
		}
		
		System.out.println("Number correct = " + correct);
		
	}
	
	public static String computerChoice() {
		Random rand = new Random();
		int computer = rand.nextInt(5);
		String color = "";
		switch (computer) {
			case 0:
				color = "Red";
				break;
			case 1:
				color = "Green";
				break;
			case 2:
				color = "Blue";
				break;
			case 3:
				color = "Orange";
				break;
			case 4:
				color = "Yellow";
				break;
		}
		return color;
	}
	
	public static String playerChoice() {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		String player;
		System.out.print("Guess the color the computer selected (red, green, blue, orange, yellow): ");
		player = keyboard.nextLine();
		while (!isValid(player)) {
			System.out.print("Enter a valid color (red, green, blue, orange, yellow): ");
			player = keyboard.nextLine();
		}
		return player;
	}
	
	public static boolean isValid(String color) {
		boolean isValid = true;
		
		switch(color.toLowerCase()) {
			case "red":
				isValid = true;
				break;
			case "green":
				isValid = true;
				break;
			case "blue":
				isValid = true;
				break;
			case "orange":
				isValid = true;
				break;
			case "yellow":
				isValid = true;
				break;
			default:
				isValid = false;
				break;
		}
		return isValid;
	}
}
