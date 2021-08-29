package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product2;

// classe pricipal para add produtos em estoque
public class Program2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Name");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		

		Product2 product = new Product2(name, price);
		System.out.println();
		System.out.println("Product data:" + product);
		
		
		System.out.println();
		System.out.print("Enter the number of products to be add in stock: ");
		int quantity = sc.nextInt();
		product.addProduct(quantity);

		System.out.println("Update data:" + product);
		System.out.println();

		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removedProduct(quantity);
		System.out.println("Update data:" + product);

		sc.close();

	}

}
