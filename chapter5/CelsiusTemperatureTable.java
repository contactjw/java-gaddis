package chapter5;

public class CelsiusTemperatureTable {
	
	public static void main(String[] args) {
		System.out.println("Farenheit\t\tCelsius");
		for (int i = 0; i <= 20; i++) {
			System.out.printf("%5d\t\t\t%7.2f\n", i, celsius(i));
		}
	}
	
	public static double celsius(double farenheit) {
		return (5.0/9.0) * (farenheit - 32);
	}
	
}
