package org.crazycoder.prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {
	private Map<VehicleType, Vehicle> vehicles = new HashMap<>();

	public Registry() {
		this.initialize();
	}
	
	public Vehicle getVehicle(VehicleType vehicleType) {
		Vehicle vehicle=null;
		try {
			vehicle = (Vehicle) vehicles.get(vehicleType).clone();
		} catch (CloneNotSupportedException cloneNotSupportedException) {
			System.out.println("Clone not support exception" +cloneNotSupportedException);
		}
		return vehicle;
	}
	
	
	private void initialize() {
		Car car = new Car();
		car.setEngineCapacity(2000);
		car.setFuelType("diesel");
		car.setType("hybrid");
		
		Bus bus = new Bus();
		bus.setEngineCapacity(1000);
		bus.setFuelType("diesel");
		bus.setNumberOfSeats(50);
		
		vehicles.put(VehicleType.CAR, car);
		vehicles.put(VehicleType.BUS, bus);
	}
	
	
	
}
