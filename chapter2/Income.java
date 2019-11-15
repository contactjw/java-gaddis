package chapter2;
import java.util.Scanner;

public class Income {
	public static void main(String[] args) {
		String name;
		int age;
		double annualPay;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		name = keyboard.nextLine();
		
		System.out.print("Enter your age: ");
		age = keyboard.nextInt();
		
		System.out.print("Enter your annual income: ");
		annualPay = keyboard.nextDouble();
		
		System.out.println("My name is " + name + ", my age is "
						   + age + " and\nI hope to earn " + annualPay
						   + " per year.");
		
		keyboard.close();
	}
}
