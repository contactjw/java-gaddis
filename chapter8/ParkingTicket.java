package chapter8;

public class ParkingTicket {
	private double fine;
	private ParkedCar car;
	private PoliceOfficer officer;
	
	public ParkingTicket(int minOver, ParkedCar c, String name, String badge) {
		if (minOver > 60) {
			fine = 25.00;
			minOver -= 60;
			minOver /= 60;
			fine += minOver * 10.00;
		}
		car = new ParkedCar(c);
		officer = new PoliceOfficer(name, badge);
	}
	
	public double getFine() {
		return fine;
	}
	
	public String getCarInfo() {
		return car.toString();
	}
	
	public String issueTicket() {
		String ticket;
		ticket = "Ticket Amount $" + getFine() + "\nVehicle Information: " + getCarInfo() +
				 "\nOfficer: " + officer.getOfficerName() + "\nBadgeNumber: " + officer.getBadgeNumber();
		return ticket;
	}
}
