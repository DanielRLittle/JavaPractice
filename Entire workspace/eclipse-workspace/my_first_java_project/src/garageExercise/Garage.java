package garageExercise;

import java.util.*;

public class Garage {
	
	public static void main(String[] args) {



		ArrayList<Vehicle> vehicleList = new ArrayList<Vehicle>();

		Vehicle vec1 = new Bike(false, 2, 1);
		vehicleList.add(vec1);

		Vehicle vec2 = new Bike(true, 3, 2);
		vehicleList.add(vec2);

		Vehicle vec3 = new Car("Large", 4, 5);
		vehicleList.add(vec3);

		Vehicle vec4 = new Bus(2, 4, 60);
		vehicleList.add(vec4);

		Garage g = new Garage();
		g.bill(vec1);
		
		
	}

	public float bill(Vehicle vec) {
		float finalB = 0;
		String typey = vec.vehType();
		switch (typey) {
		case "Bike":{
			finalB += 50;
			}
			break;
		case "Car":

			break;
		case "Bus":

			break;
		default:
			break;

		}
		System.out.println(finalB);
		return finalB;
	}
}
