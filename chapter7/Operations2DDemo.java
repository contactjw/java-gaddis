package chapter7;

public class Operations2DDemo {
	public static void main(String[] args) {
		int[][] intArray = {{3, 6, 9, 12, 1, 5},
							{4, 19, 3, 7, 32, 0}};
		
		double[][] doubleArray = {{9.0, 3.0, 5.0, 1.0, 6.0},
								  {12.0, 22.0, 54.0, 53.4, 12.4}};
		
		float[][] floatArray = {{1.2f, 4.3f, 3.4f, 9.0f},
								{12.4f, 16.3f, 23.4f, 19.5f}};
	
		Operations2D arrayCheck = new Operations2D();
		
		System.out.println("Integer Array Processing.");
		System.out.println("Total Value of Array: " + arrayCheck.getTotal(intArray));
		System.out.printf("Average of the Array: %.2f\n", arrayCheck.getAverage(intArray));
		System.out.println("Total Value of Row 1: " + arrayCheck.getRowTotal(intArray, 0));
		System.out.println("Total Value of Column 3: " + arrayCheck.getColumnTotal(intArray, 2));
		System.out.println("Highest Value in Row 2: " + arrayCheck.getHighestInRow(intArray, 1));
		System.out.println("Lowest Value in Row 1: " + arrayCheck.getLowestInRow(intArray, 0));

		System.out.println();
		System.out.println("Double Array Processing.");
		System.out.printf("Total Value of Array: %.2f\n", arrayCheck.getTotal(doubleArray));
		System.out.printf("Average of the Array: %.2f\n", arrayCheck.getAverage(doubleArray));
		System.out.printf("Total Value of Row 1: %.2f\n", arrayCheck.getRowTotal(doubleArray, 0));
		System.out.printf("Total Value of Column 3: %.2f\n", arrayCheck.getColumnTotal(doubleArray, 2));
		System.out.printf("Highest Value in Row 2: %.2f\n", arrayCheck.getHighestInRow(doubleArray, 1));
		System.out.printf("Lowest Value in Row 1: %.2f\n", arrayCheck.getLowestInRow(doubleArray, 0));
		
		System.out.println();
		System.out.println("Float Array Processing.");
		System.out.printf("Total Value of Array: %.2f\n", arrayCheck.getTotal(floatArray));
		System.out.printf("Average of the Array: %.2f\n", arrayCheck.getAverage(floatArray));
		System.out.printf("Total Value of Row 1: %.2f\n", arrayCheck.getRowTotal(floatArray, 0));
		System.out.printf("Total Value of Column 3: %.2f\n", arrayCheck.getColumnTotal(floatArray, 2));
		System.out.printf("Highest Value in Row 2: %.2f\n", arrayCheck.getHighestInRow(floatArray, 1));
		System.out.printf("Lowest Value in Row 1: %.2f\n", arrayCheck.getLowestInRow(floatArray, 0));
		
	}

}
