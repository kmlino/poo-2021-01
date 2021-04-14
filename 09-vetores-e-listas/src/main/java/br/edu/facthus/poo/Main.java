package br.edu.facthus.poo;

import java.util.ArrayList;

public class Main {
	
	public static void exemplo01() {
		Integer[] vetor = new Integer[3];
		
		vetor[0] = 2;
		vetor[1] = 4;
		vetor[2] = 8;
		
		System.out.println("Utilizando for:");
		for (int i = 0; i < vetor.length; ++i)
			System.out.println(vetor[i]);
		
		System.out.println("\nUtilizando for each:");
		for (Integer elemento : vetor)
			System.out.println(elemento);
		
	}
	
	public static void exemplo02() {
		String[] vetor = {"abc", "def", "ghi"};
		
		System.out.println("Utilizando for:");
		for (int i = 0; i < vetor.length; ++i)
			System.out.println(vetor[i]);
		
		System.out.println("\nUtilizando for each:");
		for (String elemento : vetor)
			System.out.println(elemento);
	}
	
	public static void exemplo03() {
		String[] vetor = {"abc", "def", "ghi"};
		
		System.out.println("Impressão direta:");
		for (int i = 0; i < vetor.length; ++i)
			System.out.print(vetor[i]);
		
		System.out.println("\nUtilizando variável:");
		String s = "";
		for (String elemento : vetor)
			s += elemento;
						
		System.out.println(s);
	}
	
	public static void exemplo04() {
		ArrayList<Integer> lista = new ArrayList<>();
		
		lista.add(2);
		lista.add(4);
		lista.add(8);
		
		System.out.println("Utilizando for:");
		for (int i = 0; i < lista.size(); ++i)
			System.out.println(lista.get(i));
		
		System.out.println("\nUtilizando for each:");
		for (Integer elemento : lista)
			System.out.println(elemento);
	}
	
	public static void exemplo05() {
		ArrayList<String> lista = new ArrayList<>();
		
		lista.add("AA");
		lista.add("AB");
		lista.add("AC");
		
		System.out.println("Utilizando for:");
		for (int i = 0; i < lista.size(); ++i)
			System.out.println(lista.get(i));
		
		lista.remove("AB");
		
		System.out.println("\nUtilizando for each:");
		for (String elemento : lista)
			System.out.println(elemento);
	}
	
	// Retorna:
	// true - se vetor e lista têm os mesmos elementos
	// false - caso contrário
	// Considerar que não há elementos repetidos
	public static boolean mesmosElementos(Integer[] vetor,
			ArrayList<Integer> lista) {
		// Se tamanhos diferentes, retorna false
		if (vetor.length != lista.size())
			return false;
		
		for (Integer i : vetor) {
			if (!lista.contains(i))
				return false;
		}
		
		return true;
	}
	
	public static void exercicio01() {
		Integer[] v = {2, 1, 3};
		
		ArrayList<Integer> l = new ArrayList<>();
		l.add(1);
		l.add(2);
		l.add(3);
		
		System.out.println(mesmosElementos(v, l));
	}

	public static void main(String[] args) {
		// exemplo01();
		// exemplo02();
		// exemplo03();
		// exemplo04();
		// exemplo05();
		
		exercicio01();
		

	}

}
