package org.crazycoder.builder;

public class Car {

	private final String insurance;
	private final Boolean etc;
	private final String roadAssistence;
	private final String dropOffLocation;
	
	public Car(Builder builder) {
		this.insurance=builder.insurance;
		this.etc=builder.etc;
		this.roadAssistence=builder.roadAssistence;
		this.dropOffLocation=builder.dropOffLocation;
	}
	
	static class Builder{
		private	String insurance;
		private Boolean etc;
		private String roadAssistence;
		private String dropOffLocation;
		
		
		public Car build() {
			return new Car(this);
		}
		
		public Builder(String insurance) {
			this.insurance= insurance;
		}
		
		public  Builder etc(Boolean etc) {
			this.etc = etc;
			return this;
		}
		
		public  Builder roadAssistence(String roadAssistence) {
			this.roadAssistence = roadAssistence;
			return this;
		}
		
		public  Builder dropOffLocation(String dropOffLocation) {
			this.dropOffLocation = dropOffLocation;
			return this;
		}
		
	}

	@Override
	public String toString() {
		return "Car [insurance=" + insurance + ", etc=" + etc + ", roadAssistence=" + roadAssistence
				+ ", dropOffLocation=" + dropOffLocation + "]";
	}
	
	
	
}
