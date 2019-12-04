package chapter7;

public class ArrayOperations {
	public static void main(String[] args) {
		int[] arr = {10, 30, 25, 36, 50, 85, 93, 23, 43, 54,12, 42, 65, 53, 23,
					 53, 23, 12, 1, 5, 9, 91, 12, 34, 59, 92, 4};
		
		double[] arr1 = {2.2, 9.9, 23.43, 69.23, 54.5, 45.3, 34.0};
		
		System.out.println("Integer Array Processing...");
		System.out.printf("Total of Array: %d\n", getTotal(arr));
		System.out.printf("Average of Array: %.2f\n", getAverage(arr));
		System.out.printf("Highest Value in Array: %d\n", getHighest(arr));
		System.out.printf("Lowest in Array: %d\n\n", getLowest(arr));
		
		System.out.println("Double Array Processing...");
		System.out.printf("Total of Array: %.2f\n", getTotal(arr1));
		System.out.printf("Average of Array: %.2f\n", getAverage(arr1));
		System.out.printf("Highest Value in Array: %.2f\n", getHighest(arr1));
		System.out.printf("Lowest in Array: %.2f\n", getLowest(arr1));
		
	}
	
	public static int getTotal(int[] a) {
		int total = 0;
		for (int i = 0; i < a.length; i++) {
			total += a[i];
		}
		return total;
	}
	
	public static double getTotal(double[] a) {
		double total = 0.0;
		for (int i = 0; i < a.length; i++) {
			total += a[i];
		}
		return total;
	}
	
	public static double getAverage(int[] a) {
		double average = 0.0;
		for (int i = 0; i < a.length; i++) {
			average += a[i];
		}
		average /= (double)a.length;
		return average;
	}
	
	public static double getAverage(double[] a) {
		double average = 0.0;
		for (int i = 0; i < a.length; i++) {
			average += a[i];
		}
		average /= (double)a.length;
		return average;
	}
	
	public static int getHighest(int[] a) {
		int highest = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > highest)
				highest = a[i];
		}
		return highest;
	}
	
	public static double getHighest(double[] a) {
		double highest = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > highest)
				highest = a[i];
		}
		return highest;
	}
	
	public static int getLowest(int[] a) {
		int lowest = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] < lowest)
				lowest = a[i];
		}
		return lowest;
	}
	
	public static double getLowest(double[] a) {
		double lowest = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] < lowest)
				lowest = a[i];
		}
		return lowest;
	}
}
