package chapter11;
import java.io.Serializable;

@SuppressWarnings("serial")
public class TestScoreSerial implements Serializable{

	private double[] scoresArr;
	
	public TestScoreSerial(double[] scores) throws IllegalArgumentException{
		scoresArr = new double[scores.length];
		for (int i = 0; i < scoresArr.length; i++) {
			if (scoresArr[i] > 100 || scoresArr[i] < 0)
				throw new IllegalArgumentException("Element: " + i + " Score: " + scoresArr[i]);
			else
				scoresArr[i] = scores[i];
		}
	}
	
	public double getAverage() {
		double average = 0.0;
		for (int i = 0; i < scoresArr.length; i++) {
			average += scoresArr[i];
		}
		return average / scoresArr.length;
	}
	
	public String toString() {
		String info = "Score 1: " + scoresArr[0] + "\nScore 2: " + scoresArr[1] + "\nScore 3: " + scoresArr[2];
		
		return info;
	}
}
