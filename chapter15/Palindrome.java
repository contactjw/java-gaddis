package chapter15;

public class Palindrome {

	public static void main(String[] args) {
		String myString = "balls";
		
		if (isPalindrome(myString, 0, (myString.length() - 1)))
			System.out.println(myString + " is a palindrome!");
		else
			System.out.println(myString + " is not a palindrome");
		
	}
	
	public static boolean isPalindrome(String word, int start, int end) {
		if (Character.toLowerCase(word.charAt(start)) != Character.toLowerCase(word.charAt(end)))
			return false;
		else {
			if (end == 0)
				return true;
			else
				return isPalindrome(word, start + 1, end - 1);
		}
	}

}
