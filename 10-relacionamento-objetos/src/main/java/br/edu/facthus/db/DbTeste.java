package br.edu.facthus.db;

import java.util.ArrayList;
import java.util.List;

import br.edu.facthus.model.Corretor;
import br.edu.facthus.model.Pessoa;

public class DbTeste {
	
	private static List<Pessoa> proprietarios = 
			new ArrayList<>();
	
	private static List<Corretor> corretores =
			new ArrayList<>();
	
	public static void acrescentaProprietario(Pessoa pessoa) {
		proprietarios.add(pessoa);
	}
	
	public static void acrescentaCorretor(Corretor corretor) {
		corretores.add(corretor);
	}
	
	public static List<Pessoa> listaProprietarios() {
		return proprietarios;
	}
	
	public static List<Corretor> listaCorretores() {
		return corretores;
	}
	
	public static void imprimeProprietarios() {
		for (Pessoa p : proprietarios) 
			System.out.printf("Proprietário: %s\n", p.getNome());
	}
	
	public static void imprimeCorretores() {
		for (Corretor c : corretores)
			System.out.printf("Corretor: %s\n", c.getNome());
	}

}
