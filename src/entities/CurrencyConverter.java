package entities;

public class CurrencyConverter {
	public static double IOF = 6.0;

	public static double amount(double prace, double quantity) {
		double soma = prace * quantity;
		soma += soma * IOF / 100;
		return soma;
	}
}
