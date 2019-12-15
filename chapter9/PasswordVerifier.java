package chapter9;

public class PasswordVerifier {
	
	public static boolean verifyPassword(String str) {
		boolean isProperLength = false;
		boolean containsUpper = false;
		boolean containsLower = false;
		boolean containsDigit = false;
		char[] pw = str.toCharArray();
		
		if (str.length() >= 6) {
			isProperLength = true;
		}
		for (int i = 0; i < str.length(); i++) {
			if (Character.isUpperCase(pw[i]))
				containsUpper = true;
			if (Character.isLowerCase(pw[i]))
				containsLower = true;
			if (Character.isDigit(pw[i]))
				containsDigit = true;
		}
		
		if (isProperLength && containsUpper && containsLower && containsDigit)
			return true;
		else
			return false;
	}
}
