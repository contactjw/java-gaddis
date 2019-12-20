package chapter10;

public class ShipDemo {

	public static void main(String[] args) {
		final int NUM_SHIPS = 4;
		Ship[] ship = new Ship[NUM_SHIPS];
		
		ship[0] = new CargoShip("Bronze Boy", "1995", 1200);
		ship[1] = new Ship("Sea Mother", "2013");
		ship[2] = new CruiseShip("Party At Sea", "2016", 1500);
		ship[3] = new CruiseShip("Festivities", "2019", 2000);
		
		for (int i = 0; i < ship.length; i++) {
			System.out.println(ship[i]);
			System.out.println();
		}
			
	}

}
