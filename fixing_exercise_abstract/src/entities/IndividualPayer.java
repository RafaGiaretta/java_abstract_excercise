package entities;

public class IndividualPayer extends TaxPayer{
	

	public IndividualPayer(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome, healthExpenditures);
	}


	@Override
	public Double taxesPaid() {
		if (anualIncome < 20000.00) {
			return anualIncome * 0.5 - healthExpenditures * 0.5; 
		}
		else {
			return anualIncome * 0.25 - healthExpenditures * 0.5;
		}			
	}

	public String toString() {
		return  name + ": $ " + String.format("%.2f", taxesPaid());
	}
	
}
