package chapter9;

public class VowelsAndConsonants {
	private static int vowels;
	private static int consonants;
	
	public VowelsAndConsonants(String str) {
		String lower = str.toLowerCase();
		char[] letters = lower.toCharArray();
		
		for (int i = 0; i < letters.length; i++) {
			switch(letters[i]) {
			case 'a':
				vowels++;
				break;
			case 'b':
				consonants++;
				break;
			case 'c':
				consonants++;
				break;
			case 'd':
				consonants++;
				break;
			case 'e':
				vowels++;
				break;
			case 'f':
				consonants++;
				break;
			case 'g':
				consonants++;
				break;
			case 'h':
				consonants++;
				break;
			case 'i':
				vowels++;
				break;
			case 'j':
				consonants++;
				break;
			case 'k':
				consonants++;
				break;
			case 'l':
				consonants++;
				break;
			case 'm':
				consonants++;
				break;
			case 'n':
				consonants++;
				break;
			case 'o':
				vowels++;
				break;
			case 'p':
				consonants++;
				break;
			case 'q':
				consonants++;
				break;
			case 'r':
				consonants++;
				break;
			case 's':
				consonants++;
				break;
			case 't':
				consonants++;
				break;
			case 'u':
				vowels++;
				break;
			case 'v':
				consonants++;
				break;
			case 'w':
				consonants++;
				break;
			case 'x':
				consonants++;
				break;
			case 'y':
				vowels++;
				break;
			case 'z':
				consonants++;
				break;
			default:
				break;
			}
		}
	}
	
	public static int getVowels() {
		return vowels;
	}
	
	public static int getConsonants() {
		return consonants;
	}

}
