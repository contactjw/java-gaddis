package chapter9;

public class StringOperations {
	
	public static int wordCount(String str) {
		String[] tokens = str.split(" ");
		return tokens.length;
	}
	
	public static String arrayToString(char[] arr) {
		StringBuilder val = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			val.append(arr[i]);
		}
		return val.toString();
	}
	
	public static char mostFrequent(String str) {
		char[] chars = str.toCharArray();
		int[] frequencies = new int[chars.length];
		
		for (int i = 0; i < frequencies.length; i++)
			frequencies[i] = 0;
		
		for (int i = 0; i < chars.length; i++) {
			for (int j = 0; j < chars.length; j++) {
				if (chars[j] == ' ') {
					continue;
				}
				if (chars[j] == chars[i]) {
					frequencies[i]++;
				}
			}
		}
		
		int mostFrequentIndex = 0;
		for (int i = 0; i < frequencies.length; i++) {
			if (frequencies[i] > frequencies[mostFrequentIndex])
				mostFrequentIndex = i;
		}
		
		return chars[mostFrequentIndex];
	}
	
	public static String replaceSubstring(String str1, String str2, String str3) {
		int index = 0;
		
		StringBuilder newString = new StringBuilder(str1);
		
		index = newString.indexOf(str2);
		
		while (index != -1) {
			newString.replace(index, index + str2.length(), str3);
			
			index = newString.indexOf(str2);
		}
		
		return newString.toString();
	}
	
}
