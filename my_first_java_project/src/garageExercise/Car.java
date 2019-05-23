package garageExercise;

public class Car extends Vehicle {
	
	private String size;
	
	public Car (String size, int wheelNumber, int seats) {
		super(wheelNumber, seats);
		this.size = size;
		type = "Car";
	}
	
	public void drive() {
		System.out.println("Vrummmm...");
	}
	public void wheelNum() {
		System.out.println("This car has " + wheelNumber + " wheels.");
	}

	public int getWheelNum() {
		int x = this.wheelNumber;
		System.out.println(x);
		return wheelNumber;
	}


	public String getSize() {
		String x = this.size;
		System.out.println(x);
		return x;
	}

	public int getFloors() {
		System.out.println(1);
		return 1;
	}

	public int getSeats() {
		int x = this.seats;
		System.out.println(x);
		return x;
	}

	@Override
	public String vehType() {
		System.out.println("Car");
		return "Car";
	}

	@Override
	public void printing() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isBike4Road() {
		// TODO Auto-generated method stub
		return false;
	}

}
