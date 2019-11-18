package chapter3;
import java.util.Scanner;

public class SortedNames {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		String name1,
			   name2,
			   name3;
		
		System.out.print("Enter name #1: ");
		name1 = keyboard.nextLine();
		
		System.out.print("Enter name #2: ");
		name2 = keyboard.nextLine();
		
		System.out.print("Enter name #3: ");
		name3 = keyboard.nextLine();
		
		if(name1.compareTo(name2) <= 0 && name1.compareTo(name3) <= 0) {
			System.out.println(name1);
			if (name2.compareTo(name3) < 0) {
				System.out.println(name2);
				System.out.println(name3);
			}
			else {
				System.out.println(name3);
				System.out.println(name2);
			}
		}
		else if(name2.compareTo(name1) <= 0 && name2.compareTo(name3) <= 0) {
			System.out.println(name2);
			if (name1.compareTo(name3) < 0) {
				System.out.println(name1);
				System.out.println(name3);
			}
			else {
				System.out.println(name3);
				System.out.println(name1);
			}
		}
		else if(name3.compareTo(name1) <= 0 && name3.compareTo(name2) <= 0) {
			System.out.println(name3);
			if (name1.compareTo(name2) < 0) {
				System.out.println(name1);
				System.out.println(name2);
			}
			else {
				System.out.println(name2);
				System.out.println(name1);
			}
		}
		keyboard.close();
	}
}
