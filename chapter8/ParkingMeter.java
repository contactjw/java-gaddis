package chapter8;

public class ParkingMeter {
	private int minutesPurchased;
	
	public ParkingMeter() {
		minutesPurchased = 0;
	}
	
	public ParkingMeter(int min) {
		minutesPurchased = min;
	}
	
	public ParkingMeter(ParkingMeter p) {
		this.minutesPurchased = p.minutesPurchased;
	}
	
	public void setMinutesPurchased(int min) {
		minutesPurchased = min;
	}
	
	public int getMinutesPurchased() {
		return minutesPurchased;
	}
}
