package chapter16;
import java.sql.*;
import java.util.Scanner;

public class CoffeeMinPrice {

	public static void main(String[] args) {
		
		double minPrice;
		int coffeeCount = 0;
		
		final String DB_URL = "jdbc:derby:CoffeeDB";
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the minimum price: ");
		minPrice = keyboard.nextDouble();
		
		try {
			
			Connection conn = DriverManager.getConnection(DB_URL);
			
			Statement stmt = conn.createStatement();
			
			String sqlStatement = "SELECT * FROM Coffee WHERE Price >= " + Double.toString(minPrice);
			
			ResultSet result = stmt.executeQuery(sqlStatement);
			
			while (result.next()) {
				System.out.printf("%25s %10s %5.2f\n", result.getString("Description"),
													   result.getString("ProdNum"),
													   result.getDouble("Price"));
				
				coffeeCount++;
			}
			
			System.out.println(coffeeCount + " coffees found.");
			
			keyboard.close();
			conn.close();
		} catch (Exception ex) {
			System.out.println("ERROR: " + ex.getMessage());
		}
	}

}
