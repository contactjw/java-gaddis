package chapter10;

public class TeamLeader extends ProductionWorker{
	private double monthlyBonus;
	private int requiredTrainingHours;
	private int trainingHoursTaken;
	
	public TeamLeader() {
		monthlyBonus = 0.00;
		requiredTrainingHours = 90;
		trainingHoursTaken = 0;
	}
	
	public TeamLeader(String eName, String eNumber, String hDate, double hPay, double mBonus, int reqHours, int takenHours) {
		super(eName, eNumber, hDate);
		super.setHourlyPay(hPay);
		monthlyBonus = mBonus;
		requiredTrainingHours = reqHours;
		trainingHoursTaken = takenHours;
	}
	
	public TeamLeader(double mBonus, int reqHours, int takenHours) {
		monthlyBonus = mBonus;
		requiredTrainingHours = reqHours;
		trainingHoursTaken = takenHours;
	}
	
	public void setMonthlyBonus(double mBonus) {
		monthlyBonus = mBonus;
	}
	
	public void setRequiredTrainingHours(int reqHours) {
		requiredTrainingHours = reqHours;
	}
	
	public void setHoursTaken(int takenHours) {
		trainingHoursTaken = takenHours;
	}
	
	public double getMonthlyBonus() {
		return monthlyBonus;
	}
	
	public int getRequiredTrainingHours() {
		return requiredTrainingHours;
	}
	
	public int getHoursTaken() {
		return trainingHoursTaken;
	}
	
	public String toString() {
		String bonus = String.format("\nMonthly Bonus: $%,.2f", monthlyBonus);
		String info = ("Title: Team Leader\n" + super.toString() + 
					  bonus + "\nRequired Training Hours: " + requiredTrainingHours +
					  "\nTraining Hours Taken: " + trainingHoursTaken);
					  
		return info;
	}
	
}
