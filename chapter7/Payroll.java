package chapter7;

public class Payroll {
	private int[] employeeId = { 5658845, 4520125, 7895122, 8777541,
								 8451277, 1302850, 7580489 };
	private int[] hours = new int[7];
	private double[] payRate = new double[7];
	private double[] wages = new double[7];
	
	public void setHoursAt(int index, int h) {
		hours[index] = h;
	}
	
	public void setPayRateAt(int index, double p) {
		payRate[index] = p;
	}
	
	public int getIdAt(int index) {
		return employeeId[index];
	}
	
	public int getHoursAt(int index) {
		return hours[index];
	}
	
	public double getPayRateAt(int index) {
		return payRate[index];
	}
	
	public double getWagesAt(int index) {
		return wages[index];
	}
	
	public double getWages(int id) {
		double pay = 0.0;
		// loop to add values to wages.
		for (int i = 0; i < wages.length; i++) {
			wages[i] = hours[i] * payRate[i];
		}
		// Check for employee id.
		for (int i = 0; i < employeeId.length; i++) {
			if (id == employeeId[i])
				pay = wages[i];
		}
		
		return pay;
	}
}
