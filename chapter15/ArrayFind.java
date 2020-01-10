package chapter15;

public class ArrayFind {

	public static void main(String[] args) {
		int[] myArray = {1, 3, 5, 7, 9, 11};
		
		if (isMember(11, myArray, 0)) {
			System.out.println("Value is a member.");
		}
		else {
			System.out.println("Value not found.");
		}
	}

	
	public static boolean isMember(int val, int[] arr, int count) {
		if (arr[count] == val)
			return true;
		else {
			if (count >= arr.length - 1)
				return false;
			else
				return isMember(val, arr, count + 1);
		}
	}
}
