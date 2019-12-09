package chapter8;
import java.util.Scanner;

public class CashRegisterDemo {

	public static void main(String[] args) {
		int quantity;
		
		RetailItem item1 = new RetailItem("Hammers", 10, 5.99);
		RetailItem item2 = new RetailItem("Nails", 10, 3.99);
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the quantity of hammers bought: ");
		quantity = keyboard.nextInt();
		CashRegister transaction1 = new CashRegister(item1, quantity);
		
		System.out.println("You bought " + quantity + " hammers for $5.99 each.");
		System.out.printf("Subtotal: $%.2f\n", transaction1.getSubtotal());
		System.out.printf("Sales Tax: $%.2f\n", transaction1.getTax());
		System.out.printf("Current total: $%.2f\n", transaction1.getTotal());
		System.out.println();
		
		System.out.print("Enter the quantity of nails bought: ");
		quantity = keyboard.nextInt();
		CashRegister transaction2 = new CashRegister(item2, quantity);
		
		System.out.println("You bought " + quantity + " nails for $3.99 each.");
		System.out.printf("Subtotal: $%.2f\n", transaction2.getSubtotal());
		System.out.printf("Sales Tax: $%.2f\n", transaction2.getTax());
		System.out.printf("Current total: $%.2f\n", (transaction2.getTotal() + transaction1.getTotal()));
		System.out.println();
		
		keyboard.close();
	}

}
