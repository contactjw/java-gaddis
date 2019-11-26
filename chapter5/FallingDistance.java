package chapter5;

public class FallingDistance {
	
	public static void main(String[] args) {
		System.out.println("Seconds\t\tFalling Distance (meters)");
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%4d\t\t%15.2f\n", i, fallingDistance(i));
		}
		
	}
	
	public static double fallingDistance(int seconds) {
		return ((1/2.0) * 9.8 * Math.pow(seconds, 2));
	}
}
