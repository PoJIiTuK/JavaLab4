package model;

import model.MagnitudeOfPoints;

public class Cheetah extends AbstractAnimals {

	private MagnitudeOfPoints numberBlackSpots;

	public MagnitudeOfPoints getNumberBlackSpots() {
		return numberBlackSpots;
	}

	public void setNumberBlackSpots(MagnitudeOfPoints numberBlackSpots) {
		this.numberBlackSpots = numberBlackSpots;
	}

	public Cheetah(int FoodConsumedInKilo, String kind, double sizeInM, int weightInKg, String point, int ageInYears,
			boolean huntForPrey, MagnitudeOfPoints numberBlackSpots) {
		super(FoodConsumedInKilo, sizeInM, kind, weightInKg, point, ageInYears, huntForPrey);
		this.numberBlackSpots = numberBlackSpots;
	}
}
