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
		
		System.out.println();
		ShiftSupervisor supervisor1 = new ShiftSupervisor();
		supervisor1.setName("Brian Urlacher");
		supervisor1.setEmployeeNumber("231-G");
		supervisor1.setHireDate("09-06-2014");
		supervisor1.setAnnualSalary(200000.00);
		supervisor1.setAnnualBonus(150000.00);
		System.out.println(supervisor1);
		
		System.out.println();
		TeamLeader leader1 = new TeamLeader();
		leader1.setName("Jack Brown");
		leader1.setEmployeeNumber("324-F");
		leader1.setHourlyPay(30.00);
		leader1.setHireDate("04/02/2013");
		leader1.setShift(2);
		leader1.setMonthlyBonus(4000);
		leader1.setRequiredTrainingHours(90);
		leader1.setHoursTaken(40);
		System.out.println(leader1);
		
	}

}
