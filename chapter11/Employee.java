package chapter11;

public class Employee {
	private String employeeName;
	private String employeeNumber;
	private String hireDate;
	
	public Employee() {
		employeeName = "";
		employeeNumber = "";
		hireDate = "";
	}
	
	public Employee(String n, String num, String hd) throws InvalidEmployeeNumber{
		boolean properNumber = true;
		
		for (int i = 0; i < 3; i++) {
			if (!Character.isDigit(num.charAt(i))) {
				properNumber = false;
			}
		}
		if (!(num.charAt(3) == '-'))
			properNumber = false;
			
		if (num.charAt(4) < 'A' || num.charAt(4) > 'M')
			properNumber = false;
		
		if (properNumber == false) {
			throw new InvalidEmployeeNumber();
		}
		else
			employeeNumber = num;
		
		employeeName = n;
		
		hireDate = hd;
	}
	
	public void setName(String n) {
		employeeName = n;
	}
	
	public void setEmployeeNumber(String num) throws InvalidEmployeeNumber{
		boolean properNumber = true;
		
		for (int i = 0; i < 3; i++) {
			if (!Character.isDigit(num.charAt(i))) {
				properNumber = false;
			}
		}
		if (!(num.charAt(3) == '-'))
			properNumber = false;
			
		if (num.charAt(4) < 'A' || num.charAt(4) > 'M')
			properNumber = false;
		
		if (properNumber == false) {
			throw new InvalidEmployeeNumber();
		}
		else
			employeeNumber = num;
	}
	
	public void setHireDate(String hd) {
		hireDate = hd;
	}
	
	public String getName() {
		return employeeName;
	}
	
	public String getNumber() {
		return employeeNumber;
	}
	
	public String getHireDate() {
		return hireDate;
	}
	
	public String toString() {
		String info = 
				("Employee Name: " + employeeName +
				"\nEmployee Number: " + employeeNumber +
				"\nHire Date: " + hireDate);
		return info;
	}
}