package entities;

public class CompanyPayer extends TaxPayer {

	private Integer employees;
	
	public CompanyPayer(String name, Double anualIncome) {
		super(name, anualIncome);
	}

	public CompanyPayer(String name, Double anualIncome, Integer employees) {
		super(name, anualIncome);
		this.employees = employees;
	}

	public Integer getEmployees() {
		return employees;
	}

	public void setEmployees(Integer employees) {
		this.employees = employees;
	}

	@Override
	public Double taxesPaid() {

		if (employees > 10) {
			return anualIncome * 0.14;
		}
		else {
			return anualIncome * 0.16;
		}
	}
	public String toString() {
		return  name + ": $ " + String.format("%.2f", taxesPaid());
	}
	
	
	

}
