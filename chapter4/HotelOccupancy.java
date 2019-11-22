package chapter4;
import java.util.Scanner;

public class HotelOccupancy {
	public static void main(String[] args) {
		int numFloors,
			numRooms,
			numOccupied,
			totalRooms = 0,
			totalOccupied = 0;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the number of floors in the hotel: ");
		numFloors = keyboard.nextInt();
		
		while (numFloors < 1) {
			System.out.print("Number of floors must be greater than 0: ");
			numFloors = keyboard.nextInt();
		}
		
		for (int i = 0; i < numFloors; i++) {
			System.out.print("Enter the number of rooms on floor " + (i + 1) + ": ");
			numRooms = keyboard.nextInt();
			
			while (numRooms < 10) {
				System.out.print("Number of rooms per floor must be 10 or greater: ");
				numRooms = keyboard.nextInt();
			}
			totalRooms += numRooms;
			
			System.out.print("Enter the number of rooms occupied on floor " + (i + 1) + ": ");
			numOccupied = keyboard.nextInt();
			
			while (numOccupied > numRooms) {
				System.out.print("Number occupied cannot be greater than number of rooms: ");
				numOccupied = keyboard.nextInt();
			}
			totalOccupied += numOccupied;
		}
		
		double occupancyRate =  ((double)totalOccupied / totalRooms);
		
		System.out.println("\nTotal number of rooms: " + totalRooms);
		System.out.println("Total number of occupied rooms: " + totalOccupied);
		System.out.println("Total number of available rooms: " + (totalRooms - totalOccupied));
		System.out.printf("Occupancy rate: %.2f", (occupancyRate * 100));
		
		keyboard.close();
	}
}
