package entities;

public class Individual extends TaxPlayer {
	private Double healthExpenditures;
	
	public Individual(Double healthExpenditures) {
	}

	public Individual(Double healthExpenditures, String name, Double anualIncome) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public double tax() {
		double sum = 0;
		if (getAnualIncome() < 2000.00) {
			sum = sum + getAnualIncome()*0.15;
		} else {
			sum = sum + getAnualIncome()*0.25;
		}
		sum = sum - healthExpenditures*0.5;
		
		return sum;
	}
	
}
