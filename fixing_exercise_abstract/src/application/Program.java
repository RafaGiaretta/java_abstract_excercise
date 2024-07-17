package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.CompanyPayer;
import entities.IndividualPayer;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double totalTaxes = 0.0;
		List<TaxPayer> list = new ArrayList<>();
		
		System.out.println("Enter the number of tax payers: ");
		int n = sc.nextInt();
		for (int i = 0; i < n ; i++) {
			System.out.println("Individual or company (i/c) ?");
			char payerType = sc.next().charAt(0);
			if (payerType == 'i') {
				sc.nextLine();
				System.out.println("Name: ");
				String name = sc.nextLine();
				System.out.println("Anual income: ");
				double anualIncome = sc.nextDouble();
				System.out.println("Health expenditures: ");
				double healthExpend = sc.nextDouble();
				TaxPayer payer = new IndividualPayer(name, anualIncome, healthExpend);
				totalTaxes += payer.taxesPaid();
				list.add(payer);

			}
			else {
				sc.nextLine();
				System.out.println("Name: ");
				String name = sc.nextLine();
				System.out.println("Anual income: ");
				double anualIncome = sc.nextDouble();
				System.out.println("Number of employees: ");
				int  numberEmployees = sc.nextInt();
				TaxPayer payer = new CompanyPayer(name, anualIncome, numberEmployees);
				totalTaxes += payer.taxesPaid();
				list.add(payer);
			}
		}
		
		System.out.println("TAXES PAID: ");
		for (TaxPayer payer : list) {
			System.out.println(payer);
		}
		System.out.printf("\nTOTAL TAXES: %.2f", totalTaxes);
		
		sc.close();
	}

}
