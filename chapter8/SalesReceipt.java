package chapter8;
import java.util.Scanner;
import java.io.*;

public class SalesReceipt {

	public static void main(String[] args) throws IOException{
		int quantity;
		
		RetailItem item1 = new RetailItem("Hammers", 10, 10.00);
		
		PrintWriter pwriter = new PrintWriter("Receipt.txt");
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the quantity of hammers bought: ");
		quantity = keyboard.nextInt();
		CashRegister transaction1 = new CashRegister(item1, quantity);
		
		pwriter.println("SALES RECEIPT");
		pwriter.printf("Unit Price: $%.2f\n", item1.getPrice());
		pwriter.println("Quantity: " + quantity);
		pwriter.printf("Subtotal: $%.2f\n", transaction1.getSubtotal());
		pwriter.printf("Sales Tax: $%.2f\n", transaction1.getTax());
		pwriter.printf("Total: $%.2f\n", transaction1.getTotal());
		
		System.out.println("Receipt printed to Receipt.txt");
		
		pwriter.close();
		keyboard.close();
	}

}
