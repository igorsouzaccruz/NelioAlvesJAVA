package application;

import java.util.Scanner;

import entities.Employee;

public class program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee emp = new Employee();
		System.out.println("Name: ");
		emp.name = sc.nextLine();
		System.out.println("Gross Salary ");
		emp.GrossSalary = sc.nextDouble();
		System.out.println("Tax: ");
		emp.Tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee: "+ emp);
		System.out.println();
		System.out.println("Which percentege to increse salary? ");
		double percentege = sc.nextDouble();
		emp.IncreaseSalary(percentege);
		
		System.out.println();
		System.out.println("Updated data: " + emp);
		sc.close();

	}

}
