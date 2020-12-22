package org.crazycoder.prototype;

public class Car extends Vehicle{
	// Check is it luxury or hybrid etc
	private String type;


	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Car [type=" + type + ", FuelType=" + getFuelType() + ", EngineCapacity=" + getEngineCapacity()
				+ "]";
	}

	
}
