package application;

import java.util.Locale;
import java.util.Scanner;

import entities.AlunoEx03;

public class ProgramEx03AlunoMedia {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		AlunoEx03 aluno = new AlunoEx03();

		aluno.name = sc.nextLine();
		aluno.nota1 = sc.nextDouble();
		aluno.nota2 = sc.nextDouble();
		aluno.nota3 = sc.nextDouble();
		System.out.printf("FINAL GRADE: %.2f%n", aluno.media());

		if (aluno.media() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", aluno.missing());
		} else {
			System.out.println("PASS");
		}

	sc.close();
	}

}
