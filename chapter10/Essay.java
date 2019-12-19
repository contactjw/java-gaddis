package chapter10;

public class Essay extends GradedActivity{
	private final int GRAMMAR = 30;
	private final int SPELLING = 20;
	private final int LENGTH = 20;
	private final int CONTENT = 30;
	
	private int grammarScore;
	private int spellingScore;
	private int lengthScore;
	private int contentScore;
	
	public Essay() {
		grammarScore = 0;
		spellingScore = 0;
		lengthScore = 0;
		contentScore = 0;
	}
	
	public Essay(int g, int s, int l, int c) {
		if (g >= 0  && g <= GRAMMAR)
			grammarScore = g;
		else
			grammarScore = 0;
		
		if (s >= 0  && s <= SPELLING)
			spellingScore = s;
		else
			spellingScore = 0;
		
		if (l >= 0  && l <= LENGTH)
			lengthScore = l;
		else
			lengthScore = 0;
		
		if (c >= 0  && c <= CONTENT)
			contentScore = c;
		else
			contentScore = 0;
		
		
		super.setScore(grammarScore + spellingScore + lengthScore + contentScore);
	}
	
	public void setGrammarScore(int g) {
		if (g >= 0  && g <= GRAMMAR)
			grammarScore = g;
		else {
			System.out.println("Invalid score.");
			grammarScore = 0;
		}
		
		super.setScore(grammarScore + spellingScore + lengthScore + contentScore);

	}
	
	public void setSpellingScore(int s) {
		if (s >= 0  && s <= SPELLING)
			spellingScore = s;
		else {
			System.out.println("Invalid score.");
			spellingScore = 0;
		}	
		
		super.setScore(grammarScore + spellingScore + lengthScore + contentScore);

	}
	
	public void setLengthScore(int l) {
		if (l >= 0  && l <= LENGTH)
			lengthScore = l;
		else {
			System.out.println("Invalid score.");
			lengthScore = 0;
		}
		
		super.setScore(grammarScore + spellingScore + lengthScore + contentScore);

	}
	
	public void setContentScore(int c) {
		if (c >= 0  && c <= CONTENT)
			contentScore = c;
		else {
			System.out.println("Invalid score.");
			contentScore = 0;
		}	
		
		super.setScore(grammarScore + spellingScore + lengthScore + contentScore);

	}
	
	public int getGrammarScore() {
		return grammarScore;
	}
	
	public int getSpellingScore() {
		return spellingScore;
	}
	
	public int getLengthScore() {
		return lengthScore;
	}
	
	public int getContentScore() {
		return contentScore;
	}
	
	public void setScore() {
	}
	
	public String toString() {
		String info = ("Grammar Score: " + getGrammarScore() + "\nSpelling Score: " + getSpellingScore() +
					   "\nLength Score: " + getLengthScore() + "\nContent Score: " + getContentScore() + 
					   "\nFinal Score as a Percentage: " + super.getScore() + "\nFinal Letter Grade: " + super.getGrade());
		
		return info;
	}
	
}
