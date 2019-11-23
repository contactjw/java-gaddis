package chapter4;
import java.util.Scanner;

public class BudgetAnalysis {
	public static void main(String[] args) {
		double monthlyBudget,
			   expense,
			   totalExpenses = 0.0;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter your monthly budget: $");
		monthlyBudget = keyboard.nextDouble();
		
		System.out.print("Enter an expense, or a negative value to end: $");
		expense = keyboard.nextDouble();
		
		while (expense >= 0) {
			totalExpenses += expense;
			System.out.print("Enter an expense, or a negative value to end: $");
			expense = keyboard.nextDouble();
		}
		
		if (monthlyBudget > totalExpenses)
			System.out.printf("You saved a total of $%,.2f", (monthlyBudget - totalExpenses));
		else
			System.out.printf("You lost a total of $%,.2f", (totalExpenses - monthlyBudget));

		keyboard.close();
	}
}
