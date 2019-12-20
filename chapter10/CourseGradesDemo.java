package chapter10;

public class CourseGradesDemo {

	public static void main(String[] args) {
		
		CourseGrades gradebook = new CourseGrades();
		
		Lab lab1 = new Lab(95.0);
		PassFailExam exam1 = new PassFailExam(9);
		Essay essay1 = new Essay(25, 15, 15, 25);
		FinalExam final1 = new FinalExam(42);
		GradedActivity lowestGrade = new GradedActivity();
		GradedActivity highestGrade = new GradedActivity();
		
		gradebook.setLab(lab1);
		gradebook.setPassFailExam(exam1);
		gradebook.setEssay(essay1);
		gradebook.setFinalExam(final1);
		
		highestGrade = gradebook.getHighest();
		lowestGrade = gradebook.getLowest();
		double averageScore = gradebook.getAverage();
		
		System.out.println(gradebook);
		
		System.out.println("\nHighest Score: " + highestGrade.getScore());
		System.out.println("Lowest Score: " + lowestGrade.getScore());
		System.out.printf("Average Score: %.2f\n", averageScore);
		
	}
}
