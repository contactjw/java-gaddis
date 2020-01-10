package chapter15;

public class LargestElement {

	public static void main(String[] args) {
		int[] myArray = {5, 12, 32, 43, 51, 1, 3, 92, 9, 23};
		int largest = Integer.MIN_VALUE;
		
		largest = maxElement(myArray, largest, 0);
		
		System.out.println("Largest element in the array is "  + largest);
		
	}
	
	public static int maxElement(int[] arr, int largest, int pos) {
		if (arr.length == 0) 
			return 0;
		if (pos == arr.length - 1)
			return largest;
		else {
			if (arr[pos] > largest) {
				largest = arr[pos];
				return maxElement(arr, largest, pos + 1);
			}
			else {
				return maxElement(arr, largest, pos + 1);
			}
		}
	}

}
