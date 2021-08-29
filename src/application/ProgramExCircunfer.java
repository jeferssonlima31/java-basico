package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CaculatorEX;

public class ProgramExCircunfer {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	

		System.out.println("Enter radius value: ");
		double radius = sc.nextDouble();

		double c = CaculatorEX .circunference(radius);
		double v =CaculatorEX .volume(radius);

		System.out.printf("Circuference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", CaculatorEX .PI);

		sc.close();

	}

}
