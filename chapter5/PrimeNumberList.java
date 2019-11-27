package chapter5;
import java.io.*;

public class PrimeNumberList {
	public static void main(String[] args) throws IOException{
		
		PrintWriter pWriter = new PrintWriter("PrimeNumbers.txt");
		
		for (int i = 1; i <= 100; i++) {
			if (isPrime(i))
				pWriter.println(i);
		}
		
		pWriter.close();
	}
	
	public static boolean isPrime(int number) {
		boolean isPrime = true;
		
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime = false;
				return isPrime;
			}
			else
				isPrime = true;
		}
		
		return isPrime;
	}
}
