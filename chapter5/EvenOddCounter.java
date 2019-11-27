package chapter5;
import java.util.Random;

public class EvenOddCounter {
	public static void main(String[] args) {
		Random randomNumber = new Random();
		int totalEven = 0,
			totalOdd = 0;
		
		for (int i = 0; i < 100; i++) {
			int number = randomNumber.nextInt(1000) + 1;
			if (isEven(number)) {
				System.out.println(number + " is even.");
				totalEven++;
			}
			else {
				System.out.println(number + " is odd.");
				totalOdd++;
			}
		}
		
		System.out.println("Total Even Numbers: " + totalEven);
		System.out.println("Total Odd Numbers: " + totalOdd);
	}
	
	public static boolean isEven(int number) {
		boolean evenNumber = false;
		
		if (number % 2 == 0)
			evenNumber = true;
		
		return evenNumber;
	}
}
