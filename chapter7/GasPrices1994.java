package chapter7;
import java.io.*;
import java.util.Scanner;

public class GasPrices1994 {
	public static void main(String[] args) throws IOException{
		
		double[][] months = new double[12][13];

		loadData(months);
		
		for (int i = 0; i < months.length; i++) {
			for (int j = 0; j < months[i].length; j++) {
				System.out.println(months[i][j]);
			}
		}
		
	}
	
	public static void loadData(double[][] m) throws IOException{
		File file = new File("1994_Weekly_Gas_Averages.txt");
		Scanner inputFile = new Scanner(file);
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = inputFile.nextDouble();
			}
		}
	}
	
}
