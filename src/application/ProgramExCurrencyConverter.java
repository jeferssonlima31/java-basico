package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

public class ProgramExCurrencyConverter {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("What is a dollar price? ");
		double price = sc.nextDouble();
		System.out.print("How many dollars price will be  bought? ");
		double quantity = sc.nextDouble();

		System.out.printf("Amout to be paid in reais = %.2f%n", CurrencyConverter.amount(price, quantity));

		sc.close();

	}

}
