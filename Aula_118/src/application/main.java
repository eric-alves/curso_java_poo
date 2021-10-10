package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class main {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter department's name: ");
		String departmentName = sc.nextLine();
		System.out.println("Enter worker data:");
		System.out.print("Name: ");
		String workerName = sc.nextLine();
		System.out.print("Level: ");
		String workerLevel = sc.nextLine();
		System.out.print("Base salary: ");
		double baseSalary = sc.nextDouble();
		
		Worker worker = new Worker(workerName, 
				WorkerLevel.valueOf(workerLevel), 
				baseSalary,
				new Department(departmentName));
		
		System.out.print("How many contracts to this worker? ");
		int n = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter coontract #" + n + " data:");
			System.out.print("Date (DD/MM/YYY): ");
			Date contractDate = sdf.parse(sc.nextLine());
			System.out.print("Value per hours: ");
			double value = sc.nextDouble();
			sc.nextLine();
			System.out.print("Duration (Hours): ");
			int hours = sc.nextInt();
			sc.nextLine();
			
			HourContract contract = new HourContract(contractDate, value, hours);
			worker.addContract(contract);
		}
		
		System.out.print("Enter month and year to calculate income (MM/YYYY):");
		String monthAndYear = sc.nextLine();
		int month  = Integer.parseInt(monthAndYear.substring(0, 2));
		int year  = Integer.parseInt(monthAndYear.substring(3));
		System.out.println("Nome: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.println("Income for: " + monthAndYear + ": " + worker.income(year, month));
		
		sc.close();
	}

}
