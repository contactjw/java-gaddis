package chapter11;

public class TestScoreDemo {

	public static void main(String[] args) {
		double[] scores = {95.6, 94.3, 96.5, 98.0, 104.3};
		double average = 0.0;
		
		try {
			TestScore newScores = new TestScore(scores);
			average = newScores.getAverage();
			System.out.println(average);
		}
		catch (InvalidTestScore e) {
			System.out.println(e);
		}
		
		
	}

}
