package br.edu.facthus.polimorfismo;

import java.math.BigDecimal;
import java.util.ArrayList;

import br.edu.facthus.polimorfismo.exemplos.A;
import br.edu.facthus.polimorfismo.exemplos.B;
import br.edu.facthus.polimorfismo.exemplos.C;
import br.edu.facthus.polimorfismo.exercicio.Gerente;

public class Main {
	
	public static void ex01() {
		B b1 = new B();
		b1.m();
		
		C c1 = new C();
		c1.m();
		
		A x = new B();
		x.m();
		
		A y = new C();
		y.m();
	}
	
	public static void ex02() {
		ArrayList<A> lista = new ArrayList<>();
		
		lista.add(new B());
		lista.add(new B());
		lista.add(new C());
		lista.add(new C());
		lista.add(new C());
		
		for (A a : lista)
			a.m();
	}
	
	public static void exercicio() {
		Gerente gerente = new Gerente("Maria da Silva",
				new BigDecimal(1000), new BigDecimal(800));
		
		gerente.imprimeSalario();
	}

	public static void main(String[] args) {
		// ex01();
		// ex02();
		exercicio();
	}

}
