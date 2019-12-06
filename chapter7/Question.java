package chapter7;

public class Question {
	private String question;
	private String answer1;
	private String answer2;
	private String answer3;
	private String answer4;
	int correctChoice;
	
	public Question() {
		question = "";
		answer1 = "";
		answer2 = "";
		answer3 = "";
		answer4 = "";
		correctChoice = 0;
	}
	
	public Question(String q, String a1, String a2, String a3, String a4, int c) {
		question = q;
		answer1 = a1;
		answer2 = a2; 
		answer3 = a3;
		answer4 = a4;
		correctChoice = c;
	}
	
	public void setQuestion(String q) {
		question = q;
	}
	
	public String getQuestion() {
		return question;
	}
	
	public void setAnswer1(String a1) {
		answer1 = a1;
	}
	
	public String getAnswer1() {
		return answer1;
	}
	
	public void setAnswer2(String a2) {
		answer2 = a2;
	}
	
	public String getAnswer2() {
		return answer2;
	}
	
	public void setAnswer3(String a3) {
		answer3 = a3;
	}
	
	public String getAnswer3() {
		return answer3;
	}
	
	public void setAnswer4(String a4) {
		answer4 = a4;
	}
	
	public String getAnswer4() {
		return answer4;
	}
	
	public void setCorrectNumber(int c) {
		correctChoice = c;
	}
	
	public int getCorrectNumber() {
		return correctChoice;
	}
	
}
