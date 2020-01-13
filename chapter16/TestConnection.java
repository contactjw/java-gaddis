package chapter16;
import java.sql.*;

public class TestConnection {
	
	public static void main(String[] args) {
		
		final String DB_URL = "jdbc:derby:CoffeeDB";
		
		try {
			Connection conn = DriverManager.getConnection(DB_URL);
			System.out.println("Connection created to CoffeeDB");
			
			
			conn.close();
			System.out.println("Connection closed.");
		} catch (Exception ex) {
			System.out.println("ERROR: " + ex.getMessage());
		}
		
	}
}
