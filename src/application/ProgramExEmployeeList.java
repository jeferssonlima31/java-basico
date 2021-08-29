package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.EmployeeListEx;

public class ProgramExEmployeeList {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		//PRICIPAL CLASS FROM EMPLOYEE CLASS, HERE WE CREATED A LIST OF EMPLOYEE IN ALL YOUR LOGIC
		List<EmployeeListEx> list = new ArrayList<>();

		System.out.print("how many employee will be  registred?");
		int N = sc.nextInt();

		for (int i = 1; i <= N; i++) {
			System.out.println("Employee #" + i + ":");

			System.out.print("ID: ");
			Integer number = sc.nextInt();

			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();

			System.out.print("Salary: ");
			Double salary = sc.nextDouble();

			EmployeeListEx employee = new EmployeeListEx(number, name, salary);
			list.add(employee);
			System.out.println("-----------------------------------------------------");
		}

		System.out.println("List of employee:");
		for (EmployeeListEx x : list) {
			System.out.println(x);
		}
		System.out.println("-----------------------------------------------------");
		System.out.println();
		System.out.println("how ID Salary incriase");
		int idsalary = sc.nextInt();

		Integer pos = position(list, idsalary);
		if (pos == null) {
			System.out.println("This ID does not exist");
		} else {
			System.out.println("Enter porcentage");
			Double percentage = sc.nextDouble();
			list.get(pos).increase(percentage);
		}
		System.out.println("-----------------------------------------------------");
		System.out.println();
		System.out.println("List of Employees:");
		for (EmployeeListEx x : list) {
			System.out.println(x);
		}

		sc.close();
	}

	public static Integer position(List<EmployeeListEx> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;

	}
}
