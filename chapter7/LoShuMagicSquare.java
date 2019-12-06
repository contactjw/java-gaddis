package chapter7;

public class LoShuMagicSquare {

	public static void main(String[] args) {
		int[][] array1 = {{4, 9, 2},
						  {3, 5, 7},
						  {8, 1, 6}};
		int[][] array2 = {{5, 4, 3},
						  {2, 1, 9},
						  {8, 7, 6}};
		
		if (testIfMagic(array1))
			System.out.println("Array1 is magical!");
		else
			System.out.println("Array1 is not magical...");
		
		if (testIfMagic(array2))
			System.out.println("Array2 is magical!");
		else
			System.out.println("Array2 is not magical...");
	}

	public static boolean testIfMagic(int[][] arr) {
		boolean isMagic = true;
		int sectionTotal = 15;
		int total;
		
		// Check if each row equals the same number.
		for (int i = 0; i < arr.length; i++) {
			total = 0;
			for (int j = 0; j < arr[i].length; j++) {
				total += arr[i][j];
			}
			if (!(total == sectionTotal))
				isMagic = false;
		}
		
		// Check if each column equals the same number.
		for (int i = 0; i < arr.length; i++) {
			total = 0;
			for (int j = 0; j < arr[i].length; j++) {
				total += arr[j][i];
			}
			if (!(total == sectionTotal))
				isMagic = false;
		}
		
		// Check if each diagonal equals the same number.
		total = 0;
		for (int i = 0, j = 0; i < arr.length; i++, j++) {
			total += arr[i][j];
		}
		if (!(total == sectionTotal))
			isMagic = false;
		
		// Check if each diagonal equals the same number.
		total = 0;
		for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
			total += arr[i][j];
		}
		if (!(total == sectionTotal))
			isMagic = false;
		
		return isMagic;
	}
}
