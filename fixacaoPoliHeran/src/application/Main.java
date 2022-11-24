package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for (int i = 1; i<=n; i++) {
		
			System.out.println("Tax payer " + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();
			if (ch == 'i') {
				System.out.print("Health expeditures: ");
				double healthExpediture = sc.nextDouble();
				list.add(new Individual(name, anualIncome, healthExpediture));
			}
			else {
				System.out.print("Number of Employee: ");
				int numberOfEmployee = sc.nextInt();
				list.add(new Company(name, anualIncome, numberOfEmployee));
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID:");
		for (TaxPayer tax : list) {
			System.out.println(tax.getName() + " - $ " + String.format("%.2f", tax.tax()));	
			
		}
		
		System.out.println();
		double sum = 0.0;
		for (TaxPayer tax : list) {
			sum += tax.tax();  
		}
		System.out.println("TOTAL TAXES: " + " - $ " + String.format("%.2f", sum));	
		
		sc.close();
	}
}

