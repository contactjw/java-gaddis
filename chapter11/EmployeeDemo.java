package chapter11;

public class EmployeeDemo {
	public static void main(String[] args) {

		// Create a ProductionWorker object with valid data.
	      createWorker("John Smith", "123-A", "11-15-2009",
	                   1, 16.50);
	      
	      // Try to use an invalid employee number.
	      System.out.println("Attempting an invalid employee number...");
	      createWorker("John Smith", "1B0-3", "11-15-2009",
	                   1, 16.50);

	      // Try to use an invalid shift number.
	      System.out.println("Attempting an invalid shift number...");
	      createWorker("John Smith", "123-C", "11-15-2009",
	                   66, 16.50);

	      // Try to use a negative pay rate.
	      System.out.println("Attempting a negative pay rate...");
	      createWorker("John Smith", "123-H", "11-15-2009",
	                   1, -99.00);

	}

	public static void createWorker(String n, String num, String date, int sh, double rate) {
		ProductionWorker pw;

		try {
			pw = new ProductionWorker(n, num, date, sh, rate);

			System.out.println("Object created.");
			System.out.println(pw);
			
		} catch (InvalidEmployeeNumber e) {
			System.out.println(e.getMessage());
		} catch (InvalidShift e) {
			System.out.println(e.getMessage());
		} catch (InvalidPayRate e) {
			System.out.println(e.getMessage());
		}
		System.out.println();
	}
}
