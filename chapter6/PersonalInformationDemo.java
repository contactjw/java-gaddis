package chapter6;

public class PersonalInformationDemo {
	public static void main(String[] args) {
		PersonalInformation me = new PersonalInformation("John West", "2664 Ontario Dr.", 24, "9124235456");
		PersonalInformation linda = new PersonalInformation("Linda Le", "Livermore");
		PersonalInformation nick = new PersonalInformation();
		
		linda.setAge(20);
		linda.setPhoneNumber("9259141422");
		
		nick.setName("Nick Marino");
		nick.setAddress("Morris");
		nick.setAge(24);
		nick.setPhoneNumber("8159242030");
		
		System.out.println("Information Display");
		System.out.println("---------------------");
		System.out.println(me.getName() + "\t" + me.getAddress() + "\t" + 
						   me.getAge() + "\t" + me.getPhoneNumber());
		System.out.println(linda.getName() + "\t" + linda.getAddress() + "\t\t" + 
						   linda.getAge() + "\t" + linda.getPhoneNumber());
		System.out.println(nick.getName() + "\t" + nick.getAddress() + "\t\t\t" + 
				   nick.getAge() + "\t" + nick.getPhoneNumber());	
	}
}
