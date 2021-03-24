package br.edu.facthus.poo;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
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

}
