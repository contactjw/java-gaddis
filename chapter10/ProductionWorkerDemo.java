package chapter10;

public class ProductionWorkerDemo {

	public static void main(String[] args) {
		ProductionWorker worker1 = new ProductionWorker();
		worker1.setEmployeeNumber("453-B");
		worker1.setHireDate("05-12-2019");
		worker1.setHourlyPay(19.99);
		worker1.setName("John West");
		worker1.setShift(2);
		System.out.println(worker1);
		
		ProductionWorker worker2 = new ProductionWorker("Alex Jones", "955-D", "12-18-2019", 1, 14.50);
		System.out.println();
		System.out.println(worker2);
	}

}
