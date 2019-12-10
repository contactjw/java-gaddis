package chapter8;

public class FuelGauge {
	private int currentGallons;
	private final int MAX_GALLONS = 15;
	
	public FuelGauge() {
		currentGallons = 0;
	}
	
	public FuelGauge(int gallons) {
		if (gallons <= MAX_GALLONS)
			currentGallons = gallons;
		else
			currentGallons = MAX_GALLONS;
	}
	
	public void setCurrentGallons(int gallons) {
		currentGallons = gallons;
	}
	
	public int getCurrentGallons() {
		return currentGallons;
	}
	
	public void putFuel() {
		if (currentGallons < MAX_GALLONS)
			currentGallons++;
		else
			System.out.println("Car is full on gas.");
	}
	
	public void decrementFuel() {
		if (currentGallons > 0)
			currentGallons--;
		else
			System.out.println("Car is currently out of gas...");
	}
	
}
