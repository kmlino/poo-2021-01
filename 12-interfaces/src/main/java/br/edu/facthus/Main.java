package br.edu.facthus;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Main {
	
	public static void ex01() {
		List<String> lista = new ArrayList<>();
		
		lista.add("abc");
		lista.add("def");
		lista.add("ghi");
		
		lista.remove(0);
		
		System.out.println("size = " + lista.size());
		
		for (String s : lista)
			System.out.println(s);
	}
	
	public static void ex02() {
		List<String> lista = new LinkedList<>();
		
		lista.add("abc");
		lista.add("def");
		lista.add("ghi");
		
		lista.remove(0);
		
		System.out.println("size = " + lista.size());
		
		for (String s : lista)
			System.out.println(s);		
	}
	
	public static void ex03() {
		List<String> lista = new Stack<>();
		
		lista.add("abc");
		lista.add("def");
		lista.add("ghi");
		
		lista.remove(0);
		
		System.out.println("size = " + lista.size());
		
		for (String s : lista)
			System.out.println(s);		
	}
	
	public static void ex04() {
		TesteDAO dao = new TesteDAOImplB();
		
		Teste t = new Teste();
		
		dao.insere(t);
		dao.busca(1);
		dao.atualiza(t);
		dao.remove(t);
	}
	
	public static void main(String[] args) {
//		System.out.println("Ex 01:");
//		ex01();
//		
//		System.out.println("\nEx 02:");
//		ex02();
//		
//		System.out.println("\nEx 03:");
//		ex03();
		
		ex04();
	}

}
