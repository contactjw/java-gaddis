package chapter3;
import java.util.Scanner;

public class SoftwareSales {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		final double PACKAGE_PRICE = 99.00;
		int packages;
		double discountPercent,
			   totalDiscount,
			   beforeDiscount,
			   afterDiscount;
		
		System.out.print("Enter the number of packages purchased: ");
		packages = keyboard.nextInt();
		
		if (packages < 10)
			discountPercent = 0.0;
		else if (packages <= 19)
			discountPercent = 0.20;
		else if (packages <= 49)
			discountPercent = 0.30;
		else if (packages <= 99)
			discountPercent = 0.40;
		else
			discountPercent = 0.50;
		
		beforeDiscount = PACKAGE_PRICE * packages;
		totalDiscount = beforeDiscount * discountPercent;
		afterDiscount = beforeDiscount - totalDiscount;
		
		System.out.println("Packages purchased: " + packages);
		System.out.println("Discount Bonus: " + (discountPercent * 100) + "%");
		System.out.printf("Price Before Discount: $%.2f\n", beforeDiscount);
		System.out.printf("Discount Removed: $%.2f\n", totalDiscount);
		System.out.printf("Total Cost After Discount: $%.2f\n", afterDiscount);
		
		keyboard.close();
	}
}
