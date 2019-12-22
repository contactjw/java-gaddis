package chapter11;

public class TestScore {

	private double[] scoresArr;
	
	
	public TestScore(double[] scores) throws InvalidTestScore{
		scoresArr = scores;
		for (int i = 0; i < scoresArr.length; i++) {
			if (scoresArr[i] > 100 || scoresArr[i] < 0)
				throw new InvalidTestScore(i, scoresArr[i]);
		}
	}
	
	public double getAverage() {
		double average = 0.0;
		for (int i = 0; i < scoresArr.length; i++) {
			average += scoresArr[i];
		}
		return average / scoresArr.length;
	}
}
