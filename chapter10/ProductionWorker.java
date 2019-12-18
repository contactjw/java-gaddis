package chapter10;

public class ProductionWorker extends Employee {
	private int shift;
	private double hourlyPay;
	
	public ProductionWorker() {
		shift = 1;
		hourlyPay = 0.0;
	}
	
	public ProductionWorker(int s, double hp) {
		if (s < 1 || s > 2)
			shift = 1;
		else
			shift = s;
		
		hourlyPay = hp;
	}
	
	public ProductionWorker(String n, String num, String hd) {
		super(n, num, hd);
	}
	
	public ProductionWorker(String n, String num, String hd, int s, double hp) {
		super(n, num, hd);
		
		if (s < 1 || s > 2)
			shift = 1;
		else
			shift = s;
		
		hourlyPay = hp;
	}
	
	public void setShift(int s) {
		if (s < 1 || s > 2) {
			System.out.println("Invalid shift, setting shift to 1: Day Shift.");
			shift = 1;
		}
		else
			shift = s;
	}
	
	public void setHourlyPay(double hp) {
		hourlyPay = hp;
	}
	
	public int getShift() {
		return shift;
	}
	
	public double getHourlyPay() {
		return hourlyPay;
	}
	
	public String toString() {
		String shiftType = "";
		if (shift == 1)
			shiftType = "Day";
		else if (shift == 2)
			shiftType = "Night";
		String info = 
				(super.toString() +
				"\nShift: " + shiftType +
				"\nHourly Pay: $" + hourlyPay);
		return info;
	}
}
