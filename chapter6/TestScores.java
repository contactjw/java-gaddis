package chapter6;

public class TestScores {
	private double score1,
				   score2,
				   score3;
	
	public TestScores() {
		score1 = 0.0;
		score2 = 0.0;
		score3 = 0.0;
	}
	
	public TestScores(double s1, double s2, double s3) {
		score1 = s1;
		score2 = s2;
		score3 = s3;
	}
	
	public void setScore1(double s) {
		score1 = s;
	}
	
	public void setScore2(double s) {
		score2 = s;
	}
	
	public void setScore3(double s) {
		score3 = s;
	}
	
	public double getScore1() {
		return score1;
	}
	
	public double getScore2() {
		return score2;
	}
	
	public double getScore3() {
		return score3;
	}
	
	public double getAverage() {
		return (score1 + score2 + score3) / 3.0;
	}
}
