package chapter10;

public class FinalExam extends GradedActivity{
	private final int numQuestions = 50;
	private int numCorrect;
	
	public FinalExam() {
		numCorrect = 0;
	}
	
	public FinalExam(int c) {
		numCorrect = c;
		
		super.setScore((double)numCorrect / numQuestions * 100.0);
	}
	
	public void setNumCorrect(int c) {
		numCorrect = c;
		
		super.setScore((double)numCorrect / numQuestions * 100.0);
	}
	
}
