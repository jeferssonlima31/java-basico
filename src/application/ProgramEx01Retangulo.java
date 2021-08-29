package application;

import java.util.Locale;
import java.util.Scanner;

import entities.RetanguloEx01;

public class ProgramEx01Retangulo {
	// CLASSE PRINCIPAL QUE CHAMA OS MÉTODOS DA CLASSE RetanguloEx01
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		RetanguloEx01 retangulo = new RetanguloEx01();
		System.out.println("Enter rectangle width and height:");
		retangulo.width = sc.nextDouble();
		retangulo.height = sc.nextDouble();

		System.out.println(retangulo);

		sc.close();

	}

}
