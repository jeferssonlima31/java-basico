package entities;

/*
 * CONTA BANCARIA COM SEUS ATRIBUTOS, CONSTRUTORES, MÉTODOS GETS AND SETS E 
 * FORMATO DE EXIBIÇÃO.
 */
public class AccountEx {
	private int number;
	private String name;
	private double balance;

	public AccountEx() {

	}

	public AccountEx(int number, String name) {

		this.number = number;
		this.name = name;

	}

	public AccountEx(int number, String name, double initialValue) {

		this.number = number;
		this.name = name;
		deposit(initialValue);
	}

	public int getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double deposit) {
		balance += deposit;
	}

	public void withdrawAccount(double withdraw) {

		balance = balance - withdraw - 5;

	}

	@Override
	public String toString() {
		return "Account " + getNumber() + ", Holder: " + getName() + ", Balance: $ "
				+ String.format("%.2f", getBalance());

	}

}
