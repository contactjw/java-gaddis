package chapter5;

public class ShowCharMethod {
	public static void main(String[] args) {
		showChar("New York", 2);
	}
	
	public static void showChar(String str, int pos) {
		System.out.println(str.charAt(pos));
	}
}
