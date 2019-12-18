package chapter10;

public class ShiftSupervisor extends Employee{
	private double annualSalary;
	private double annualBonus;
	
	public ShiftSupervisor() {
		annualSalary = 0.0;
		annualBonus = 0.0;
	}
	
	public ShiftSupervisor(double s, double b) {
		annualSalary = s;
		annualBonus = b;
	}
	
	public ShiftSupervisor(String n, String num, String hd, double s, double b) {
		super(n, num, hd);
		annualSalary = s;
		annualBonus = b;
	}
	
	public void setAnnualSalary(double s) {
		annualSalary = s;
	}
	
	public void setAnnualBonus(double b) {
		annualBonus = b;
	}
	
	public double getAnnualSalary() {
		return annualSalary;
	}
	
	public double getAnnualBonus() {
		return annualBonus;
	}
	
	public String toString() {
		String pay = String.format("\nAnnual Salary: $%,.2f\nAnnual Bonus: $%,.2f", annualSalary, annualBonus);
		String info =
				("Title: Shift Supervisor \n" + 
				 super.toString() + 
				 pay);
		return info;
	}

}
