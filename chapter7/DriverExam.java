package chapter7;
import java.util.Scanner;

public class DriverExam {
	private char[] correctAnswers = {'B', 'D', 'A', 'A', 'C',
									 'A', 'B', 'A', 'C', 'D',
									 'B', 'C', 'D', 'A', 'D',
									 'C', 'C', 'B', 'D', 'A'};
	private char[] studentAnswers = new char[20];
	private boolean passed;
	private int totalCorrect;
	private int totalIncorrect;
	private int questionsMissed;
	
	public void getStudentAnswers() {
		Scanner keyboard = new Scanner(System.in);
		String answer;
		for (int i = 0; i < studentAnswers.length; i++) {
			System.out.print("Enter the answer (A, B, C, or D) for question #" + (i + 1) + ": ");
			answer = keyboard.nextLine();
			studentAnswers[i] = answer.charAt(0);
			while ((int)studentAnswers[i] < 65 || (int)studentAnswers[i] > 68) {
				System.out.println("Enter either A, B, C, or D: ");
				answer = keyboard.nextLine();
				studentAnswers[i] = answer.charAt(0);
			}
		}
		keyboard.close();
		checkAnswers();
	}
	
	private void checkAnswers() {
		for (int i = 0; i < correctAnswers.length; i++) {
			if (studentAnswers[i] == correctAnswers[i])
				totalCorrect++;
			else
				totalIncorrect++;
		}
	}
	
	public int getTotalCorrect() {
		return totalCorrect;
	}
	
	public int getTotalIncorrect() {
		return totalIncorrect;
	}
	
	public int getQuestionsMissed() {
		return questionsMissed;
	}
	
	public boolean getPassed() {
		if (totalCorrect >= 15)
			passed = true;
		else
			passed = false;
		
		return passed;
	}
	
}
