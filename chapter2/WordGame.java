package chapter2;
import java.util.Scanner;

public class WordGame {
	public static void main(String[] args) {
		String name,
			   city,
			   college,
			   profession,
			   animal,
			   petName;
		int age;
		
	Scanner keyboard = new Scanner(System.in);
	
	System.out.print("Enter your name: ");
	name = keyboard.nextLine();
	
	System.out.print("Enter your age: ");
	age = keyboard.nextInt();
	
	keyboard.nextLine();
	
	System.out.print("Enter a city name: ");
	city = keyboard.nextLine();
	
	System.out.print("Enter a college name: ");
	college = keyboard.nextLine();
	
	System.out.print("Enter a profession: ");
	profession = keyboard.nextLine();
	
	System.out.print("Enter a type of animal: ");
	animal = keyboard.nextLine();
	
	System.out.print("Enter a pet name: ");
	petName = keyboard.nextLine();
	
	System.out.println("\nThere once was a person named " + name + " who lived in " + city +
					   ". At the age of " + age + ",\n" + name + " went to college at " +
					   college + ". " + name + " graduated and went to work as a\n" +
					   profession + ". Then, " + name + " adopted a(n) " + animal +
					   " named " + petName + ". They both lived\nhappily ever after!");
	
	keyboard.close();
	}
}
