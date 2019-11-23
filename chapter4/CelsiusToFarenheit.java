package chapter4;

public class CelsiusToFarenheit {
	public static void main(String[] args) {
		double farenheit;
		
		System.out.println("Celsius\t\tFarenheit");
		for (int celsius = 0; celsius <= 20; celsius++) {
			farenheit = (9.0/5.0) * celsius + 32;
			System.out.printf("%d\t\t%.2f\n", celsius, farenheit);
		}
		
	}
}
