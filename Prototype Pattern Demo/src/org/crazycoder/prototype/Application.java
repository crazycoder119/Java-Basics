package org.crazycoder.prototype;

public class Application {

	public static void main(String[] args) {
		
		/**
		 * In here we have to put attention on do we need to use swallow copy or we need to use deep copy
		 * https://javaconceptoftheday.com/difference-between-shallow-copy-vs-deep-copy-in-java/#:~:text=Default%20version%20of%20clone%20method%20creates%20the%20shallow%20copy%20of,to%20other%20objects%20as%20fields.
		 * if the object we are going to clone has inside objects then we have to use deep copy
		 * Student has courses object 
		 * If we clone student object then student1 and student2 has same courses object so changes done to student1 affect student2
		 * Student studen2 = student1.clone();
		 * student2.courses = student1.courses.clone()
		 * now they have seperate course objects 
		 */
		
		Registry registry =  new Registry();
		Bus bus = (Bus) registry.getVehicle(VehicleType.BUS);
		System.out.println(bus);
		bus.setNumberOfSeats(20);
		System.out.println(bus);
		Bus bus1 = (Bus) registry.getVehicle(VehicleType.BUS);
		System.out.println(bus1);
	}

}
