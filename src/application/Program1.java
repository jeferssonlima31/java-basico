package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle1;

public class Program1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Triangle1 x = new Triangle1();
		Triangle1 y = new Triangle1();

		System.out.println("entre com o tamanho do triangolo x e y: ");
		double areaX = 0;
		double areay = 0;

		char letra = 'x';
		while (letra == 'x' || letra == 'y') {

			for (int i = 0; i < 6; i++) {
				letra = sc.next().charAt(0);
				double entrada = sc.nextDouble();
				if (letra == 'x' || letra == 'X') {
					x.a = entrada;
					x.b = entrada;
					x.c = entrada;
					areaX = x.area();
				} else {
					y.a = entrada;
					y.b = entrada;
					y.c = entrada;
					areay = y.area();
				}
			}
			System.out.printf("Triangle X area: %.4f%n", areaX);
			System.out.printf("Triangle Y area: %.4f%n", areay);

			if (areaX > areay) {
				System.out.println("Larger area: X");
			} else {
				System.out.println("Larger area: Y");
			}
			}
			System.out.println("letra errada");
		sc.close();

	}

}
