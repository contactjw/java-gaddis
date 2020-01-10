package chapter15;

public class RecursiveMultiplication {

	public static void main(String[] args) {
		int val = mult(3, 6, 0);
		
		System.out.println(val);
		
		
	}
	
	public static int mult(int a, int b, int count) {
		if (count == a) {
			return 0;
		}
		
		return  b + mult(a, b, (count + 1));
	}

}
