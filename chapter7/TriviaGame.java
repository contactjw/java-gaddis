package chapter7;
import java.util.Scanner;


// This class makes use of Question.java class
public class TriviaGame {
	public static void main(String[] args) {
		final int SIZE = 4;
		int player1Score = 0;
		int player2Score = 0;
		
		Question[] trivia = new Question[SIZE];
		for (int i = 0; i < SIZE; i++) {
			trivia[i] = new Question();
		}
		
		makeQuestions(trivia);
		player1Score = askQuestionSet1(trivia);
		player2Score = askQuestionSet2(trivia);
		
		
		if (player1Score > player2Score)
			System.out.println("\nPlayer1 has won the trivia game with " + player1Score + " points");
		else if (player2Score > player1Score)
			System.out.println("\nPlayer2 has won the trivia game with " + player2Score + " points");
		else
			System.out.println("\nYou have tied the trivia game!!");
		
	}
	
	public static void makeQuestions(Question[] q) {
		String input;
		int correct;
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		
		for (int i = 0; i < q.length; i++) {
			System.out.print("Enter question #" + (i + 1) + ": ");
			input = keyboard.nextLine();
			q[i].setQuestion(input);
			System.out.print("Enter choice A: ");
			input = keyboard.nextLine();
			q[i].setAnswer1(input);
			System.out.print("Enter choice B: ");
			input = keyboard.nextLine();
			q[i].setAnswer2(input);
			System.out.print("Enter choice C: ");
			input = keyboard.nextLine();
			q[i].setAnswer3(input);
			System.out.print("Enter choice D: ");
			input = keyboard.nextLine();
			q[i].setAnswer4(input);
			System.out.print("Enter the correct answer as an integer (1 = A, 2 = B...): ");
			correct = keyboard.nextInt();
			while (correct < 1 || correct > 4) {
				System.out.println("Correct answer must be an integer 1-4: ");
				correct = keyboard.nextInt();
			}
			q[i].setCorrectNumber(correct);
			keyboard.nextLine();
		}
	}
	
	public static int askQuestionSet1(Question[] q) {
		int size = (q.length / 2);
		int choice;
		int numCorrect = 0;
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		System.out.println();
		for (int i = 0; i < size; i++) {
			System.out.println("Player 1 Question #" + (i + 1) + ": " + q[i].getQuestion());
			System.out.println("1. " + q[i].getAnswer1());
			System.out.println("2. " + q[i].getAnswer2());
			System.out.println("3. " + q[i].getAnswer3());
			System.out.println("4. " + q[i].getAnswer4());
			System.out.print("Enter your choice (1-4): ");
			choice = keyboard.nextInt();
			while (choice < 1 || choice > 4) {
				System.out.print("Choice must be 1-4: ");
				choice = keyboard.nextInt();
			}
			System.out.println();
			if (choice == q[i].getCorrectNumber())
				numCorrect++;
		}
		return numCorrect;
	}
	
	public static int askQuestionSet2(Question[] q) {
		int start = (q.length / 2);
		int choice;
		int numCorrect = 0;
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		System.out.println();
		for (int i = start; i < q.length; i++) {
			System.out.println("Player 2 Question #" + (i + 1) + ": " + q[i].getQuestion());
			System.out.println("1. " + q[i].getAnswer1());
			System.out.println("2. " + q[i].getAnswer2());
			System.out.println("3. " + q[i].getAnswer3());
			System.out.println("4. " + q[i].getAnswer4());
			System.out.print("Enter your choice (1-4): ");
			choice = keyboard.nextInt();
			while (choice < 1 || choice > 4) {
				System.out.print("Choice must be 1-4: ");
				choice = keyboard.nextInt();
			}
			System.out.println();
			if (choice == q[i].getCorrectNumber())
				numCorrect++;
		}
		return numCorrect;
	}
	

}
