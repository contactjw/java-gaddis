package chapter10;

public class PassFailExam extends GradedActivity{
	private final int numQuestions = 10;
	private int questionsCorrect;
	
	PassFailExam() {
		questionsCorrect = 0;
	}
	
	PassFailExam(int c) {
		if (c > 10)
			questionsCorrect = 0;
		else
			questionsCorrect = c;
		
		double score = 0.0;
		score = ((double)questionsCorrect/numQuestions * 100.0);
		super.setScore(score);
	}
	
	public void setCorrect(int c) {
		if (c > 10)
			questionsCorrect = 0;
		else
			questionsCorrect = c;
		
		double score = 0.0;
		score = ((double)questionsCorrect/numQuestions * 100.0);
		super.setScore(score);
	}
	
	@Override
	public char getGrade() {
		if (super.getScore() >= 70)
			return 'P';
		else
			return 'F';
	}
	
}
