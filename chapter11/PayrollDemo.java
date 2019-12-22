package chapter11;

public class PayrollDemo {
	public static void main(String[] args) {
		
		
		try {
			
			Payroll employee1 = new Payroll();
			employee1.setEmployeeName("Jackson Jacobs");
			employee1.setIdNumber(23424);
			employee1.setHourlyPay(23.00);
			employee1.setHoursWorked(40);
			
			System.out.println("Employee Pay Information");
			System.out.println("------------------------");
			System.out.println("Employee Name: " + employee1.getEmployeeName());
			System.out.println("Employee ID: " + employee1.getIdNumber());
			System.out.printf("Employee Hourly Pay Rate: $%.2f", employee1.getHourlyPay());
			System.out.printf("\nEmployee Hours Worked: %.1f", employee1.getHoursWorked());
			System.out.printf("\nEmployee Gross Pay: $%.2f", employee1.getGrossPay());
			
			Payroll newEmployee = new Payroll("John Smith", 1234524);
			
			newEmployee.setHourlyPay(16.50);
			newEmployee.setHoursWorked(40);
			
			System.out.println("Employee Pay Information");
			System.out.println("------------------------");
			System.out.println("Employee Name: " + newEmployee.getEmployeeName());
			System.out.println("Employee ID: " + newEmployee.getIdNumber());
			System.out.printf("Employee Hourly Pay Rate: $%.2f", newEmployee.getHourlyPay());
			System.out.printf("\nEmployee Hours Worked: %.1f", newEmployee.getHoursWorked());
			System.out.printf("\nEmployee Gross Pay: $%.2f", newEmployee.getGrossPay());
		
			
		} catch (InvalidStringException | InvalidNumberException e) {
			System.out.println(e.getMessage());
		}
	}
}
