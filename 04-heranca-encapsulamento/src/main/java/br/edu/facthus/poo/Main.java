package br.edu.facthus.poo;

import java.time.LocalDate;

public class Main {
	
	public static void exemplo01() {
		Funcionario f1 = new Funcionario(
				"João", 2000, LocalDate.of(2010, 3, 1));
		
		Funcionario f2 = new Funcionario(
				"Maria", 1500, LocalDate.of(2015, 12, 20));
		
		Gerente g1 = new Gerente(
				"Joana", 2500, LocalDate.of(2002, 7, 15), 500);
		
		f1.imprime();
		f2.imprime();
		g1.imprime();
	}

	public static void exemplo02() {
		int base = 100; // base escolhida pelo usuário
		int altura = 5; // altura escolhida pelo usuário
		
		Retangulo r1 = new Retangulo(base, altura);
		r1.imprime();
	}
	
	public static void exemplo03() {
		Retangulo r1 = new Retangulo(4, 3);
		r1.imprime();
		r1.imprimePerimetro();
		r1.imprimeArea();
		
		Quadrado q1 = new Quadrado(5);
		q1.imprime();
		q1.imprimePerimetro();
		q1.imprimeArea();
	}
	
	public static void exemplo04() {
		Retangulo r1 = new Retangulo(4, 3);
		r1.imprime();
		r1.imprimePerimetro();
		r1.imprimeArea();
		
		Retangulo q1 = new Quadrado(5);
		q1.imprime();
		q1.imprimePerimetro();
		q1.imprimeArea();
	}
	
	public static void main(String[] args) {
		// exemplo01();
		// exemplo02();
		// exemplo03();
		exemplo04();
	}

}
