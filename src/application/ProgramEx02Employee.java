package application;

import java.util.Locale;
import java.util.Scanner;

import entities.EmployeeEx02;

public class ProgramEx02Employee {
	//CLASSE PRINCIPAL  DA CLASSE EMPLOYEEEX02
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		EmployeeEx02 employee = new EmployeeEx02();
		System.out.print("Name: ");
		employee.name = sc.nextLine();
		System.out.print("Gross Salary: ");
		employee.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		employee.tax = sc.nextDouble();

		System.out.println("Employee" + employee);
		System.out.print("Which percentage  to increase in salary? ");
		double percentage = sc.nextDouble();
		employee.increaseSalary(percentage);

		System.out.println("updated data: " + employee);

		sc.close();

	}

}
