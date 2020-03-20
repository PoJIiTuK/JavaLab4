package model;

public class Lion extends AbstractAnimals {

	private int sizeOfManeInSm;

	public int getSizeOfManeInCentimeters() {
		return sizeOfManeInSm;
	}

	public void setSizeOfManeIn—entimeters(int sizeOfManeInCentimeters) {
     	this.sizeOfManeInSm = sizeOfManeInCentimeters;
	}
	public Lion(int FoodConsumedInKilo, String kind, double sizeInSm, int weightInKg, String point, int ageInYears,
			boolean huntForPrey, int sizeOfManeInCentimeters, int sizeOfManeInSm) {
          super(FoodConsumedInKilo, sizeInSm, kind, weightInKg, point, ageInYears, huntForPrey);
		this.sizeOfManeInSm = sizeOfManeInSm;
		}


}