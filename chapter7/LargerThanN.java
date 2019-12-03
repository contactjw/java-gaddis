package chapter7;
import java.util.Scanner;

public class LargerThanN {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int[] myArray = new int[10];
		int largerValue;
		
		for (int i = 0; i < myArray.length; i++) {
			System.out.print("Enter a number: ");
			myArray[i] = keyboard.nextInt();
		}
		
		System.out.print("Enter the number you want larger than: ");
		largerValue = keyboard.nextInt();
		
		larger(myArray, largerValue);
		
		keyboard.close();
	}
	
	
	
	
	public static void larger(int[] arr, int n) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > n) {
				System.out.println(arr[i]);
			}
		}
	}
}
