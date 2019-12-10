package chapter8;

public class PoliceOfficer {
	private String officerName;
	private String badgeNumber;
	private ParkedCar car;
	private ParkingMeter meter;
	private ParkingTicket ticket;
	
	public PoliceOfficer(String name, String badge) {
		officerName = name;
		badgeNumber = badge;
	}
	
	public void setOfficerName(String name) {
		officerName = name;
	}
	
	public String getOfficerName() {
		return officerName;
	}
	
	public void setBadgeNumber(String badge) {
		badgeNumber = badge;
	}
	
	public String getBadgeNumber() {
		return badgeNumber;
	}
	
	public String checkMeter(ParkedCar c, ParkingMeter m) {
		car = new ParkedCar(c);
		meter = new ParkingMeter(m);
		String str = "";
		
		if (car.getMinutesParked() > meter.getMinutesPurchased()) {
			ticket = new ParkingTicket(car.getMinutesParked(), car, officerName, badgeNumber);
			str = giveTicket();
		}
		else {
			str = "Your vehicle is ticket free!";
		}
		return str;
	}
	
	public String giveTicket() {
		return ticket.issueTicket();
	}
	
}
