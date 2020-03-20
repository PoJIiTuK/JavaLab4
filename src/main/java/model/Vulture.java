package model;

public class Vulture extends AbstractAnimals {
	private double wingspanInCentimeters;

	public double getWingspanInCentimeters() {
		return wingspanInCentimeters;
	}

	public void setWingspanInCentimeters(double wingspanInCentimeters) {
		this.wingspanInCentimeters = wingspanInCentimeters;
	}

	public Vulture(int FoodConsumedInKilo, String kind, double sizeInM, int weightInKg, String point, int ageInYears,
			boolean huntForPrey, double wingspanInCentimeters) {
		super(FoodConsumedInKilo, sizeInM, kind, weightInKg, point, ageInYears, huntForPrey);
		this.wingspanInCentimeters = wingspanInCentimeters;
	}

}
