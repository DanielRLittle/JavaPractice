package garageExercise;

public class Bus extends Vehicle{
	private int floors;
	
	public Bus(int floors, int wheelNumber, int seats) {
		super(wheelNumber, seats);
		this.floors = floors;
		type = "Bus";
		
	}
	
	public void drive() {
		System.out.println("*Bus noise*");
	}
	public void wheelNum() {
		System.out.println("This bus has " + wheelNumber + " wheels.");
	}

	public int getWheelNum() {
		
		int x = this.wheelNumber;
		System.out.println(x);
		return x;
	}


	public String getSize() {
		return null;
	}

	public int getFloors() {
		int x = this.floors;
		System.out.println(x);
		return x;
	}

	public int getSeats() {
		int x = this.seats;
		System.out.println(x);
		return x;
	}

	public void printing() {
		
	}

	public String vehType() {
		System.out.println("Bus");
		return "Bus";
	}

	@Override
	public boolean isBike4Road() {
		// TODO Auto-generated method stub
		return false;
	}
}
