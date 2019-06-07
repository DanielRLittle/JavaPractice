package garageExercise;

public class Bike extends Vehicle {
	private boolean road;
	
	public Bike(boolean road, int wheelNumber, int seats) {
		super(wheelNumber, seats);
		this.road = road;
		type = "Bike";
	}
	
	public void drive() {
		System.out.println("nyowww!");
	}
	public void wheelNum() {
		System.out.println("This bike has " + wheelNumber + " wheels.");
	}

	public int getWheelNum() {		
		int x = this.wheelNumber;
		return x;
	}

	public String getSize() {
		return null;
	}

	public int getFloors() {
		System.out.println(0);
		return 0;
	}

	public int getSeats() {
		int x = this.seats;
		System.out.println(x);
		return x;
	}

	@Override
	public String vehType() {
		System.out.println(this.type);
		return this.type;
	}

	@Override
	public void printing() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isBike4Road() {
		boolean x = this.road;
		System.out.println(x);
		return x;
	}
}
