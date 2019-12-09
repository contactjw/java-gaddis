package chapter8;
import java.util.Scanner;

public class MonthDemo {

	public static void main(String[] args) {
		int mNum;
		
		Scanner keyboard = new Scanner(System.in);
		
		Month month1 = new Month("January");
		Month month2 = new Month(1);
		
		if (month1.equals(month2))
			System.out.println("These two months are equal!");
		else
			System.out.println("These two months are NOT equal.");
		
		Month month3 = new Month();
		Month month4 = new Month();
		
		System.out.print("Enter the number of month: ");
		mNum = keyboard.nextInt();
		month3.setMonth(mNum);
		
		System.out.print("Enter the number of the next month: ");
		mNum = keyboard.nextInt();
		month4.setMonth(mNum);
		
		if (month3.lessThan(month4)) {
			System.out.println(month3.getMonthName() + " comes before " + month4.getMonthName());
		}
		else
			System.out.println(month4.getMonthName() + " comes before " + month3.getMonthName());
		
		keyboard.close();
	}
}
