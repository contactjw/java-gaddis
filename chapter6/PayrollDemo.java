package chapter6;

public class PayrollDemo {
	public static void main(String[] args) {
		Payroll newEmployee = new Payroll("John Smith", 140823);
		
		newEmployee.setHourlyPay(16.50);
		newEmployee.setHoursWorked(40);
		
		System.out.println("Employee Pay Information");
		System.out.println("------------------------");
		System.out.println("Employee Name: " + newEmployee.getEmployeeName());
		System.out.println("Employee ID: " + newEmployee.getIdNumber());
		System.out.printf("Employee Hourly Pay Rate: $%.2f", newEmployee.getHourlyPay());
		System.out.printf("\nEmployee Hours Worked: %.1f", newEmployee.getHoursWorked());
		System.out.printf("\nEmployee Gross Pay: $%.2f", newEmployee.getGrossPay());
	}
}
