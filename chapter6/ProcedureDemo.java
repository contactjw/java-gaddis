package chapter6;

import java.util.Scanner;

// This class uses the PatientCharges and Procedure classes
public class ProcedureDemo {
	public static void main(String[] args) {
		String firstName;
		String middleName;
		String lastName;
		String address;
		String city;
		String state;
		int zip;
		String phoneNumber;
		String emergencyName;
		String emergencyPhone;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter patient first name: ");
		firstName = keyboard.nextLine();
		
		System.out.print("Enter patient middle name: ");
		middleName = keyboard.nextLine();
		
		System.out.print("Enter patient last name: ");
		lastName = keyboard.nextLine();
		
		System.out.print("Enter patient street address: ");
		address = keyboard.nextLine();
		
		System.out.print("Enter patient city: ");
		city = keyboard.nextLine();
		
		System.out.print("Enter patient state: ");
		state = keyboard.nextLine();
		
		System.out.print("Enter patient zip code: ");
		zip = keyboard.nextInt();
		
		keyboard.nextLine();
		
		System.out.print("Enter patient phone number: ");
		phoneNumber = keyboard.nextLine();
		
		System.out.print("Enter patient emergency contact name: ");
		emergencyName = keyboard.nextLine();
		
		System.out.print("Enter patient emergency contact phone number: ");
		emergencyPhone = keyboard.nextLine();
		
		
		PatientCharges patient1 = new PatientCharges(firstName, middleName, lastName, address, city, state,
													 zip, phoneNumber, emergencyName, emergencyPhone);
		
		System.out.println("\nPatient Information");
		System.out.println("Patient Name: " + patient1.getName());
		System.out.println("Patient Address: " + patient1.getAddress());
		System.out.println("Patient Phone Number: " + patient1.getPhoneNumber());
		System.out.println("Patient Emergency Contact: " + patient1.getEmergencyContact());
		
		Procedure procedure1 = new Procedure("Physical Exam", "November 30, 2019", "Dr. Irvine" , 250.00);
		Procedure procedure2 = new Procedure("X-ray", "November 30, 2019", "Dr. Jamison", 500.00);
		Procedure procedure3 = new Procedure();
		
		procedure3.setProcedureName("Blood test");
		procedure3.setDate("November 30, 2019");
		procedure3.setPractitioner("Dr. Smith");
		procedure3.setCharges(200.00);
		
		System.out.println("\nProcedure #1:");
		System.out.println("-------------");
		System.out.println("Procedure name:\n" + procedure1.getProcedureName());
		System.out.println("Date: " + procedure1.getDate());
		System.out.println("Practitioner: " + procedure1.getPractitioner());
		System.out.println("Charge: " + procedure1.getCharges());
		
		System.out.println("\nProcedure #2:");
		System.out.println("-------------");
		System.out.println("Procedure name:\n" + procedure2.getProcedureName());
		System.out.println("Date: " + procedure2.getDate());
		System.out.println("Practitioner: " + procedure2.getPractitioner());
		System.out.println("Charge: " + procedure2.getCharges());
		
		System.out.println("\nProcedure #3:");
		System.out.println("-------------");
		System.out.println("Procedure name:\n" + procedure3.getProcedureName());
		System.out.println("Date: " + procedure3.getDate());
		System.out.println("Practitioner: " + procedure3.getPractitioner());
		System.out.println("Charge: " + procedure3.getCharges());
		
		keyboard.close();
	}
}
