package chapter16;
import java.sql.*;
import java.util.Scanner;

public class CoffeePriceUpdater {

	public static void main(String[] args) {
		
		String prodNum;
		double price;
		
		final String DB_URL = "jdbc:derby:CoffeeDB";
		
		Scanner keyboard = new Scanner(System.in);
		
		try {
			
			Connection conn = DriverManager.getConnection(DB_URL);
			
			Statement stmt = conn.createStatement();
			
			System.out.print("Enter the product number: ");
			prodNum = keyboard.nextLine();
			
			if (findAndDisplayProduct(stmt, prodNum)) {
				
				System.out.print("Enter the new price: ");
				price = keyboard.nextDouble();
				
				updatePrice(stmt, prodNum, price);
			} else {
				System.out.println("That product was not found.");
			}
			
			conn.close();
			keyboard.close();
		} catch (Exception ex) {
			System.out.println("ERROR: " + ex.getMessage());
		}
		
	}
	
	public static boolean findAndDisplayProduct(Statement stmt, String prodNum) throws SQLException {
		boolean productFound;
		
		String sqlStatement = "SELECT * FROM Coffee WHERE ProdNum = '" + prodNum + "'";
		
		ResultSet result = stmt.executeQuery(sqlStatement);
		
		if (result.next()) {
			System.out.println("Description: " + result.getString("Description"));
			System.out.println("Product Number: " + result.getString("ProdNum"));
			System.out.println("Price: " + result.getDouble("Price"));
			
			productFound = true;
		} else {
			productFound = false;
		}
		
		return productFound;
				
	}
	
	public static void updatePrice(Statement stmt, String prodNum, double price) throws SQLException {
		
		String sqlStatement = "UPDATE Coffee SET Price = " + Double.toString(price) + "WHERE ProdNum = '" + prodNum + "'";
		
		int rows = stmt.executeUpdate(sqlStatement);
		
		System.out.println(rows + " row(s) updated.");
	}

}
