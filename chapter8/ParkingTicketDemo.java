package chapter8;

public class ParkingTicketDemo {

	public static void main(String[] args) {
		ParkedCar car = new ParkedCar("Toyota", "Prius", "Grey", "8DDM367", 180);
		
		ParkingMeter meter = new ParkingMeter(60);
		
	    PoliceOfficer officer = new PoliceOfficer("Joe Friday", "4788");
	    
	    System.out.println(officer.checkMeter(car, meter));
		
	}
}
