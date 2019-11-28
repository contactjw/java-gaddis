package chapter6;

public class EmployeeDemo {

	public static void main(String[] args) {
		Employee emp1 = new Employee("Susan Meyers", 47899, "Accounting", "Vice President");
		Employee emp2 = new Employee("Mark Jones", 39119);
		Employee emp3 = new Employee();
		
		emp2.setDepartment("IT");
		emp2.setPosition("Programmer");
		
		emp3.setName("Joy Rogers");
		emp3.setIdNumber(81774);
		emp3.setDepartment("Manufacturing");
		emp3.setPosition("Engineer");
		
		System.out.println("Name\t\t  ID Number\t\tDepartment\t\tPosition");
		System.out.println("-------------------------------------" +
						   "-----------------------------------------");

		System.out.println(emp1.getName() + "\t  " + emp1.getIdNumber() + "\t\t\t" + 
						   emp1.getDepartment() + "\t\t" + emp1.getPosition());
		System.out.println(emp2.getName() + "\t  " + emp2.getIdNumber() + "\t\t\t" + 
				   emp2.getDepartment() + "\t\t\t" + emp2.getPosition());
		System.out.println(emp3.getName() + "\t  " + emp3.getIdNumber() + "\t\t\t" + 
				   emp3.getDepartment() + "\t\t" + emp3.getPosition());
	}
}
