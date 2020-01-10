package chapter15;

public class AckermannFunction {

	public static void main(String[] args) {
		System.out.println(ackermann(0, 0));
		System.out.println(ackermann(0, 1));
		System.out.println(ackermann(1, 1));
		System.out.println(ackermann(1, 2));
		System.out.println(ackermann(1, 3));
		System.out.println(ackermann(2, 2));
		System.out.println(ackermann(3, 2));
	}
	
	
	public static int ackermann(int m, int n) {
		if (m == 0)
			return n + 1;
		else if (n == 0)
			return ackermann(m - 1, 1);
		else
			return ackermann(m - 1, ackermann(m, n - 1));
	}

}
