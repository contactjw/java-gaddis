package chapter6;

public class CarDemo {
	public static void main(String[] args) {
		Car myCar = new Car(2014, "Ferrari");
		
		System.out.println("Displaying speed of my " + myCar.getYearModel() + " " + myCar.getMake());
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Accelerating...");
			myCar.accelerate();
			System.out.println("Current speed: " + myCar.getSpeed());
		}
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Braking...");
			myCar.brake();
			System.out.println("Current speed: " + myCar.getSpeed());
		}
		
	}
}
