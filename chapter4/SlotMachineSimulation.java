package chapter4;
import java.util.Scanner;
import java.util.Random;

public class SlotMachineSimulation {
	public static void main(String[] args) {
		double userWallet = 1.00,
			   amountEntered;
		int slotSymbol1,
			slotSymbol2,
			slotSymbol3;
		String continuePlaying = "yes",
			   slotWord1 = "",
			   slotWord2 = "",
			   slotWord3 = "";
		
		Scanner keyboard = new Scanner(System.in);
		Random randomInt = new Random();

		while (continuePlaying.compareToIgnoreCase("yes") == 0) {
			System.out.printf("User Wallet: $%,.2f\n", userWallet);
			System.out.print("Enter the amount of money to gamble: $");
			amountEntered = keyboard.nextDouble();
			while (amountEntered < 0.01 || amountEntered > userWallet) {
				System.out.print("Cannot enter a value of $0.00 or gamble " +
								 "more than you own: ");
				amountEntered = keyboard.nextDouble();
			}

			keyboard.nextLine();

			slotSymbol1 = randomInt.nextInt(6);
			slotSymbol2 = randomInt.nextInt(6);
			slotSymbol3 = randomInt.nextInt(6);

			switch (slotSymbol1) {
				case 0:
					slotWord1 = "Cherries";
					break;
				case 1:
					slotWord1 = "Oranges";
					break;
				case 2:
					slotWord1 = "Plums";
					break;
				case 3:
					slotWord1 = "Bells";
					break;
				case 4:
					slotWord1 = "Melons";
					break;
				case 5:
					slotWord1 = "Bars";
					break;
			}

			switch (slotSymbol2) {
				case 0:
					slotWord2 = "Cherries";
					break;
				case 1:
					slotWord2 = "Oranges";
					break;
				case 2:
					slotWord2 = "Plums";
					break;
				case 3:
					slotWord2 = "Bells";
					break;
				case 4:
					slotWord2 = "Melons";
					break;
				case 5:
					slotWord2 = "Bars";
					break;
			}

			switch (slotSymbol3) {
				case 0:
					slotWord3 = "Cherries";
					break;
				case 1:
					slotWord3 = "Oranges";
					break;
				case 2:
					slotWord3 = "Plums";
					break;
				case 3:
					slotWord3 = "Bells";
					break;
				case 4:
					slotWord3 = "Melons";
					break;
				case 5:
					slotWord3 = "Bars";
					break;
			}

			System.out.println("---------------------------");
			System.out.println("| " + slotWord1 + " | " + slotWord2 +
							   " | " + slotWord3 + " |");
			System.out.println("---------------------------");
			
			if (slotSymbol1 == slotSymbol2 && slotSymbol1 == slotSymbol3) {
				System.out.println("JACKPOT!!! TRIPLE WINNINGS!");
				amountEntered *= 3;
				userWallet += amountEntered;
			}
			else if (slotSymbol1 == slotSymbol2 && slotSymbol1 != slotSymbol3) {
				System.out.println("You won! Doubling amount!");
				amountEntered *= 2;
				userWallet += amountEntered;
			}
			else if (slotSymbol1 == slotSymbol3 && slotSymbol1 != slotSymbol2) {
				System.out.println("You won! Doubling amount!");
				amountEntered *= 2;
				userWallet += amountEntered;
			}
			else if (slotSymbol2 == slotSymbol3 && slotSymbol1 != slotSymbol2) {
				System.out.println("You won! Doubling amount!");
				amountEntered *= 2;
				userWallet += amountEntered;
			}
			else {
				System.out.println("You lost the amount entered.");
				userWallet -= amountEntered;
				if (userWallet == 0) {
					System.out.println("All of your money is gone..  Leaving slots.");
					System.exit(0);
				}
			}

			System.out.print("Play again? (Yes or No): ");
			continuePlaying = keyboard.nextLine();
			while (continuePlaying.compareToIgnoreCase("yes") != 0 &&
				   continuePlaying.compareToIgnoreCase("no") != 0) {
				System.out.print("Enter Yes or No: ");
				continuePlaying = keyboard.nextLine();
			}
		}
		
		System.out.printf("You walked away with $%.2f\n", userWallet);
		
		keyboard.close();
	}
}
