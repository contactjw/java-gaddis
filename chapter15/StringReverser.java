package chapter15;

public class StringReverser {

	public static void main(String[] args) {
		String myString = "Hello World";
		
		reverseString(myString, myString.length());
		
	}
	
	public static void reverseString(String word, int pos) {
		if (pos == 0)
			return;
		else {
			System.out.print(word.charAt(pos - 1));
			reverseString(word, pos - 1);
		}
	}

}
