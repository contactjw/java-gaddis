package chapter10;

public class CourseGradesDemo {

	public static void main(String[] args) {
		
		CourseGrades gradebook = new CourseGrades();
		
		Lab lab1 = new Lab(95.0);
		PassFailExam exam1 = new PassFailExam(9);
		Essay essay1 = new Essay(25, 15, 15, 25);
		FinalExam final1 = new FinalExam(42);
		
		gradebook.setLab(lab1);
		gradebook.setPassFailExam(exam1);
		gradebook.setEssay(essay1);
		gradebook.setFinalExam(final1);
		
		System.out.println(gradebook);
		
	}

}
