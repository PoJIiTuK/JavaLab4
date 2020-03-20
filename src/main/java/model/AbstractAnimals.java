package model;

public abstract class AbstractAnimals {
	private int FoodConsumedInKilo;
	private String kind;
	private double sizeInM;
	private int weightInKg;
	private String point;
	private int ageInYears;
	public boolean huntForPrey;

	public AbstractAnimals(int foodConsumedInKilo) {
		FoodConsumedInKilo = foodConsumedInKilo;
	}

	public int getFoodConsumedInKilo() {
		return FoodConsumedInKilo;
	}

	public void setFoodConsumedInKilo(int foodConsumedInKilo) {
		FoodConsumedInKilo = foodConsumedInKilo;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public double getSizeInM() {
		return sizeInM;
	}

	public void setSizeInSm(double sizeInM) {
		this.sizeInM = sizeInM;
	}

	public int getWeightInKg() {
		return weightInKg;
	}

	public void setWeightInKg(int weightInKg) {
		this.weightInKg = weightInKg;
	}

	public String getPoint() {
		return point;
	}

	public void setPoint(String point) {
		this.point = point;
	}

	public int getAgeInYears() {
		return ageInYears;
	}

	public void setAgeInYears(int ageInYears) {
		this.ageInYears = ageInYears;
	}

	public boolean isHuntForPrey() {
		return huntForPrey;
	}

	public void setHuntForPrey(boolean huntForPrey) {
		this.huntForPrey = huntForPrey;
	}

	public AbstractAnimals(int foodConsumedInKilo, double sizeInM, String kind, int weightInKg, String point,
			int ageInYears, boolean huntForPrey) {
		FoodConsumedInKilo = foodConsumedInKilo;
		this.sizeInM = sizeInM;
		this.kind = kind;
		this.weightInKg = weightInKg;
		this.point = point;
		this.ageInYears = ageInYears;
		this.huntForPrey = huntForPrey;
	}

	@Override
	public String toString() {
		return "AbstractAnimals [FoodConsumedInKilo=" + FoodConsumedInKilo + ", kind=" + kind + ", sizeInM=" + sizeInM
				+ ", weightInKg=" + weightInKg + ", point=" + point + ", ageInYears=" + ageInYears + ", huntForPrey="
				+ huntForPrey + "]";
	}

}


