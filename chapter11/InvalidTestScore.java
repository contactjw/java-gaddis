package chapter11;

@SuppressWarnings("serial")
public class InvalidTestScore extends Exception{
	public InvalidTestScore() {
		super("Invalid test score.");
	}
	
	public InvalidTestScore(int element, double score) {
		super("Element: " + element + " invalid score: " + score);
	}
	
}
