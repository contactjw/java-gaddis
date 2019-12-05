package chapter7;

public class Operations2D {
	
	public int getTotal(int[][] arr) {
		int tot = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				tot += arr[i][j];
			}
		}
		return tot;
	}
	
	public double getTotal(double[][] arr) {
		double tot = 0.0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				tot += arr[i][j];
			}
		}
		return tot;
	}
	
	public float getTotal(float[][] arr) {
		float tot = 0.0F;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				tot += arr[i][j];
			}
		}
		return tot;
	}
	
	public double getAverage(int[][] arr) {
		int tot = 0;
		int rows = arr.length;
		int cols = arr[0].length;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				tot += arr[i][j];
			}
		}
		return tot / (double)(rows * cols);
	}
	
	public double getAverage(double[][] arr) {
		double tot = 0.0;
		int rows = arr.length;
		int cols = arr[0].length;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				tot += arr[i][j];
			}
		}
		return tot / (double)(rows * cols);
	}
	
	public float getAverage(float[][] arr) {
		float tot = 0.0F;
		int rows = arr.length;
		int cols = arr[0].length;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				tot += arr[i][j];
			}
		}
		return tot / (float)(rows * cols);
	}
	
	public int getRowTotal(int[][] arr, int row) {
		int tot = 0;
		for (int i = 0; i < arr[row].length; i++) {
			tot += arr[row][i];
		}
		
		return tot;
	}
	
	public double getRowTotal(double[][] arr, int row) {
		double tot = 0.0;
		for (int i = 0; i < arr[row].length; i++) {
			tot += arr[row][i];
		}
		
		return tot;
	}
	
	public float getRowTotal(float[][] arr, int row) {
		float tot = 0.0f;
		for (int i = 0; i < arr[row].length; i++) {
			tot += arr[row][i];
		}
		
		return tot;
	}
	
	public int getColumnTotal(int[][] arr, int col) {
		int tot = 0;
		for (int i = 0; i < arr.length; i++) {
			tot += arr[i][col];
		}
		
		return tot;
	}
	
	public double getColumnTotal(double[][] arr, int col) {
		double tot = 0.0;
		for (int i = 0; i < arr.length; i++) {
			tot += arr[i][col];
		}
		
		return tot;
	}
	
	public float getColumnTotal(float[][] arr, int col) {
		float tot = 0.0f;
		for (int i = 0; i < arr.length; i++) {
			tot += arr[i][col];
		}
		
		return tot;
	}
	
	public int getHighestInRow(int[][] arr, int row) {
		int highest = arr[row][0];
		for (int i = 0; i < arr[row].length; i++) {
			if (arr[row][i] > highest)
				highest = arr[row][i];
		}
		
		return highest;
	}
	
	public double getHighestInRow(double[][] arr, int row) {
		double highest = arr[row][0];
		for (int i = 0; i < arr[row].length; i++) {
			if (arr[row][i] > highest)
				highest = arr[row][i];
		}
		
		return highest;
	}
	
	public float getHighestInRow(float[][] arr, int row) {
		float highest = arr[row][0];
		for (int i = 0; i < arr[row].length; i++) {
			if (arr[row][i] > highest) 
				highest = arr[row][i];
		}
		
		return highest;
	}
	
	public int getLowestInRow(int[][] arr, int row) {
		int lowest = arr[row][0];
		for (int i = 0; i < arr[row].length; i++) {
			if (arr[row][i] < lowest)
				lowest = arr[row][i];
		}
		
		return lowest;
	}
	
	public double getLowestInRow(double[][] arr, int row) {
		double lowest = arr[row][0];
		for (int i = 0; i < arr[row].length; i++) {
			if (arr[row][i] < lowest)
				lowest = arr[row][i];
		}
		
		return lowest;
	}
	
	public float getLowestInRow(float[][] arr, int row) {
		float lowest = arr[row][0];
		for (int i = 0; i < arr[row].length; i++) {
			if (arr[row][i] < lowest)
				lowest = arr[row][i];
		}
		
		return lowest;
	}
}
