package org.crazycoder.builder;

public class CarTelescopic2 {
	String insurance;
	Boolean etc;
	String roadAssistence;
	String dropOffLocation;
	
	public CarTelescopic2(String insurance, Boolean etc, String roadAssistence, String dropOffLocation) {
		super();
		this.insurance = insurance;
		this.etc = etc;
		this.roadAssistence = roadAssistence;
		this.dropOffLocation = dropOffLocation;
	}
	
	public CarTelescopic2(String insurance, Boolean etc, String roadAssistence) {
		this(insurance, etc, roadAssistence, null);
	}
	
	public CarTelescopic2(String insurance, Boolean etc) {
		this(insurance, etc, null);
	}
	
	public CarTelescopic2(String insurance) {
		this(insurance, null);
	}

	@Override
	public String toString() {
		return "CarTelescopic2 [insurance=" + insurance + ", etc=" + etc + ", roadAssistence=" + roadAssistence
				+ ", dropOffLocation=" + dropOffLocation + "]";
	}
	
}
