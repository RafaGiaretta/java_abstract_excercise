package entities;

public abstract class TaxPayer {
	
	protected String name;
	protected Double anualIncome;
	protected Double healthExpenditures;
	
	public void Taxpayer() {
		
	}
	public TaxPayer(String name, Double anualIncome) {
		this.name = name;
		this.anualIncome = anualIncome;
	}

	public TaxPayer(String name, Double anualIncome, Double healthExpenditures) {
		this.name = name;
		this.anualIncome = anualIncome;
		this.healthExpenditures = healthExpenditures;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnualIncome() {
		return anualIncome;
	}

	public void setAnualIncome(Double anualIncome) {
		this.anualIncome = anualIncome;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	public abstract Double taxesPaid();
}
