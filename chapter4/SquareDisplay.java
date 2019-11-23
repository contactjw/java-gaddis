package chapter4;
import java.util.Scanner;

public class SquareDisplay {
	public static void main(String[] args) {
		int size;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the size of the square: ");
		size = keyboard.nextInt();
		
		while (size < 1 || size > 15) {
			System.out.print("Size must be between 1 and 15: ");
			size = keyboard.nextInt();
		}
		
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++)
				System.out.print("X");
			System.out.println();
		}
		
		keyboard.close();
	}
}
