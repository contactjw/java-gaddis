package chapter7;

public class Grades {
	private String[] names = new String[5];
	private char[] letterGrade = new char[5];
	private double[] student1Scores = new double[4];
	private double[] student2Scores = new double[4];
	private double[] student3Scores = new double[4];
	private double[] student4Scores = new double[4];
	private double[] student5Scores = new double[4];
	
	public void setStudentName(int index, String n) {
		names[index] = n;
	}
	
	public String getStudentName(int index) {
		return names[index];
	}
	
	public void setStudentScores(int index, double[] g) {
		if (index == 0) {
			copyGrades(student1Scores, g);
		}
		else if (index == 1) {
			copyGrades(student2Scores, g);
		}
		else if (index == 2) {
			copyGrades(student3Scores, g);
		}
		else if (index == 3) {
			copyGrades(student4Scores, g);
		}
		else if (index == 4) {
			copyGrades(student5Scores, g);
		}
	}
	
	private void copyGrades(double[] to, double[] from) {
		for (int i = 0; i < to.length; i++) {
			to[i] = from[i];
		}
	}
	
	public double getAverageScore(int index) {
		double average = 0.0;
		if (index == 0) {
			average = calcAverage(student1Scores);
			setLetterGrade(index, average);
			return average;
		}
		else if (index == 1) {
			average = calcAverage(student2Scores);
			setLetterGrade(index, average);
			return average;
		}
		else if (index == 2) {
			average = calcAverage(student3Scores);
			setLetterGrade(index, average);
			return average;
		}
		else if (index == 3) {
			average = calcAverage(student4Scores);
			setLetterGrade(index, average);
			return average;
		}
		else if (index == 4) {
			average = calcAverage(student5Scores);
			setLetterGrade(index, average);
			return average;
		}
		else {
			System.out.println("Enter an index between 0 and 4: ");
			return 0.0;
		}
	}
	
	private double calcAverage(double[] scores) {
		double average = 0.0;
		for (int i = 0; i < scores.length; i++) {
			average += scores[i];
		}
		average /= 4.0;
		return average;
	}
	
	private void setLetterGrade(int index, double average) {
		if (average > 90)
			letterGrade[index] = 'A';
		else if (average > 80)
			letterGrade[index] = 'B';
		else if (average > 70)
			letterGrade[index] = 'C';
		else if (average > 60)
			letterGrade[index] = 'D';
		else
			letterGrade[index] = 'F';
	}
	
	public char getLetterGrade(int index) {
		return letterGrade[index];
	}
}
