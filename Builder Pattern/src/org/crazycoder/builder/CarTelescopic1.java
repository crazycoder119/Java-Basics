package org.crazycoder.builder;

public class CarTelescopic1 {
	String insurance;
	Boolean etc;
	String roadAssistence;
	String dropOffLocation;
	
	public CarTelescopic1(String insurance) {
		this.insurance = insurance;
	}

	public CarTelescopic1(String insurance, Boolean etc) {
		this(insurance);
		this.etc = etc;
	}

	public CarTelescopic1(String insurance, Boolean etc, String roadAssistence) {
		this(insurance, etc);
		this.roadAssistence = roadAssistence;
	}

	public CarTelescopic1(String insurance, Boolean etc, String roadAssistence, String dropOffLocation) {
		this(insurance, etc, roadAssistence); 
		this.dropOffLocation = dropOffLocation;
	}

	@Override
	public String toString() {
		return "CarTelescopic1 [insurance=" + insurance + ", etc=" + etc + ", roadAssistence=" + roadAssistence
				+ ", dropOffLocation=" + dropOffLocation + "]";
	}
	
}
