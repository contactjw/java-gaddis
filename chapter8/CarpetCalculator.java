package chapter8;
import java.util.Scanner;

public class CarpetCalculator {
	public static void main(String[] args) {
		int length,
		width;
		double price;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter the length of the room: ");
		length = keyboard.nextInt();
		System.out.print("Enter the width of the room: ");
		width = keyboard.nextInt();
		
		RoomDimension newRoom =  new RoomDimension(length, width);
		
		System.out.print("Enter the price per square foot of carpet: $");
		price = keyboard.nextDouble();
		
		RoomCarpet room = new RoomCarpet(newRoom, price);
		
		System.out.println(room);

		keyboard.close();
	}

}
