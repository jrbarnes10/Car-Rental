// ---------------------
// Author: India Sohal |
// Date: 11/1/2017     |
// ---------------------

public class Car {
	public enum Category {
		SUV, CROSSOVER, SEDAN, TRUCK, COUPE, HYBRID, VAN
	}

	public enum Comfort {
		POOR, MED, GOOD
	}

	private String make, model;
	protected int mpg, seats, costPerDay;
	protected Comfort comfortLevel;

	Car(String make, String model, Category category, int mpg) {
		this.make = make;
		this.model = model;
		this.mpg = mpg;

		switch (category) {
			case SUV: case CROSSOVER: case TRUCK:
				seats = 5;
				costPerDay = 55;
				comfortLevel = Comfort.GOOD;
				break;
			case SEDAN: case HYBRID:
				seats = 4;
				costPerDay = 50;
				comfortLevel = Comfort.MED;
				break;
			case COUPE:
				seats = 4;
				costPerDay = 45;
				comfortLevel = Comfort.POOR;
				break;
			case VAN:
				seats = 7;
				costPerDay = 70;
				comfortLevel = Comfort.MED;
				break;
		}

	}

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public int getMPG() {
		return mpg;
	}

	public int getSeats() {
		return seats;
	}

	public int getCost() {
		return costPerDay;
	}

	public Comfort getComfortLevel() {
		return comfortLevel;
	}

	public String toString() {
		return "Make: " + make + ", Model: " + model + ", Seats: " + seats + "\n";
	}

}
