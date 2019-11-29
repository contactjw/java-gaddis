package chapter6;

public class Payroll {
	private String employeeName;
	private int idNumber;
	private double hourlyPay;
	private double hoursWorked;
	
	public Payroll(String n, int i) {
		employeeName = n;
		idNumber = i;
	}
	
	public void setEmployeeName(String n) {
		employeeName = n;
	}
	
	public void setIdNumber(int i) {
		idNumber = i;
	}
	
	public void setHourlyPay(double p) {
		hourlyPay = p;
	}
	
	public void setHoursWorked(double h) {
		hoursWorked = h;
	}
	
	public String getEmployeeName() {
		return employeeName;
	}
	
	public int getIdNumber() {
		return idNumber;
	}
	
	public double getHourlyPay() {
		return hourlyPay;
	}
	
	public double getHoursWorked() {
		return hoursWorked;
	}
	
	public double getGrossPay() {
		return hoursWorked * hourlyPay;
	}
	
}
