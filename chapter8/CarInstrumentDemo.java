package chapter8;

public class CarInstrumentDemo {

	public static void main(String[] args) {
		FuelGauge fuel = new FuelGauge(14);
		Odometer odometer = new Odometer(5000, fuel);
		
		fuel.getCurrentGallons();
		fuel.putFuel();
		fuel.getCurrentGallons();
		
		while (fuel.getCurrentGallons() > 0) {
			odometer.incrementMilesDriven();
			odometer.getCurrentMileage();
			System.out.println("Current Gallons: " + fuel.getCurrentGallons());
			System.out.println("------------------------------");

		}
		
	}

}
