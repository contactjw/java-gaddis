package chapter6;

public class TestScoresDemo {
	public static void main(String[] args) {
		TestScores tests = new TestScores();
		
		tests.setScore1(94.5);
		tests.setScore2(96.5);
		tests.setScore3(86.5);
		
		System.out.println("Test Score Results");
		System.out.printf("Score #1: %.2f", tests.getScore1());
		System.out.printf("\nScore #2: %.2f", tests.getScore2());
		System.out.printf("\nScore #3: %.2f", tests.getScore3());
		System.out.printf("\nAverage Score: %.2f", tests.getAverage());
	}
}
