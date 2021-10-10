package entities;

public class Company extends TaxPlayer {
	private int numberOfDeployees;
	
	public Company() {
	}

	public Company(int numberOfDeployees, String name, Double anualIncome) {
		super(name, anualIncome);
		this.numberOfDeployees = numberOfDeployees;
	}
	
	public int getNumberOfDeployees() {
		return numberOfDeployees;
	}

	public void setNumberOfDeployees(int numberOfDeployees) {
		this.numberOfDeployees = numberOfDeployees;
	}

	@Override
	public double tax() {
		double sum = 0;
		if (numberOfDeployees < 10) {
			sum = sum + getAnualIncome()*0.16;
		} else {
			sum = sum + getAnualIncome()*0.14;
		}
		
		return sum;
	}
	
}
