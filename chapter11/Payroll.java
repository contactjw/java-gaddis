package chapter11;

public class Payroll {
	private String employeeName;
	private int idNumber;
	private double hourlyPay;
	private double hoursWorked;
	
	public Payroll() {
		employeeName = "";
		idNumber = 0;
		hourlyPay = 0.00;
		hoursWorked = 0;
	}
	
	public Payroll(String n, int i) throws InvalidStringException, InvalidNumberException{
		if (n == "") {
			throw new InvalidStringException();
		}
		employeeName = n;
		if (i <= 0)
			throw new InvalidNumberException(i);
		idNumber = i;
	}
	
	public void setEmployeeName(String n) throws InvalidStringException{
		if (n == "") {
			throw new InvalidStringException();
		}
		employeeName = n;
	}
	
	public void setIdNumber(int i) throws InvalidNumberException{
		if (i <= 0)
			throw new InvalidNumberException(i);
		idNumber = i;
	}
	
	public void setHourlyPay(double p) throws InvalidNumberException{
		if (p < 0 || p > 25.0)
			throw new InvalidNumberException(p);
		hourlyPay = p;
	}
	
	public void setHoursWorked(double h) throws InvalidNumberException{
		if (h < 0 || h > 84)
			throw new InvalidNumberException(h);
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