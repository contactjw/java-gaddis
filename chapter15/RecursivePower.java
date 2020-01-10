package chapter15;

public class RecursivePower {
	
	public static void main(String[] args) {
		
		System.out.println("4 to the 2nd power is " + raise(4, 2));
	}
	
	public static int raise(int num, int pow) {
		if (pow == 0)
			return 1;
		else {
			return num * raise(num, pow - 1);
		}
	}
}
