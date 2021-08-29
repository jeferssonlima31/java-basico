package application;

import java.util.Locale;
import java.util.Scanner;

import entities.VetorProgram;

public class ProgramVect {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N  = sc.nextInt();
		 VetorProgram []vect = new  VetorProgram[N];
		 
		 for(int i = 0; i <vect.length;i++) {
			 sc.nextLine();
			 String name = sc.nextLine();
			 double price = sc.nextDouble();
			 vect[i] = new VetorProgram(name, price);
			 
		 }
		double sum = 0.0;
		for(int i = 0; i<vect.length; i++) {
			sum += vect[i].getPrice();
			
		}
		double media = sum/N;
		System.out.printf("Average height: %.2f%n", media);
		sc.close();
	}

}
