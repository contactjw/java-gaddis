package chapter7;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Magic8Ball {
	ArrayList<String> answers = new ArrayList<String>();
	
	public Magic8Ball() throws IOException{
		File inputFile = new File("8_ball_responses.txt");
		@SuppressWarnings("resource")
		Scanner input = new Scanner(inputFile);
		
		while (input.hasNext()) {
			answers.add(input.nextLine());
		}
		
	}
	
	public void getResponse(String q) {
		Random rand = new Random();
		int number = rand.nextInt(12);
		
		switch (number) {
			case 0:
				System.out.println(answers.get(number));
				break;
			case 1:
				System.out.println(answers.get(number));
				break;
			case 2:
				System.out.println(answers.get(number));
				break;
			case 3:
				System.out.println(answers.get(number));
				break;
			case 4:
				System.out.println(answers.get(number));
				break;
			case 5:
				System.out.println(answers.get(number));
				break;
			case 6:
				System.out.println(answers.get(number));
				break;
			case 7:
				System.out.println(answers.get(number));
				break;
			case 8:
				System.out.println(answers.get(number));
				break;
			case 9:
				System.out.println(answers.get(number));
				break;
			case 10:
				System.out.println(answers.get(number));
				break;
			case 11:
				System.out.println(answers.get(number));
				break;
		}
	}
}
