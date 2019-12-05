package chapter7;
import java.util.ArrayList;
import java.util.Scanner;

public class PhoneBookDemo {

	public static void main(String[] args) {
		String name = "";
		String phone = "";
		
		PhoneBook entry1 = new PhoneBook("John White", "925-922-0528");
		PhoneBook entry2 = new PhoneBook("Arthur Bedford", "324-569-0234");
		PhoneBook entry3 = new PhoneBook("Max Halloway", "630-423-9123");
		PhoneBook entry4 = new PhoneBook();
		PhoneBook entry5 = new PhoneBook();
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter name for entry 4: ");
		name = keyboard.nextLine();
		System.out.print("Enter phone number for entry 4: ");
		phone = keyboard.nextLine();
		entry4.setName(name);
		entry4.setPhoneNumber(phone);
		
		System.out.print("Enter name for entry 5: ");
		name = keyboard.nextLine();
		System.out.print("Enter phone number for entry 5: ");
		phone = keyboard.nextLine();
		entry5.setName(name);
		entry5.setPhoneNumber(phone);
		
		// Define an arrayList of PhoneBooks
		ArrayList<PhoneBook> phoneBook = new ArrayList<PhoneBook>();
		phoneBook.add(entry1);
		phoneBook.add(entry2);
		phoneBook.add(entry3);
		phoneBook.add(entry4);
		phoneBook.add(entry5);
		
		
		System.out.println();
		for (int i = 0; i < phoneBook.size(); i++) {
			System.out.println("Entry " + (i + 1));
			System.out.println("Name: " + phoneBook.get(i).getName());
			System.out.println("Phone Number: " + phoneBook.get(i).getPhoneNumber());
			System.out.println();
		}
		
		
	}

}
