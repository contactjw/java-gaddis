package chapter8;

public class Odometer {
	private int currentMileage;
	private final int MAX_MILEAGE = 999999;
	private int keepTrack = 0;
	private FuelGauge fuelGauge;
	
	
	public Odometer(int miles, FuelGauge fg) {
		currentMileage = miles;
		fuelGauge = fg;
	}
	
	public void setCurrentMileage(int miles) {
		currentMileage = miles;
	}
	
	public void getCurrentMileage() {
		System.out.println("Current mileage: " + currentMileage);
	}
	
	public void incrementMilesDriven() {
		if (currentMileage == MAX_MILEAGE) {
			currentMileage = 0;
			keepTrack++;
			if (keepTrack == 24) {
				fuelGauge.decrementFuel();
				keepTrack = 0;
			}
		}
		else {
			currentMileage++;
			keepTrack++;
			if (keepTrack == 24) {
				fuelGauge.decrementFuel();
				keepTrack = 0;
			}
		}
	}
	
}
