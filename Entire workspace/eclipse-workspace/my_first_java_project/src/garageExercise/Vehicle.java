package garageExercise;

public abstract class Vehicle {
	protected int wheelNumber;
	protected int seats;
	protected String type;
	
	public Vehicle(int wheelNumber, int seats) {
		this.wheelNumber = wheelNumber;
		this.seats = seats;

	}
	
	public abstract String vehType();
	public abstract void drive();
	public abstract void wheelNum();
	public abstract int getWheelNum();
	public abstract String getSize();
	public abstract int getFloors();
	public abstract int getSeats();
	public abstract void printing();
	public abstract boolean isBike4Road(); 
	

}