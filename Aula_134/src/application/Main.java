package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPlayer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<TaxPlayer> taxPlayers = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Tax payer #" + i+1 + " data:");
			System.out.print("Individual or company (i/c)? ");
			String iORc = sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			Double income = sc.nextDouble();
			if (iORc.equals("i")) {
				System.out.print("Health expenditures: ");
				Double health = sc.nextDouble();
				sc.nextLine();
				Individual individual = new Individual(health, name, income);
				taxPlayers.add(individual);
			} else {
				System.out.print("Number of employees: ");
				int employees = sc.nextInt();
				sc.nextLine();
				Company company = new Company(employees, name, income);
				taxPlayers.add(company);
			}
		}
		
		System.out.println("TAXES PAID:");
		Double total = 0.0;
		for (TaxPlayer t : taxPlayers) {
			System.out.println(t.getName() + ": " + t.tax());
			total += t.tax();
		}
		
		System.out.println("TOTAL TAXES: $ " + total);
	}

}
