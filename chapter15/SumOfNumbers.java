package chapter15;

public class SumOfNumbers {
	
	public static void main(String[] args) {
		
		
		System.out.println("The sum of numbers up to 5 is: " + sum(5));
		
	}
	
	public static int sum(int num) {
		if (num == 0)
			return 0;
		else
			return num + sum(num - 1);
	}

}
