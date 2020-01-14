package chapter16;
import java.sql.*;

public class CoffeeMath {

	public static void main(String[] args) {
		
		double lowest = 0.0,
			   highest = 0.0,
			   average = 0.0;
		
		final String DB_URL = "jdbc:derby:CoffeeDB";
		
		try {
			
			Connection conn = DriverManager.getConnection(DB_URL);
			
			Statement stmt = conn.createStatement();
			
			String minStatement = "SELECT MIN(Price) FROM Coffee";
			String maxStatement = "SELECT MAX(Price) FROM Coffee";
			String avgStatement = "SELECT AVG(Price) FROM Coffee";
			
			ResultSet minResult = stmt.executeQuery(minStatement);
			if (minResult.next()) 
				lowest = minResult.getDouble(1);
			
			ResultSet maxResult = stmt.executeQuery(maxStatement);
			if (maxResult.next())
				highest = maxResult.getDouble(1);
			
			ResultSet avgResult = stmt.executeQuery(avgStatement);
			if (avgResult.next())
				average = avgResult.getDouble(1);
			
			
			System.out.printf("Lowest price: $%.2f\n", lowest);
			System.out.printf("Highest price: $%.2f\n", highest);
			System.out.printf("Average price: $%.2f\n", average);
			
			conn.close();
			
		} catch (Exception ex) {
			System.out.println("ERROR: " + ex.getMessage());
		}
	}
}
