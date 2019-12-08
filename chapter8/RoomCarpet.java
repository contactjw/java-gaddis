package chapter8;

public class RoomCarpet {
	
	private RoomDimension room;
	private double costPerSquareFt;
	
	public RoomCarpet(RoomDimension newRoom, double cost) {
		room = new RoomDimension(newRoom);
		costPerSquareFt = cost;
	}
	
	public double getTotalCost() {
		return room.getArea() * costPerSquareFt;
	}
	
	public String toString() {
		return "Room Area: " + room.getArea() + "\nCost Per Square Ft: $" + costPerSquareFt +
				"\nTotal Cost of Carpet: $" + getTotalCost();
	}
}
