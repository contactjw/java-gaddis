package chapter11;

public class ProductionWorker extends Employee {
	private int shift;
	private double hourlyPay;
	
	public ProductionWorker() {
		shift = 1;
		hourlyPay = 0.0;
	}
	
	public ProductionWorker(int s, double hp) throws InvalidEmployeeNumber, InvalidShift, InvalidPayRate{
		if (s < 1 || s > 2) {
			shift = 1;
			throw new InvalidShift();
		}
		else
			shift = s;
		
		if (hp < 0) {
			hourlyPay = 0.0;
			throw new InvalidPayRate();
		}
		else
			hourlyPay = hp;
	}
	
	public ProductionWorker(String n, String num, String hd) throws InvalidEmployeeNumber{
		super(n, num, hd);
	}
	
	public ProductionWorker(String n, String num, String hd, int s, double hp) throws InvalidEmployeeNumber, InvalidShift, InvalidPayRate{
		super(n, num, hd);
		
		if (s < 1 || s > 2) {
			throw new InvalidShift();
		}
		else
			shift = s;
		
		if (hp < 0.0) {
			throw new InvalidPayRate();
		}
		else
			hourlyPay = hp;
	}
	
	public void setShift(int s) throws InvalidShift{
		if (s < 1 || s > 2) {
			throw new InvalidShift();
		}
		else
			shift = s;
	}
	
	public void setHourlyPay(double hp) throws InvalidPayRate {
		if (hp < 0) {
			throw new InvalidPayRate();
		}
		else
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
		
		String pay = String.format("\nHourly Pay: $%.2f", hourlyPay);
		String info = 
				(super.toString() +
				"\nShift: " + shiftType +
				pay);
		return info;
	}
}