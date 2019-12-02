package chapter6;
import java.util.Scanner;

public class FishingGame {
	public static void main(String[] args) {
		Die fish = new Die(6);
		String keepGoing = "yes";
		String cast = "";
		int fishingPoints = 0;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Would you like to cast a line out today? (yes or no): ");
		cast = keyboard.nextLine();
		System.out.println();
		if (cast.compareToIgnoreCase("no") == 0) {
			System.out.println("The boat leaves without you... goodbye!");
			System.exit(0);
		}
		
		while (keepGoing.compareToIgnoreCase("yes") == 0) {
			System.out.println("Casting out the line...\n");
			System.out.println("....nibble...nibble...\n");
			System.out.print("THE LINE JERKS AND YOU REEL IN...");
			fish.roll();
			if (fish.getValue() == 1) {
				System.out.println("A GOLIATH MEGALODON!! IT PULLS YOUR BOAT 30 MILES BEFORE BEING CAUGHT!");
				fishingPoints += 25;
			}
			else if (fish.getValue() == 2) {
				System.out.println("a soggy old boot...");
				fishingPoints -= 5;
			}
			else if (fish.getValue() == 3) {
				System.out.println("a gold fish... poor little guy.");
				fishingPoints += 5;
			}
			else if (fish.getValue() == 4) {
				System.out.println("a water snake, nearly missing getting bitten...!");
				fishingPoints -= 5;
			}
			else if (fish.getValue() == 5) {
				System.out.println("a large mouth bass!! What a large mouth that is!");
				fishingPoints += 10;
			}
			else {
				System.out.println("wait... woops looks like you caught old man bob's hat...!");
				fishingPoints -= 3;
			}
			System.out.println("\n----------------------------------");
			System.out.println("Total fishing points: " + fishingPoints);
			System.out.println("----------------------------------\n");
			System.out.print("Keep fishing? (yes or no): ");
			keepGoing = keyboard.nextLine();
			System.out.println();
		}
		
		if (fishingPoints >= 100) {
			System.out.println("*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*");
			System.out.println("*  You will go down in the Legendary fisherman hall of fame   *");
			System.out.println("*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*");
		}
		else if (fishingPoints > 75) {
			System.out.println("You will go down in the Amazing fisherman hall of fame.");
		}
		else if (fishingPoints > 50) {
			System.out.println("You will go down in the Great fisherman hall of fame.");
		}
		else if (fishingPoints > 25) {
			System.out.println("You will go down as an okay fisherman...");
		}
		else {
			System.out.println("You could use a bit of work on that cast...");
		}
		
		keyboard.close();
	}
}
