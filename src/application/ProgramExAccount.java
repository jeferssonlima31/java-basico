package application;

import java.util.Locale;
import java.util.Scanner;

import entities.AccountEx;
/*
 * PROGRAMA PRINCIPAL QUE FAZ A CHAMADA DOS MÉTODOS E CONTRUTORES DA CLASSE 
 * ACCOUNT
 */
public class ProgramExAccount {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		AccountEx account ;

		System.out.print("Enter  account number:");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter account holder: ");
		String name = sc.nextLine();

		System.out.print("Is there a initial value? (y/n) ");
		char resp = sc.next().charAt(0);

		if (resp == 'y') {
			System.out.print("Enter initial value: ");
			double balance = sc.nextDouble();

			account = new AccountEx(number, name, balance);

		} else {
			account = new AccountEx(number, name);

		}
		System.out.println("------------------------------------------------------------------");
		System.out.println("Account data: ");
		System.out.println(account);
		
		
		System.out.println("------------------------------------------------------------------");
		System.out.print("Enter a deposit value: ");
		double deposit = sc.nextDouble();
		account.deposit(deposit);
		System.out.println("Udated account data:");
		System.out.println(account);
		
		
		System.out.println("------------------------------------------------------------------");
		System.out.print("Enter a withdraw value: ");
		double withdraw = sc.nextDouble();
		account.withdrawAccount(withdraw);
		System.out.println("Udated account data:");
		System.out.println(account);
		System.out.println("------------------------------------------------------------------");

		sc.close();

	}

}
