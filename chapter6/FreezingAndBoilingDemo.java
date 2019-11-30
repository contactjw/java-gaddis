package chapter6;
import java.util.Scanner;

public class FreezingAndBoilingDemo {
	public static void main(String[] args) {		
		int temperature;
		
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter a temperature: ");
		temperature = keyboard.nextInt();
		
		FreezingAndBoilingPoints temp1 = new FreezingAndBoilingPoints(temperature);
		
		if (temp1.isEthylFreezing())
			System.out.println("Ethyl Alcohol will freeze.");
		if (temp1.isEthylBoiling())
			System.out.println("Ethyl Alcohol will boil.");
		if (temp1.isOxygenFreezing())
			System.out.println("Oxygen will freeze.");
		if (temp1.isOxygenBoiling())
			System.out.println("Oxygen will boil.");
		if (temp1.isWaterFreezing())
			System.out.println("Water will freeze.");
		if (temp1.isWaterBoiling())
			System.out.println("Water will boil.");
		
		
		keyboard.close();
	}
}
