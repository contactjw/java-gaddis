package chapter10;

public class CargoShip extends Ship{
	private int maxWeight; // In Tons
	
	public CargoShip() {
		maxWeight = 0;
	}
	
	public CargoShip(int t) {
		maxWeight = t;
	}
	
	public CargoShip(String n, String b, int t) {
		super(n, b);
		maxWeight = t;
	}
	
	public void setMaxWeight(int t) {
		maxWeight = t;
	}
	
	public int getMaxWeight() {
		return maxWeight;
	}
	
	@Override
	public String toString() {
		String info = super.getName() + "\nMax Weight in Tons: " + maxWeight;
		
		return info;
	}
	
}
