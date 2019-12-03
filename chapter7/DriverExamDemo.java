package chapter7;

public class DriverExamDemo {
	public static void main(String[] args) {
		DriverExam myExam = new DriverExam();
		
		myExam.getStudentAnswers();
		
		if(myExam.getPassed()) {
			System.out.println("You passed with " + myExam.getTotalCorrect() + " correct out of 20.");
		}
		else {
			System.out.println("You failed with " + myExam.getTotalCorrect() + " correct out of 20.");
		}	

	}
}
