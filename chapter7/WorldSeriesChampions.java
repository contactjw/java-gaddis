package chapter7;
import java.util.Scanner;
import java.io.*;

public class WorldSeriesChampions {

	public static void main(String[] args) throws IOException {
		int SIZE = getSize();
		String[] teams = new String[SIZE];
		
		loadData(teams);
		getTimesWon(teams);
		
	}
	
	public static int getSize() throws IOException{
		int size = 0;
		File inputFile = new File("WorldSeriesWinners.txt");
		Scanner input = new Scanner(inputFile);
		
		while (input.hasNext()) {
			input.nextLine();
			size++;
		}
		
		input.close();
		return size;
	}
	
	public static void loadData(String[] winner) throws IOException {
		int index = 0;
		File inputFile = new File("WorldSeriesWinners.txt");
		Scanner input = new Scanner(inputFile);
		
		while (input.hasNext()) {
			winner[index] = input.nextLine();
			index++;
		}
		input.close();
	}
	
	public static void getTimesWon(String[] winner) {
		int timesWon = 0;
		String teamName = "";
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the team name to check how many times they won the World Series: ");
		teamName = keyboard.nextLine();	
		
		for (int i = 0; i < winner.length; i++) {
			if (teamName.equalsIgnoreCase(winner[i]))
				timesWon++;
		}
		
		if (timesWon == 0)
			System.out.println("That team did not win any World Series.. or they do not exist.");
		else
			System.out.println(teamName + " have won the World Series " + timesWon + " times.");
		keyboard.close();
	}
}
