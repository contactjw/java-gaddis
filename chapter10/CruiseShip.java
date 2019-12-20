package chapter10;

public class CruiseShip extends Ship{
	private int maxCapacity;
	
	public CruiseShip() {
		maxCapacity = 0;
	}
	
	public CruiseShip(int c) {
		maxCapacity = c;
	}
	
	public CruiseShip(String n, String b, int c) {
		super(n, b);
		maxCapacity = c;
	}
	
	public void setCapacity(int c) {
		maxCapacity = c;
	}
	
	public int getCapacity() {
		return maxCapacity;
	}
	
	@Override
	public String toString() {
		String info = super.getName() + "\nMax Capacity: " + maxCapacity;
		
		return info;
	}

}
