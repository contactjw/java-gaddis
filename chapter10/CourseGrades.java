package chapter10;

public class CourseGrades implements Analyzable{
	private GradedActivity[] grades = new GradedActivity[4];
	
	public CourseGrades() {
		for (int i = 0; i < grades.length; i++) {
			grades[i] = new GradedActivity();
		}
	}
	
	public void setLab(GradedActivity lab) {
		grades[0] = lab;
	}
	
	public void setPassFailExam(GradedActivity pfExam) {
		grades[1] = pfExam;
	}
	
	public void setEssay(GradedActivity essay) {
		grades[2] = essay;
	}
	
	public void setFinalExam(GradedActivity finalExam) {
		grades[3] = finalExam;
	}
	
	public double getAverage() {
		double average = 0.0;
		for (int i = 0; i < grades.length; i++) {
			average += grades[i].getScore();
		}
		return (average / grades.length);
	}
	
	public GradedActivity getHighest() {
		int highestIndex = 0;
		for (int i = 0; i < grades.length; i++) {
			if (grades[i].getScore() > grades[highestIndex].getScore())
				highestIndex = i;
		}
		return grades[highestIndex];
	}
	
	public GradedActivity getLowest() {
		int lowestIndex = 0;
		for (int i = 0; i < grades.length; i++) {
			if (grades[i].getScore() < grades[lowestIndex].getScore())
				lowestIndex = i;
		}
		return grades[lowestIndex];
	}
	
	public String toString() {
		String info = ("Lab Score: " + grades[0].getScore() + "\nGrade: " + grades[0].getGrade() +
					   "\nPass/Fail Exam Score: " + grades[1].getScore() + "\nGrade:" + grades[1].getGrade() +
					   "\nEssay Score: " + grades[2].getScore() + "\nGrade: " + grades[2].getGrade() +
					   "\nFinal Exam: " + grades[3].getScore() + "\nGrade: " + grades[3].getGrade());
		
		return info;
	}
	
}
