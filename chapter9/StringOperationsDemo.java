package chapter9;

public class StringOperationsDemo {

	public static void main(String[] args) {
				
		String myString = "Hello in this sentence I am replacing I with me.";
		String changedString;
		
		changedString = StringOperations.replaceSubstring(myString, "I", "me");
		System.out.println(changedString);
		System.out.println("Most frequent letter is: " + StringOperations.mostFrequent(changedString));
	}

}
