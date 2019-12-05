package chapter7;
import java.io.*;
import java.util.Scanner;

public class NameSearch {
	public static void main(String[] args) throws IOException{
		String name = "";
		final int SIZE = 200;
		String[] boysNames = new String[SIZE];
		String[] girlsNames = new String[SIZE];
		
		File inputFile1 = new File("BoyNames.txt");
		File inputFile2 = new File("GirlNames.txt");
		
		Scanner input1 = new Scanner(inputFile1);
		Scanner input2 = new Scanner(inputFile2);
		Scanner keyboard = new Scanner(System.in);
		
		for(int i = 0; i < boysNames.length; i++)
			boysNames[i] = input1.nextLine();

		for(int i = 0; i < girlsNames.length; i++)
			girlsNames[i] = input2.nextLine();
		
		System.out.print("Enter a name and I'll show if it's popular: ");
		name = keyboard.nextLine();
		
		boolean isPopularGirl = false;
		boolean isPopularBoy = false;
		
		for(int i = 0; i < boysNames.length; i++) {
			if (name.equalsIgnoreCase(boysNames[i]))
			{
				isPopularBoy = true;
				break;
			}
		}
		
		for(int i = 0; i < girlsNames.length; i++) {
			if (name.equalsIgnoreCase(girlsNames[i]))
			{
				isPopularGirl = true;
				break;
			}
		}
		if (isPopularBoy)
			System.out.println("That is a popular boy name!");
		if (isPopularGirl)
			System.out.println("That is a popular girl name!");
		if (!isPopularBoy && !isPopularGirl)
			System.out.println("That is not a popular name");

		input1.close();
		input2.close();
		keyboard.close();
	}
}
