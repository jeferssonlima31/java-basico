package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProgramLista {

	public static void main(String[] args) {
		//ESTACIA UMA LISTA
		List<String> list = new ArrayList<>();
		//ADICINA A LISTA 
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Ana");
		list.add(2, "Marcos");

		/// MOSTRA O TAMANHO DA LISTA
		System.out.println(list.size());

		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("-----------------------");

		// REMOVE DA LISTA QUALQUER PALVRA INICIADA COM A LETRA M
		list.removeIf(x -> x.charAt(0) == 'M');

		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("-----------------------");
		// COMPARA SE EXISTE UMA PALAVRA IGUAL A OUTRA NA LISTA
		System.out.println("idex of Bob: " + list.indexOf("Bob"));
		System.out.println("index of Marcos " + list.indexOf("Marcos"));

		System.out.println("-----------------------");

		// PROCURA TODAS AS PALAVRAS DA LSITA QUE COMEÇA COM A LETRA A.
		List<String> result = list.stream().filter(A -> A.charAt(0) == 'A').collect(Collectors.toList());
		for (String x : result) {
			System.out.println(x);
		}

		System.out.println("-----------------------");
		// ENCONTRA O PRIMERA PALAVRA DA LISTA COM A LETRA A
		String name = list.stream().filter(A -> A.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);

	}

}
