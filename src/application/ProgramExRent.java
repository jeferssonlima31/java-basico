package application;

import java.util.Scanner;

import entities.RentRoomsEx;

public class ProgramExRent {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("How many rooms will be rent: ");
		int N = sc.nextInt();
		System.out.println("-----------------------------------------------------------------");
		RentRoomsEx[] vect = new RentRoomsEx[10];

		sc.nextLine();
		for (int i = 1; i <= N; i++) {

			System.out.println("Rent #" + i + " :");
			System.out.print("Name:  ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room:  ");
			int room = sc.nextInt();
			sc.nextLine();
			vect[room] = new RentRoomsEx(name, email);
			System.out.println("-----------------------------------------------------------------");
		}
		System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
		System.out.println("-----------------------------------------------------------------");
		System.out.println("Busy rooms: ");
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] != null) {
				System.out.print("Room: "+i + ":");
				System.out.println(vect[i]);
			}
		}

		sc.close();
	}

}
